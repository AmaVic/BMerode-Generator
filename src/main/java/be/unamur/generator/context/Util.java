package be.unamur.generator.context;

import java.util.ArrayList;

public class Util {

  public static String getStringWithFirstCap(String str) {
    return str.substring(0, 1).toUpperCase() + str.substring(1);
  }

  public static String getStringWithFirstLowerCap(String str) {
    return str.substring(0, 1).toLowerCase() + str.substring(1);
  }

  public static String getGeneralStateType(String BOTName) {
    return BOTName + "State";
  }

  public static String getDefaultStateTypeName(String BOTName) {
    return BOTName + "AllocatedState";
  }

  public static String buildParamString(ArrayList<Attribute> elems, boolean withJsonAnnotation, boolean withDefaultAttributes, boolean participantBOT) {

    if(participantBOT) {
      Attribute pk = new Attribute("String", "publicKey");
      if(!elems.contains(pk))
        elems.add(new Attribute("String", "publicKey"));
    }

    if((elems == null || elems.size() == 0))
      return "";

    if(elems.size() == 1) {
      if(elems.get(0).isAddedByDefault() && !withDefaultAttributes)
        return "";
      return (withJsonAnnotation ? "@JsonProperty(\"" + elems.get(0).getName() + "\") " : "") + elems.get(0).getType() + " " + elems.get(0).getName();
    }
    StringBuilder sb = new StringBuilder();
    for(Attribute element : elems) {
      if(element.isAddedByDefault() && !withDefaultAttributes)
        continue;

      if(withJsonAnnotation)
        sb.append("@JsonProperty(\"").append(element.getName()).append("\") ");

      sb.append(element.getType());
      sb.append(" ");
      sb.append(element.getName());
      sb.append(", ");
    }

    return sb.substring(0, sb.length()-2);
  }
}
