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
      Metamethod relatedMethod = Util.findById(this.model.getMetamodel().getMetamethods().getMetamethod(), transition.getMetatransitionmethods().getMetatransitionmethod().get(0).getMethodid());
      Metaevent event = Util.findById(model.getMetamodel().getMetaevents().getMetaevent(), relatedMethod.getOwnereventid());
      SpecificStateMethod m = new SpecificStateMethod("handle_"+event.getName(), relatedMethod.getType());
      this.specificCtx.addMethod(m);
    }

    if(this.specificCtx.get("stateName").equals("initial"))
      this.specificCtx.put("stateName", "allocated");

    return this.specificCtx;
  }
}
