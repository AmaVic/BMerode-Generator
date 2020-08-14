/*
 * SPDX-License-Identifier: Apache-2.0
 */

import runtime.BusinessEvent;
import event.EventsMapping;
import org.hyperledger.fabric.contract.Context;
import org.hyperledger.fabric.contract.ContractInterface;
import org.hyperledger.fabric.contract.annotation.Contract;
import org.hyperledger.fabric.contract.annotation.Default;
import org.hyperledger.fabric.contract.annotation.Transaction;
import org.hyperledger.fabric.contract.annotation.Contact;
import org.hyperledger.fabric.contract.annotation.Info;
import org.hyperledger.fabric.contract.annotation.License;
import runtime.BusinessObject;
import runtime.JsonConverter;
import runtime.StubHelper;
import runtime.exception.BusinessEventNotFoundException;
import runtime.exception.FailedEventHandlingException;

@Contract(name = "BMerodeCollaboration",
        info = @Info(title = "BMerodeCollaboration",
                description = "Runs a BMerode Collaboration",
                version = "0.1",
                license =
                @License(name = "Apache-2.0",
                        url = ""),
                contact =  @Contact(email = "xyz@gmail.com",
                        name = "xyz",
                        url = "https://xyz.me")))
@Default
public class CollaborationContract implements ContractInterface {

  public  CollaborationContract() {

  }

  @Transaction()
  public String getBusinessObject(Context ctx, String id) {
    BusinessObject bo = StubHelper.findBusinessObject(ctx, id);

    return JsonConverter.toRecordJson(bo);
  }

  @Transaction()
  public String handleEvent(Context ctx, String eventName, String payloadJson) {
    //Based on event name, possible to retrieve all the  methods that it will invoke
    //It is also to find which BO is the owner
    //So in the end, all we need is the eventName and the payload

    System.out.println("=====> Receiving Request to Handle Event: " + eventName);
    BusinessEvent event = null;
    try {
      event = EventsMapping.instance().getBusinessEvent(eventName);
    } catch (BusinessEventNotFoundException e) {
      throw new RuntimeException("Can't handle event " + eventName + " (event not found)");
    }
    System.out.println("=====> Event Identifier: " + eventName + "(ownerType: " + event.getOwnerBOT().getSimpleName() + ")");

    BusinessObject boToReturn;
    try {
      boToReturn = event.handle(ctx, payloadJson);
    } catch (FailedEventHandlingException e) {
      throw new RuntimeException("--> Could Not Handle Event " + eventName + " (" + e.getMessage() + ")");
    }

    System.out.println("=====> Event " + eventName + " Successfully Handled");

    return boToReturn.toJsonString();
  }
}