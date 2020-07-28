package be.unamur.generator.context;

import be.unamur.metamodel.*;
import be.unamur.metamodel.Util;

import java.util.ArrayList;

public class SpecificStateContextBuilder extends GeneralStateContextBuilder {
  private SpecificStateContext specificCtx;

  public SpecificStateContextBuilder(Mermaidmodel model, Metaobject object, String stateName) {
    super(model, object);
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

    //Get List of allowed Methods (i.e. methods having "fromState" = the Current State)
    ArrayList<Metatransition> allowedTransitions = Util.getAllowedTransitions(this.object, (String)this.specificCtx.get("stateName"));
    for(Metatransition transition : allowedTransitions) {
      System.out.println("Transition of " + this.object.getName() + ": " + transition.getName());
      ArrayList<Metamethod> relatedMethods = new ArrayList<Metamethod>();
      for(Metatransitionmethod mtm : transition.getMetatransitionmethods().getMetatransitionmethod())
        relatedMethods.add(Util.findById(this.model.getMetamodel().getMetamethods().getMetamethod(), mtm.getMethodid()));

      for(Metamethod relatedMethod : relatedMethods) {
        Metaevent event = Util.findById(model.getMetamodel().getMetaevents().getMetaevent(), relatedMethod.getOwnereventid());
        Metafsm fsm = Util.getActiveFSM(this.object);
        Metastate targetState = Util.findById(fsm.getMetastates().getMetastate(), transition.getTargetstateid());
        SpecificStateMethod m = new SpecificStateMethod("handle_" + event.getName(), relatedMethod.getType(), targetState.getName());
        this.specificCtx.addMethod(m);
      }
    }

    Metastate state = Util.getStateFromName(this.object, (String)this.specificCtx.get("stateName"));
    this.specificCtx.setType(state.getType());

    //Loading masters'id
    //Add Masters Ids
    for(Metadependency dependency : model.getMetamodel().getMetadependencies().getMetadependency()) {
      if(!dependency.getDependent().equals(this.object.getId()))
        continue;

      Metaobject master = Util.findById(model.getMetamodel().getMetaobjects().getMetaobject(), dependency.getMaster());

      this.specificCtx.addMasterBotRef(master);
    }


    if(this.specificCtx.get("stateName").equals("initial"))
      this.specificCtx.put("stateName", "allocated");

    return this.specificCtx;
  }
}
