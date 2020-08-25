package be.unamur.generator.context;

import be.unamur.metamodel.Metaobject;

import java.util.ArrayList;
import java.util.HashSet;

public class SpecificStateContext extends StateContext {
  public SpecificStateContext() {
    super();
    this.put("masters", new ArrayList<Master>());
    this.put("mastersImports", new HashSet<>());
    this.put("mpcChecks", new ArrayList<String>());
  }

  public void setMPCPresent(boolean mpc) {
    this.put("mpcPresent", mpc);
  }

  @SuppressWarnings("unchecked")
  public void addMPCCheckCode(String code) {
    ((ArrayList<String>)this.get("mpcChecks")).add(code);
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

  @SuppressWarnings("unchecked")
  public void addMasterImport(Metaobject master) {
    ((HashSet<String>)this.get("mastersImports")).add(master.getName());
  }

}
