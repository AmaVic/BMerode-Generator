package be.unamur.generator.context;

import be.unamur.metamodel.*;
import be.unamur.metamodel.Util;
import be.unamur.metamodel.extension.MerodeExtension;
import domain.IAR;

import java.util.*;
import java.util.stream.Collectors;

public class SpecificStateContextBuilder extends GeneralStateContextBuilder {
  private SpecificStateContext specificCtx;

  public SpecificStateContextBuilder(Mermaidmodel model, MerodeExtension ext, Metaobject object, String stateName) {
    super(model, ext, object);
    this.specificCtx = new SpecificStateContext();
    this.specificCtx.setStateName(stateName);
    this.specificCtx.setBOTName(this.object.getName());
  }

  @Override
  @SuppressWarnings("unchecked")
  public SpecificStateContext build() {
    //Building from General Context
    super.build();

    for(Object entryKey : this.ctx.getKeys())
      this.specificCtx.put((String)entryKey, this.ctx.get((String)entryKey));

    HashSet<SpecificStateMethod> methodsSet = new HashSet<SpecificStateMethod>();
    //Get List of allowed Methods (i.e. methods having "fromState" = the Current State)
    ArrayList<Metatransition> allowedTransitions = Util.getAllowedTransitions(this.object, (String)this.specificCtx.get("stateName"));
    for(Metatransition transition : allowedTransitions) {
      ArrayList<Metamethod> relatedMethods = new ArrayList<Metamethod>();
      for(Metatransitionmethod mtm : transition.getMetatransitionmethods().getMetatransitionmethod()) {
        Metamethod mm = Util.findById(this.model.getMetamodel().getMetamethods().getMetamethod(), mtm.getMethodid());
        relatedMethods.add(mm);

        Metaevent event = Util.findById(model.getMetamodel().getMetaevents().getMetaevent(), mm.getOwnereventid());
        Metafsm fsm = Util.getActiveFSM(this.object);
        Metastate targetState = Util.findById(fsm.getMetastates().getMetastate(), transition.getTargetstateid());
        SpecificStateMethod m = new SpecificStateMethod("handle_" + event.getName(), mm.getType(), targetState.getName());

        this.ext.getIARS().getIAR().stream()
                                   .filter(rule -> rule.getTransitionId().equals(transition.getId()) && rule.getMethodId().equals(mtm.getMethodid())) //Keep Only Relevant IARs
                                   .map(rule -> new IAR(rule.getRule(), rule.isAllowed())) //Create Runtime IAR based on Meta IAR
                                   .forEach(m::addIAR); //Add IAR to list of runtime IARs


        System.out.println("Tr: " + transition.getId() + " " + transition.getName() + "; IAR ? " + m.getIARs().size());

        methodsSet.add(m);
      }

    }

    for(SpecificStateMethod m : methodsSet) {
      this.specificCtx.addMethod(m);
    }

    Metastate state = Util.getStateFromName(this.object, (String)this.specificCtx.get("stateName"));
    this.specificCtx.setType(state.getType());

    //Loading masters'id
    //Add Masters Ids
    for(Metadependency dependency : model.getMetamodel().getMetadependencies().getMetadependency()) {
      if(!dependency.getDependent().equals(this.object.getId()))
        continue;

      Metaobject master = Util.findById(model.getMetamodel().getMetaobjects().getMetaobject(), dependency.getMaster());

      String dependencyType = dependency.getType();
      //@TODO: For now: no difference between mandatory/optional
      boolean limitedToOne = dependencyType.substring(dependencyType.indexOf("_")+1, dependencyType.length()).equals("1");

      this.specificCtx.addMasterBotRef(master, limitedToOne, dependency.getName());
      this.specificCtx.addMasterImport(master);
    }

    if(this.specificCtx.get("stateName").equals("initial"))
      this.specificCtx.put("stateName", "allocated");

    //Checking if there are MPCs
    boolean mpc;
    Metamultiplepropagationconstraint constraint = null;
    try {
      constraint = this.object.getMetamultiplepropagationconstraints().get(0).getMetamultiplepropagationconstraint().get(0);
      mpc = true;
    } catch(IndexOutOfBoundsException e) {
      mpc = false;
    }

    this.specificCtx.setMPCPresent(mpc);

    if(mpc) {
      for(Metamultiplepropagationconstraints mpcs : this.object.getMetamultiplepropagationconstraints()) {
        for(Metamultiplepropagationconstraint cstr : mpcs.getMetamultiplepropagationconstraint()) {
          this.specificCtx.addMPCCheckCode(MPCStringGenerator.generateMPCCheckCode(this.model.getMetamodel(), this.object, cstr));
          DependencyNodeBuilder dnb = new DependencyNodeBuilder(this.model.getMetamodel(), cstr, this.object, true);
          DependencyNodeBuilder dnbDis = new DependencyNodeBuilder(this.model.getMetamodel(), cstr, this.object, false);

          DependencyNode startingEnabledNode = dnb.getDependencyRootNode();
          DependencyNode startingDisabledNode = dnbDis.getDependencyRootNode();

          if (!startingEnabledNode.isLast()) {
            DependencyNode next = startingEnabledNode.next();
            while (!next.isLast()) {
              this.specificCtx.addMasterImport(next.getBOT());
              next = next.next();
            }
            this.specificCtx.addMasterImport(next.getBOT());
          }

          if (!startingDisabledNode.isLast()) {
            DependencyNode next = startingDisabledNode.next();
            while (!next.isLast()) {
              this.specificCtx.addMasterImport(next.getBOT());
              next = next.next();
            }
            this.specificCtx.addMasterImport(next.getBOT());
          }
        }
      }
    }

    return this.specificCtx;
  }

  private String buildDirectObjectFetcher(String dependent, String master) {
    return master + " " + be.unamur.generator.context.Util.getStringWithFirstLowerCap(dependent) + master + " = StubHelper.findBusinessObject(ctx, this." + be.unamur.generator.context.Util.getStringWithFirstLowerCap(master) + "Id);";
    //return master.getName() + " " + be.unamur.generator.context.Util.getStringWithFirstLowerCap(dependent.getName()) + master.getName() + " = " + "(" + master.getName() + ") StubHelper.findBusinessObject(ctx, " + "this." + new MasterRefAttribute(master).getName() +");";
  }

  private String buildInDirectObjectFetcher(String dependent, String master) {
    return master + " " + be.unamur.generator.context.Util.getStringWithFirstLowerCap(dependent) + master + " = StubHelper.findBusinessObject(ctx, " + be.unamur.generator.context.Util.getStringWithFirstLowerCap(dependent) + master + ".get" + master + "Id());";
    //return master.getName() + " " + be.unamur.generator.context.Util.getStringWithFirstLowerCap(dependent.getName()) + master.getName() + " = " + "(" + master.getName() + ") StubHelper.findBusinessObject(ctx, " + be.unamur.generator.context.Util.getStringWithFirstLowerCap(dependent.getName()) + master.getName() + ".get" + new MasterRefAttribute(master).getNameWithFirstCap() +"());";
  }

  @SuppressWarnings("unchecked")
  private ArrayList<String> buildConstraintsDirectLinks(Metamultiplepropagationconstraint mpc, Metaobject dependent) {
    System.out.println("Dependencies Building");
    ArrayList<String> fetchedLinks = new ArrayList<>();
    ArrayList<String> fetchedIndirectDirectLinks = new ArrayList<>();

    for(Metapath path : mpc.getMetapath()) {
      for (int i = path.getMetadependencyinpath().size()-1; i >= 0; i--) {
        Metadependencyinpath inPath = path.getMetadependencyinpath().get(i);
        Metadependency dependency = Util.findById(this.model.getMetamodel().getMetadependencies().getMetadependency(), inPath.getId());

        if(!dependency.getDependent().equals(this.object.getId()))
          continue;
        //System.out.println(dependency.getName());
        Metaobject master = Util.findById(model.getMetamodel().getMetaobjects().getMetaobject(), dependency.getMaster());
        Metaobject dpd = Util.findById(model.getMetamodel().getMetaobjects().getMetaobject(), dependency.getDependent());

        //DirectDependency dd = new DirectDependency(master, dependent);
        //System.out.println("DirectDep: " + dd);

        String[] depStr = dependency.getName().split("_");

        if(dpd.getId().equals(this.object.getId())) {
          fetchedLinks.add(this.buildDirectObjectFetcher(depStr[1], depStr[0]));
        }
        else {
          fetchedIndirectDirectLinks.add(this.buildInDirectObjectFetcher(depStr[1], depStr[0]));
        }


        fetchedLinks.addAll(fetchedIndirectDirectLinks);
      }
    }


    /*
    System.out.println("Filtered Deps Check:");
    HashSet<String> linksSet = new HashSet<>(fetchedLinks);
    for(String lnk : linksSet)
      System.out.println("--> " + lnk);
    return new ArrayList<String>(linksSet);*/
    return null;
  }
}
