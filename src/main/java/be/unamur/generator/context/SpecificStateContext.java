package be.unamur.generator.context;

import be.unamur.metamodel.Metaobject;

import java.util.ArrayList;

public class SpecificStateContext extends StateContext {
  public SpecificStateContext() {
    super();
    this.put("masters", new ArrayList<String>());
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
  public void addMasterBotRef(Metaobject master) {
    ArrayList<String> masterRefs = this.get("masters") == null ? new ArrayList<>() : (ArrayList<String>)this.get("masters");
    masterRefs.add(Util.getStringWithFirstLowerCap(master.getName()));

    this.put("masters",  masterRefs);
  }

}
