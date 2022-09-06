package be.unamur.generator.context;

import be.unamur.metamodel.Metaobject;

public class MasterRefAttribute extends Attribute {
  public MasterRefAttribute(Metaobject master, String dependencyName) {
    super("String", master.getName().substring(0, 1).toLowerCase() + master.getName().substring(1) + "Id" + "_" + dependencyName);
  }

  public boolean isMasterRef() { return true; }
}
