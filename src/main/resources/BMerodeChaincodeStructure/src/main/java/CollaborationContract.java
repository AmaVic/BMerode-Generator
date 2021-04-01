/*
 * SPDX-License-Identifier: Apache-2.0
 */

import com.owlike.genson.Genson;
import runtime.CollaborationSetup;
import runtime.exception.CollaborationSetupException;
import runtime.exception.FailedEventHandlingException;
import runtime.*;
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

import java.util.ArrayList;

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

  private void logCaller(Context ctx) {
    byte[] encodedPK = ctx.getClientIdentity().getX509Certificate().getPublicKey().getEncoded();
    String plainPK = new String(Base64.encode(encodedPK));

    System.out.println("========SENDER PK==========");
    System.out.println(plainPK);
    System.out.println("===========================");
  }

  @Transaction(intent = Transaction.TYPE.SUBMIT)
  public void init(Context ctx, String participantsHandlerPK) {
    String currentSetup = ctx.getStub().getStringState("BMERODE.COLLABORATION_SETUP");
    if(currentSetup != null && currentSetup.length() != 0)
      throw new CollaborationSetupException("[CollaborationContract.init(String)]: Initial Setup already Exists");

    CollaborationSetup setup = new CollaborationSetup(false, participantsHandlerPK);
    ctx.getStub().putStringState("BMERODE.COLLABORATION_SETUP", setup.toJsonString());
  }

  @Transaction(intent = Transaction.TYPE.SUBMIT)
  public void markCollaborationAsReady(Context ctx) {
    if(!PermissionsHandler.setupAllowed(ctx))
      throw new FailedEventHandlingException("CollaborationContract.markCollaborationAsReady(Context): Only the ParticipantsHandler can mark the collaboration as ready");


    CollaborationSetup setup = CollaborationSetup.load(ctx);
    setup.markAsReady();
    ctx.getStub().putStringState("BMERODE.COLLABORATION_SETUP", setup.toJsonString());
  }

  @Transaction(intent = Transaction.TYPE.EVALUATE)
  public String getBusinessObject(Context ctx, String id) {
    logCaller(ctx);
    BusinessObject bo = StubHelper.findBusinessObject(ctx, id);

    return JsonConverter.toRecordJson(bo);
  }

  @Transaction(intent = Transaction.TYPE.EVALUATE)
  public String getBusinessObjectHistory(Context ctx, String id) {
    logCaller(ctx);
    ArrayList<String> boVersions = StubHelper.findBusinessObjectHistory(ctx, id);
    Genson g = new Genson();
    return g.serialize(boVersions);
  }

  @Transaction(intent = Transaction.TYPE.SUBMIT)
  public String handleEvent(Context ctx, String eventName, String payloadJson) {
    logCaller(ctx);
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
      e.printStackTrace();
      throw new RuntimeException("--> Could Not Handle Event " + eventName + " (" + e + ")");
    }

    System.out.println("=====> Event " + eventName + " Successfully Handled");

    return boToReturn.toJsonString();
  }
}