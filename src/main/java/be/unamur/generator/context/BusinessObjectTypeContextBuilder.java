package be.unamur.generator.context;

import be.unamur.metamodel.Metaattribute;
import be.unamur.metamodel.Metaobject;

public class BusinessObjectTypeContextBuilder implements ContextBuilder {
  private Metaobject metaobject;
  private BusinessObjectTypeContext ctx;

  public BusinessObjectTypeContextBuilder(Metaobject o) {
    this.metaobject = o;
    this.ctx = new BusinessObjectTypeContext();
  }

  @Override
  public BusinessObjectTypeContext build() {
    this.ctx.setName(this.metaobject.getName());

    //Add Default Attributes on Top of Model Attributes
    Attribute currentState = new Attribute(this.getGeneralStateType(), "currentState", true);
    ctx.addAttribute(currentState);

    //Add Model Attributes
    for(Metaattribute attr : metaobject.getMetaattributes().getMetaattribute())
      ctx.addAttribute(new Attribute(attr.getType(), attr.getName()));

    return this.ctx;
  }

  private String getGeneralStateType() {
    return this.metaobject.getName() + "State";
  }
}
