package be.unamur.generator.context;

import be.unamur.metamodel.*;
import be.unamur.metamodel.extension.Authorization;
import be.unamur.metamodel.extension.MerodeExtension;

public class EPTContextBuilder implements ContextBuilder {
  private Mermaidmodel metamodel;
  private MerodeExtension ext;
  private EPTContext eptContext;

  public EPTContextBuilder(Mermaidmodel model, MerodeExtension ext) {
    this.metamodel = model;
    this.ext = ext;
    this.eptContext = new EPTContext();
  }

  @Override
  public EPTContext build() {
    for(Authorization auth: this.ext.getEPT().getAuthorization()) {
      Metaobject bot = be.unamur.metamodel.Util.findById(this.metamodel.getMetamodel().getMetaobjects().getMetaobject(), auth.getParticipantTypeId());
      Metaevent event = be.unamur.metamodel.Util.findById(this.metamodel.getMetamodel().getMetaevents().getMetaevent(), auth.getEventId());
      boolean allowed = auth.isAllowed();

      be.unamur.runtime.Permission runtimePermission = new be.unamur.runtime.Permission(bot.getName(), event.getName(), allowed);
      this.eptContext.addPermission(runtimePermission);
    }

    return this.eptContext;
  }
}
