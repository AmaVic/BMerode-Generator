package be.unamur.runtime;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RuntimeEpt {
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
      if(p.getBusinessEventName().equals(businessEventName) && p.getBusinessObjectName().equals(businessObjectName))
        return p;
    }

    return new Permission(businessObjectName, businessEventName, false);
  }
}
