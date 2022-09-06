package be.unamur.generator.context;

import be.unamur.metamodel.Metaobject;
import org.apache.velocity.VelocityContext;

import java.util.ArrayList;

public class BusinessObjectTypeContext extends VelocityContext {
  public BusinessObjectTypeContext() {
    super();
    this.put("util", Util.class);
    this.put("isParticipant", false);
  }

  public void setName(String name) {
    this.put("name", name);
  }
  public void setIsParticipant(boolean isParticipant) {
    this.put("isParticipant", isParticipant);
  }

  @SuppressWarnings("unchecked")
  public void addAttribute(Attribute attribute) {
    ArrayList<Attribute> attributes = this.get("attributes") == null ? new ArrayList<Attribute>() : (ArrayList<Attribute>)this.get("attributes");
    attributes.add(attribute);

    this.put("attributes", attributes);
  }

  public void addMasterIdAttribute(Metaobject master, String dependencyName) {
    MasterRefAttribute masterRef = new MasterRefAttribute(master, dependencyName);
    this.addAttribute(masterRef);
  }

}
