package be.unamur.generator.context;

import java.util.Objects;

public class Attribute {
  private final String type;
  private final String name;
  private final boolean addedByDefault;

  public Attribute(String type, String name) {
    //@TODO: Remove
    if(type.equals("Date/Time"))
      type = "LocalDateTime";

    this.type = type;
    this.name = name;
    this.addedByDefault = false;
  }

  public Attribute(String type, String name, boolean addedByDefault) {
    //@TODO: Remove
    if(type.equals("Date/Time"))
      type = "LocalDateTime";

    this.type = type;
    this.name = name;
    this.addedByDefault = addedByDefault;
  }

  public String getType() { return this.type; }
  public String getName() { return this.name; }
  public boolean isAddedByDefault() { return this.addedByDefault; }
  public boolean isMasterRef() { return false; }

  public String getNameWithFirstCap() {
    return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1);
  }

  @Override
  public boolean equals(Object o) {
    if(!(o instanceof Attribute))
      return false;

    return this.equals((Attribute)o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getType(), this.getName());
  }

  private boolean equals(Attribute attr) {
    if(!(this.getType().equals(attr.getType())))
      return false;
    if(!(this.getName().equals(attr.getName())))
      return false;
    if(this.isAddedByDefault() != attr.isAddedByDefault())
      return false;
    if(this.isMasterRef() != attr.isMasterRef())
      return false;

    return true;
  }



}
