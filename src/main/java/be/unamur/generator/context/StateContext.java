package be.unamur.generator.context;

import org.apache.velocity.VelocityContext;

import java.util.ArrayList;

public class StateContext extends VelocityContext {
  public StateContext() {
    super();
    this.put("util", Util.class);
  }

  public void setName(String name) {
    this.put("name", name);
  }

  public void setBOTName(String name) {
    this.put("BOTName", name);
  }

  public void setType(String stateType) {
    String normalizedType = null;
    if(stateType.equals("INITIAL_STATE"))
      normalizedType = "StateType.INITIAL";
    else if(stateType.equals("STATE"))
      normalizedType = "StateType.ONGOING";
    else
      normalizedType = "StateType.FINAL";

    this.put("stateType", normalizedType);
  }

  @SuppressWarnings("unchecked")
  public void addEventHandlingMethod(String businessEventName) {
    ArrayList<String> handlingMethods = this.get("handlingMethods") != null ? (ArrayList<String>)this.get("handlingMethods") : new ArrayList<String>();
    String handlingMethodName = "handle_"+businessEventName;
    handlingMethods.add(handlingMethodName);

    this.put("handlingMethods", handlingMethods);
  }

}
