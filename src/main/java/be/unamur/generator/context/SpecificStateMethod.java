package be.unamur.generator.context;

public class SpecificStateMethod {
  private final String name;
  private final String effectType;

  public SpecificStateMethod(String name, String effectType) {
    this.name = name;
    this.effectType = effectType;
  }

  public String getName() { return this.name; }
  public String getEffectType() { return this.effectType; }
}
