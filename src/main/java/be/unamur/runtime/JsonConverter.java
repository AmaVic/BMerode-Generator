package be.unamur.runtime;

import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import com.owlike.genson.ext.javadatetime.JavaDateTimeBundle;

import java.util.HashMap;
import java.util.Map;

public class JsonConverter {
    private final static Genson genson = new GensonBuilder().withBundle(new JavaDateTimeBundle()).useClassMetadata(true).useRuntimeType(true).create();
    private final static Genson recordGenson = new GensonBuilder().withBundle(new JavaDateTimeBundle()).create();

    @SuppressWarnings("unchecked")
    public static String toRecordJsonData(BusinessObject bo) {
        String fullJson = bo.toJsonString();
        HashMap<String, Object> jsonObject = (HashMap<String, Object>) genson.deserialize(fullJson, Map.class);


        //ObjectType
        jsonObject.remove("@class");
        jsonObject.put("businessObjectType", bo.getClass().getSimpleName());
        //ID
        jsonObject.remove("id");

        return recordGenson.serialize(jsonObject);
    }

    @SuppressWarnings("unchecked")
    public static String toRecordJson(BusinessObject bo) {
        String jsonWithoutId = toRecordJsonData(bo);
        HashMap<String, Object> jsonObject = (HashMap<String, Object>) recordGenson.deserialize(jsonWithoutId, Map.class);
        jsonObject.put("_id", bo.getId());

        return genson.serialize(jsonObject);
    }

    @SuppressWarnings("unchecked")
    public static String fromRecordJsonToFullJson(String json) {
        //Replace businessObjectType with @class and add id
        HashMap<String, Object> jsonObject = (HashMap<String, Object>) genson.deserialize(json, Map.class);

        String boType = (String)jsonObject.get("businessObjectType");
        jsonObject.put("@class", "entity."+boType);
        jsonObject.remove("businessObjectType");
        jsonObject.put("id", jsonObject.get("_id"));

        HashMap<String, Object> currentStateObject = (HashMap<String, Object>)jsonObject.get("currentState");

        //BOT Name
        String botEntityClassName = boType.substring(0, 1).toLowerCase() + boType.substring(1);
        String stateName = (String)currentStateObject.get("name");
        String stateClassName = stateName.substring(0, 1).toUpperCase() + stateName.substring(1);
        String botStateClassName = botEntityClassName.substring(0, 1).toUpperCase() + botEntityClassName.substring(1) + stateClassName + "State";
        currentStateObject.put("@class", "state."+botEntityClassName+"."+botStateClassName);
        jsonObject.put("currentState", currentStateObject);

        return recordGenson.serialize(jsonObject);
    }
}
