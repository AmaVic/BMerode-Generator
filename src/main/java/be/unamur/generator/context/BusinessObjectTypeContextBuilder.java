package be.unamur.generator.context;

import be.unamur.extension.MetaObjectExtension;
import be.unamur.metamodel.*;
import be.unamur.metamodel.Util;
import be.unamur.metamodel.extension.MerodeExtension;

public class BusinessObjectTypeContextBuilder implements ContextBuilder {
  private Metaobject metaobject;
  private BusinessObjectTypeContext ctx;
  private Mermaidmodel model;
  private MerodeExtension ext;

  public BusinessObjectTypeContextBuilder(Metaobject o, Mermaidmodel model, MerodeExtension ext) {
    this.metaobject = o;
    this.ctx = new BusinessObjectTypeContext();
    this.model = model;
    this.ext = ext;
  }

  @Override
  public BusinessObjectTypeContext build() {
    this.ctx.setName(this.metaobject.getName());
    this.ctx.setIsParticipant(MetaObjectExtension.INSTANCE.isParticipant(this.metaobject, ext));

    //Add Default Attributes on Top of Model Attributes
    Attribute currentState = new Attribute(this.getGeneralStateType(), "currentState", true);
    this.ctx.addAttribute(currentState);

    //Add Model Attributes
    for(Metaattribute attr : metaobject.getMetaattributes().getMetaattribute())
      this.ctx.addAttribute(new Attribute(attr.getType(), attr.getName()));

    //Add Masters Ids
    for(Metadependency dependency : model.getMetamodel().getMetadependencies().getMetadependency()) {
      if(!dependency.getDependent().equals(this.metaobject.getId()))
        continue;

      Metaobject master = Util.findById(model.getMetamodel().getMetaobjects().getMetaobject(), dependency.getMaster());

      this.ctx.addMasterIdAttribute(master, dependency.getName());
    }


    return this.ctx;
  }

  private String getGeneralStateType() {
    return this.metaobject.getName() + "State";
  }
}
