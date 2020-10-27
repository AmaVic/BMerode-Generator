package be.unamur.generator.context;

import be.unamur.metamodel.Mermaidmodel;
import be.unamur.metamodel.Metaattribute;
import be.unamur.metamodel.Metadependency;
import be.unamur.metamodel.Metaobject;
import be.unamur.metamodel.Util;

public class BusinessObjectTypeContextBuilder implements ContextBuilder {
  private Metaobject metaobject;
  private BusinessObjectTypeContext ctx;
  private Mermaidmodel model;

  public BusinessObjectTypeContextBuilder(Metaobject o, Mermaidmodel model) {
    this.metaobject = o;
    this.ctx = new BusinessObjectTypeContext();
    this.model = model;
  }

  @Override
  public BusinessObjectTypeContext build() {
    this.ctx.setName(this.metaobject.getName());
    this.ctx.setIsParticipant(this.metaobject.isIsParticipant());

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

      this.ctx.addMasterIdAttribute(master);
    }


    return this.ctx;
  }

  private String getGeneralStateType() {
    return this.metaobject.getName() + "State";
  }
}
