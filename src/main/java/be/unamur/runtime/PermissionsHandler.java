package be.unamur.runtime;

import org.bouncycastle.util.encoders.Base64;
import org.hyperledger.fabric.contract.Context;
import be.unamur.runtime.exception.CollaborationSetupException;

public class PermissionsHandler {
    public static boolean setupAllowed(Context ctx) {
        CollaborationSetup setup = null;
        try {
            setup = CollaborationSetup.load(ctx);
        } catch(CollaborationSetupException e) {
            System.out.println(e);
            return false;
        }

        byte[] encodedPK = ctx.getClientIdentity().getX509Certificate().getPublicKey().getEncoded();
        String plainPK = new String(Base64.encode(encodedPK));

        return setup.getParticipantsHandlerPK().equals(plainPK);
    }
}
