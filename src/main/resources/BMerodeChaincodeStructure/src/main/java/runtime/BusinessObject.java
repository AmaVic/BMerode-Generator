package runtime;

import runtime.State;
import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import com.owlike.genson.annotation.JsonIgnore;
import com.owlike.genson.ext.javadatetime.JavaDateTimeBundle;

import java.util.*;

import org.hyperledger.fabric.contract.Context;

public abstract class BusinessObject {
  @JsonIgnore
  protected final static Genson genson = new GensonBuilder().withBundle(new JavaDateTimeBundle()).useClassMetadata(true).useRuntimeType(true).create();

  private String id;

  public BusinessObject(String id) {
    this.id = id;
  }

  public BusinessObject() {
  }

  public BusinessObject(BusinessObject original) {
    this.id = original.getId();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String toJsonString() {
    return genson.serialize(this);
  }

  public static BusinessObject fromJson(String json) {
    Class<?> clazz = null; 
    HashMap<String, Object> jsonMap = genson.deserialize(json, HashMap.class);
    try {
      clazz = Class.forName(jsonMap.get("@class").toString());
    } catch(ClassNotFoundException e) {
      e.printStackTrace();
    }

    return (BusinessObject) genson.deserialize(json, clazz);
  }


  public abstract State getCurrentState();

  public abstract boolean isParticipant();

  public abstract String getPublicKey();
}