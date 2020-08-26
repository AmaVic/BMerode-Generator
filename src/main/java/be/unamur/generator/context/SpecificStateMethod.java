package be.unamur.generator.context;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if(!(o instanceof SpecificStateMethod))
      return false;

    return this.equals((SpecificStateMethod)o);
  }

  public boolean equals(SpecificStateMethod method) {
    if(!this.getName().equals(method.getName()))
      return false;
    if(!this.getEffectType().equals(method.getEffectType()))
      return false;
    if(!this.getTargetStateName().equals(method.getTargetStateName()))
      return false;

    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getName(), this.getTargetStateName(), this.getEffectType());
  }
}
