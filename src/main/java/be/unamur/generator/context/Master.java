package be.unamur.generator.context;

public class Master {
  private String name;
  private boolean limitedToOne;
  private String dependencyName;

  public Master(String name, boolean limitedToOne, String dependencyName) {
    this.name = name;
    this.limitedToOne = limitedToOne;
    this.dependencyName = dependencyName;
  }

  public String getName() { return this.name; }
  public boolean isLimitedToOne() { return this.limitedToOne; }
  public String getDependencyName() { return this.dependencyName; }
}
