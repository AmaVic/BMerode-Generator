package be.unamur.runtime;

import org.hyperledger.fabric.contract.Context;
import org.hyperledger.fabric.shim.ledger.KeyValue;
import org.hyperledger.fabric.shim.ledger.QueryResultsIterator;
import be.unamur.runtime.exception.BusinessObjectNotFoundException;

public class StubHelper {
  public static boolean exists(Context ctx, String key) {
    byte[] buffer = ctx.getStub().getState(key);

    return buffer != null && buffer.length != 0;
  }

  public static BusinessObject findBusinessObject(Context ctx, String key) throws BusinessObjectNotFoundException {
    if(!exists(ctx, key))
      throw new BusinessObjectNotFoundException("[StubHelper.findBusinessObject(Context, String)]: Business Object with ID " + key + " was not Found in the Ledger");

    String boState = ctx.getStub().getStringState(key);
    System.out.println("Record Json: " + boState);
    String fullBoState = JsonConverter.fromRecordJsonToFullJson(key, boState);

    BusinessObject boToReturn = null;
    try {
      boToReturn = BusinessObject.fromJson(fullBoState);
    } catch(Exception e) {
      throw new RuntimeException("[StubHelper.findBusinessObject(Context, String)]: Could not load Business Object (" + key + ") from JSON");
    }

    return boToReturn;
  }

  public static boolean hasLivingDependents(Context ctx, BusinessObject bo) {
    String classAsRef = bo.getClass().getSimpleName().substring(0, 1).toLowerCase() + bo.getClass().getSimpleName().substring(1) + "Id";
    String query = "{\"selector\":{\""+classAsRef+"\":\""+bo.getId()+"\", \"currentState\": {\"stateType\": \"ONGOING\"}}}";

    QueryResultsIterator<KeyValue> results = ctx.getStub().getQueryResult(query);
    return results.iterator().hasNext();
  }

  public static void save(Context ctx, BusinessObject bo) {
    ctx.getStub().putStringState(bo.getId(), JsonConverter.toRecordJsonData(bo));
  }

  public static boolean hasLivingDependentsOfType(Context ctx, BusinessObject master, BusinessObject dependent) {
    String classAsRef = master.getClass().getSimpleName().substring(0, 1).toLowerCase() + master.getClass().getSimpleName().substring(1) + "Id";
    String query = "{\"selector\":{\"@class\":\""+dependent.getClass().getName()+"\", \""+classAsRef+"\":\""+master.getId()+"\", \"currentState\": {\"stateType\": \"ONGOING\"}}}";

    QueryResultsIterator<KeyValue> results = ctx.getStub().getQueryResult(query);
    return results.iterator().hasNext();
  }
}
