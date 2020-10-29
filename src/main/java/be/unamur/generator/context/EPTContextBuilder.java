package be.unamur.generator.context;

import be.unamur.metamodel.*;

public class EPTContextBuilder implements ContextBuilder {
  private Mermaidmodel metamodel;
  private EPTContext eptContext;

  public EPTContextBuilder(Mermaidmodel model) {
    this.metamodel = model;
    this.eptContext = new EPTContext();
  }

  @Override
  public EPTContext build() {
    for(Permission metaPermission: this.metamodel.getMetamodel().getEpt().getPermission()) {
      Metaobject bot = be.unamur.metamodel.Util.findById(this.metamodel.getMetamodel().getMetaobjects().getMetaobject(), metaPermission.getOwnerobjectid());
      Metaevent event = be.unamur.metamodel.Util.findById(this.metamodel.getMetamodel().getMetaevents().getMetaevent(), metaPermission.getOwnereventid());
      boolean allowed = metaPermission.isAllowed();

      be.unamur.runtime.Permission runtimePermission = new be.unamur.runtime.Permission(bot.getName(), event.getName(), allowed);
      this.eptContext.addPermission(runtimePermission);
    }

    return this.eptContext;
  }
}
