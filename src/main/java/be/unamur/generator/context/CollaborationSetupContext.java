package be.unamur.generator.context;

import org.apache.velocity.VelocityContext;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollaborationSetupContext extends VelocityContext {
    public CollaborationSetupContext() {
        super();
        this.put("botNames", new ArrayList<String>());
    }

    public void addBOTName(String botName) {
        ArrayList<String> botNames = (ArrayList<String>)this.get("botNames");
        if(!botNames.contains(botName))
            botNames.add(botName);
    }
}
