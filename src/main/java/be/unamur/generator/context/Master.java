package be.unamur.generator.context;

public class Master {
  private String name;
  private boolean limitedToOne;

  public Master(String name, boolean limitedToOne) {
    this.name = name;
    this.limitedToOne = limitedToOne;
  }

  public String getName() { return this.name; }
  public boolean isLimitedToOne() { return this.limitedToOne; }
}
