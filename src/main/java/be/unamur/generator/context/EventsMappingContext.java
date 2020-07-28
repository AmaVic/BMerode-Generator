package be.unamur.generator.context;

import be.unamur.metamodel.Metaevent;
import be.unamur.runtime.BusinessEvent;
import org.apache.velocity.VelocityContext;

import java.util.ArrayList;

public class EventsMappingContext extends VelocityContext {
  public EventsMappingContext() {
    super();
    this.put("events", new ArrayList<BusinessEvent>());
  }

  public void addBusinessEvent(Metaevent event) {
    String name = event.getName();
    //Retrieving Effect Type: find OWNED method related to the Metaevent
    //Retrieving Owner type: find business object type having an owned method for that BOT
  }
}
