package be.unamur.generator.context;

import org.apache.velocity.VelocityContext;

import java.util.ArrayList;

public class BusinessObjectTypeContext extends VelocityContext {
  public BusinessObjectTypeContext() {
    super();
    this.put("util", Util.class);
  }

  public void setName(String name) {
    this.put("name", name);
  }

  @SuppressWarnings("unchecked")
  public void addAttribute(Attribute attribute) {
    ArrayList<Attribute> attributes = this.get("attributes") == null ? new ArrayList<Attribute>() : (ArrayList<Attribute>)this.get("attributes");
    attributes.add(attribute);

    this.put("attributes", attributes);
  }

}
