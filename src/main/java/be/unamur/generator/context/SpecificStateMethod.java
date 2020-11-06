package be.unamur.generator.context;

import be.unamur.generator.iar.parser.IARComponentSplitter;
import domain.IAR;
import domain.IARPathElement;
import javafx.scene.shape.PathElement;

import java.util.*;

public class SpecificStateMethod {
  private final String name;
  private final String effectType;
  private final String targetStateName;
  private final List<IAR> iars;
  private final Map<IAR, ArrayList<IARPathElement>> leftHandSides;
  private final Map<IAR, ArrayList<IARPathElement>> rightHandSides;

  public SpecificStateMethod(String name, String effectType, String targetStateName) {
    this.name = name;
    this.effectType = effectType;
    this.targetStateName = targetStateName;
    this.iars = new ArrayList<>();
    this.leftHandSides = new HashMap<>();
    this.rightHandSides = new HashMap<>();
  }

  public String getName() { return this.name; }
  public String getEffectType() { return this.effectType; }
  public String getTargetStateName() { return this.targetStateName; }
  public List<IAR> getIARs() { return this.iars; }
  public List<IARPathElement> getLeftHandSides(IAR iar) { return this.leftHandSides.get(iar); }
  public List<IARPathElement> getRightHandSides(IAR iar) { return this.rightHandSides.get(iar); }

  public void addIAR(IAR iar) {
    this.iars.add(iar);
    this.build(iar);
  }

  private void build(IAR iar) {
    build(iar, true);
    build(iar, false);
  }

  private void build(IAR iar, boolean leftSide) {
    List<IARPathElement> elements = IARComponentSplitter.Companion.getPathElements(leftSide ? iar.getLeftHandSide() : iar.getRightHandSide());
    ArrayList<IARPathElement> elems;
    if (!(leftSide ? this.leftHandSides : this.rightHandSides).containsKey(iar)) {
      elems = new ArrayList<IARPathElement>();
      elems.addAll(elements);
      (leftSide ? this.leftHandSides : this.rightHandSides).put(iar, elems);
    } else {
      elems = (leftSide ? this.leftHandSides : this.rightHandSides).get(iar);
      elems.addAll(elements);
    }
  }

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

    for(int i = 0; i < this.iars.size(); i++)
      for(int j = 0;j < method.iars.size(); j++)
        if(!this.iars.get(i).equals(method.iars.get(j)))
          return false;

    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getName(), this.getTargetStateName(), this.getEffectType(), this.iars);
  }
}
