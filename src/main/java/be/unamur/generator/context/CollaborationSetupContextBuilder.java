package be.unamur.generator.context;

import be.unamur.metamodel.Metamodel;
import be.unamur.metamodel.Metaobject;
import org.apache.velocity.VelocityContext;

public class CollaborationSetupContextBuilder implements ContextBuilder {
    private Metamodel metamodel;

    public CollaborationSetupContextBuilder(Metamodel metamodel) {
        this.metamodel = metamodel;
    }

    @Override
    public CollaborationSetupContext build() {
        CollaborationSetupContext ctx = new CollaborationSetupContext();
        for(Metaobject bot: metamodel.getMetaobjects().getMetaobject()) {
            ctx.addBOTName(bot.getName());
        }

        return ctx;
    }
}
