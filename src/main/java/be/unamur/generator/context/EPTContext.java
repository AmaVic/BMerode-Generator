package be.unamur.generator.context;

import be.unamur.metamodel.Ept;
import be.unamur.runtime.Permission;
import org.apache.velocity.VelocityContext;

import java.util.ArrayList;

public class EPTContext extends VelocityContext {
  public EPTContext() {
    super();
    this.put("permissions", new ArrayList<Permission>());
  }

  @SuppressWarnings("unchecked")
  public void addPermission(Permission p) {
    ArrayList<Permission> permissions = (ArrayList<Permission>)this.get("permissions");
    permissions.add(p);
    this.put("permissions", permissions);
  }
}
