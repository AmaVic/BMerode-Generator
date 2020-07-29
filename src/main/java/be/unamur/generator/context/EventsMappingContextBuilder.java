package be.unamur.generator.context;

import be.unamur.metamodel.Mermaidmodel;
import be.unamur.metamodel.Metaevent;
import be.unamur.metamodel.Metaobject;

public class EventsMappingContextBuilder implements ContextBuilder {
  private Mermaidmodel model;

  public EventsMappingContextBuilder(Mermaidmodel model) {
    this.model = model;
  }

  @Override
  public EventsMappingContext build() {
    EventsMappingContext ctx = new EventsMappingContext();
    for(Metaevent event : model.getMetamodel().getMetaevents().getMetaevent()) {
      ctx.addBusinessEvent(this.model, event);
    }

    for(Metaobject mo : model.getMetamodel().getMetaobjects().getMetaobject()) {
      ctx.addBOT(mo);
    }

    return ctx;
  }
}
