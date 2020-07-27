package be.unamur.metamodel;

import java.math.BigInteger;
import java.util.List;

public class Util {
  public static <ObjectType extends Identifiable> ObjectType findById(List<ObjectType> collection, BigInteger id) {
    for (ObjectType element : collection) {
      if (element.getId().equals(id))
        return element;
    }
    return null;
  }
}
