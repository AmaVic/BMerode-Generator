package runtime;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class RuntimeEpt implements Iterable<Permission>{
  private HashSet<Permission> eptPermissions;

  public RuntimeEpt() {
    this.eptPermissions = new HashSet<>();
  }

  public void addPermission(Permission p) {
    this.eptPermissions.add(p);
  }

  //If no permission is found, by default the operation will be denied
  public Permission getPermission(String businessEventName, String businessObjectName) {
    for(Permission p: this.eptPermissions) {
      System.out.println("Current Permission Being Investigated: " + p);
      if(p.getBusinessEventName().equals(businessEventName) && p.getBusinessObjectName().equals(businessObjectName)) {
        System.out.println("Permission found in the setup");
        return p;
      }
    }

    System.out.println("Permission not found --> Return default (denied)");
    return new Permission(businessObjectName, businessEventName, false);
  }

  @Override
  public Iterator<Permission> iterator() {
    return this.eptPermissions.iterator();
  }
}
