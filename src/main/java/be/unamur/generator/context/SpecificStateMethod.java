package be.unamur.generator.context;

public class SpecificStateMethod {
  private final String name;
  private final String effectType;
  private final String targetStateName;

  public SpecificStateMethod(String name, String effectType, String targetStateName) {
    this.name = name;
    this.effectType = effectType;
    this.targetStateName = targetStateName;
  }

  public String getName() { return this.name; }
  public String getEffectType() { return this.effectType; }
  public String getTargetStateName() { return this.targetStateName; }
}
