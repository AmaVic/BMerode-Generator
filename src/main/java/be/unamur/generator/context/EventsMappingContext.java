package be.unamur.generator.context;

import be.unamur.metamodel.*;
import be.unamur.metamodel.Util;
import org.apache.velocity.VelocityContext;

import java.util.ArrayList;

public class EventsMappingContext extends VelocityContext {
  public EventsMappingContext() {
    super();
    this.put("events", new ArrayList<BusinessEvent>());
    this.put("bots", new ArrayList<String>());
  }

  @SuppressWarnings("unchecked")
  public void addBOT(Metaobject mo) {
    ArrayList<String> bots = (ArrayList<String>)this.get("bots");
    bots.add(mo.getName());

    this.put("bots", bots);
  }

  @SuppressWarnings("unchecked")
  public void addBusinessEvent(Mermaidmodel model, Metaevent event) {
    String name = event.getName();
    Metamethod relatedMethod = Util.getOwnedMethodFromEvent(model, event);
    String baseEffect = relatedMethod.getType();
    Metaobject owner = Util.findById(model.getMetamodel().getMetaobjects().getMetaobject(), relatedMethod.getOwnerobjectid());
    String ownerClass = owner.getName()+".class";

    String normalizedEffect = null;
    if(baseEffect.equals("CREATE"))
      normalizedEffect = "BusinessEvent.BusinessEventType.CREATE";
    else if(baseEffect.equals("MODIFY"))
      normalizedEffect = "BusinessEvent.BusinessEventType.MODIFY";
    else
      normalizedEffect = "BusinessEvent.BusinessEventType.END";

    BusinessEvent ev = new BusinessEvent(name, normalizedEffect, ownerClass);

    ArrayList<BusinessEvent> events = (ArrayList<BusinessEvent>)this.get("events");
    events.add(ev);
    this.put("events", events);
  }
}
