package be.unamur.generator.context;

public class BusinessEvent {
  private String name;
  private String effectType;
  private String ownerBOTClass;

  public BusinessEvent(String name, String effectType, String ownerBOTClass) {
    this.name = name;
    this.effectType = effectType;
    this.ownerBOTClass  = ownerBOTClass;
  }

  public String getName() { return this.name; }
  public String getEffectType() { return this.effectType; }
  public String getOwnerBOTClass() { return this.ownerBOTClass; }
}
