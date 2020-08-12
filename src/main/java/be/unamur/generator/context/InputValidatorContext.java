package be.unamur.generator.context;

import be.unamur.metamodel.Metaobject;
import org.apache.velocity.VelocityContext;

import java.util.ArrayList;

public class InputValidatorContext extends VelocityContext {
    public InputValidatorContext() {
        super();
        this.put("fields", new ArrayList<Attribute>());
        this.put("botName", "UNDEFINED");
    }

    public void setBOTName(String BOTName) {
        this.put("botName", BOTName);
    }

    @SuppressWarnings("unchecked")
    public void addInputParameter(Attribute attribute) {
        ArrayList<Attribute> fields = (ArrayList<Attribute>)this.get("fields");
        fields.add(attribute);
    }
}
