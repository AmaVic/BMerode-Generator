package be.unamur.runtime;

import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import com.owlike.genson.annotation.JsonCreator;
import com.owlike.genson.annotation.JsonIgnore;
import com.owlike.genson.annotation.JsonProperty;
import be.unamur.runtime.exception.CollaborationSetupException;

import org.hyperledger.fabric.contract.Context;


public class CollaborationSetup {
  private boolean setupFinalized;
  private String participantsHandlerPK;

  @JsonIgnore
  protected final static Genson genson = new GensonBuilder().create();

  @JsonCreator
  public CollaborationSetup(@JsonProperty("setupFinalized") boolean setupFinalized, @JsonProperty("participantsHandlerPK") String participantsHandlerPK) {
    this.setupFinalized = setupFinalized;
    this.participantsHandlerPK = participantsHandlerPK;
  }

  public boolean getSetupFinalized() { return this.setupFinalized; }
  public String getParticipantsHandlerPK() { return this.participantsHandlerPK; }
  public void markAsReady() { this.setupFinalized = true; }

  public String toJsonString() { return genson.serialize(this); }
  public static CollaborationSetup fromJson(String json) { return genson.deserialize(json, CollaborationSetup.class); }
  public static CollaborationSetup load(Context ctx) throws CollaborationSetupException {
    String currentSetup = ctx.getStub().getStringState("BMERODE.COLLABORATION_SETUP");
    if(currentSetup == null || currentSetup.length() == 0)
      throw new CollaborationSetupException("CollaboationSetup.load(Context): Collaboration needs to be initialized first");

    return CollaborationSetup.fromJson(currentSetup);
  }
}