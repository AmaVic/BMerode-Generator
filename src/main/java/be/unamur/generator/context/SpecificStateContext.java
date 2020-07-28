package be.unamur.generator.context;

import be.unamur.metamodel.Metaobject;

import java.util.ArrayList;

public class SpecificStateContext extends StateContext {
  public SpecificStateContext() { super(); }


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
  private void addMasterBotRef(Metaobject master) {
    ArrayList<String> masterRefs = this.get("masterRefs") == null ? new ArrayList<>() : (ArrayList<String>)this.get("masterRefs");
    masterRefs.add(Util.getStringWithFirstLowerCap(master.getName())+"Id");

    this.put("masterRefs",  masterRefs);
  }

}
