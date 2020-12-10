package be.unamur.generator.context;

import be.unamur.metamodel.*;
import be.unamur.metamodel.Util;
import be.unamur.metamodel.extension.MerodeExtension;

import java.util.ArrayList;

public class GeneralStateContextBuilder implements ContextBuilder {
  protected Mermaidmodel model;
  protected MerodeExtension ext;
  protected StateContext ctx;
  protected Metaobject object;

  public GeneralStateContextBuilder(Mermaidmodel model, MerodeExtension ext, Metaobject object) {
    this.model = model;
    this.ext = ext;
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
