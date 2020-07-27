package be.unamur.generator.context;

import org.apache.velocity.VelocityContext;

public interface ContextBuilder {
  /**
   * @return A VelocityContext containing all required information to generate files from template
   */
  public VelocityContext build();
}
