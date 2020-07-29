package be.unamur.generator.context;

import be.unamur.metamodel.Metaobject;

import java.util.ArrayList;

public class SpecificStateContext extends StateContext {
  public SpecificStateContext() {
    super();
    this.put("masters", new ArrayList<Master>());
  }


  public void setStateName(String stateName) {
    this.put("stateName", stateName);
  }

  @SuppressWarnings("unchecked")
  public void addMethod(SpecificStateMethod method) {
    ArrayList<SpecificStateMethod> methods = this.get("methods") == null ? new ArrayList<>() : (ArrayList<SpecificStateMethod>)this.get("methods");
    methods.add(method);

    this.put("methods",  methods);
  }

  @SuppressWarnings("unchecked")
  public void addMasterBotRef(Metaobject master, boolean limitedToOne) {
    ArrayList<Master> masterRefs = this.get("masters") == null ? new ArrayList<>() : (ArrayList<Master>)this.get("masters");
    masterRefs.add(new Master(Util.getStringWithFirstLowerCap(master.getName()), limitedToOne));

    this.put("masters",  masterRefs);
  }

}
