package be.unamur.generator.context;

import be.unamur.metamodel.Mermaidmodel;
import be.unamur.metamodel.Metaevent;
import be.unamur.metamodel.Metamethod;
import be.unamur.metamodel.Metaobject;
import be.unamur.metamodel.Util;

import java.math.BigInteger;
import java.util.ArrayList;

public class GeneralStateContextBuilder implements ContextBuilder {
  protected Mermaidmodel model;
  protected StateContext ctx;
  protected Metaobject object;

  public GeneralStateContextBuilder(Mermaidmodel model, Metaobject object) {
    this.model = model;
    this.object = object;
    this.ctx = new StateContext();
  }

  @Override
  public StateContext build() {
    this.ctx.setName(this.object.getName() + "State");
    this.ctx.setBOTName(this.object.getName());

    ArrayList<Metamethod> objectMethods = Util.getBOTMethods(this.model, this.object);
    for(Metamethod method : objectMethods) {
      if(!Util.isEnabled(this.model, method))
        continue;

      //Retrieve Business Event Name
      Metaevent event = Util.findById(model.getMetamodel().getMetaevents().getMetaevent(), method.getOwnereventid());
      this.ctx.addEventHandlingMethod(event.getName());
    }

    return this.ctx;
  }

}
