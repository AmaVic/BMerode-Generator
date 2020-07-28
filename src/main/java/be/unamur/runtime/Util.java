package be.unamur.runtime;

import com.owlike.genson.Genson;

import java.util.Map;

public class Util {
  private static final Genson genson = new Genson();

  @SuppressWarnings("unchecked")
  public static Map<String, Object> getJsonObject(String json) {
    return genson.deserialize(json, Map.class);
  }
}
