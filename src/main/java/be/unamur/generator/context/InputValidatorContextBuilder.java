package be.unamur.generator.context;

import be.unamur.metamodel.*;
import be.unamur.metamodel.Util;

public class InputValidatorContextBuilder implements ContextBuilder {
    private InputValidatorContext ctx;
    private Metaobject mo;
    private Metamodel model;

    public InputValidatorContextBuilder(Metamodel model, Metaobject mo) {
        this.ctx  = new InputValidatorContext();
        this.model = model;
        this.mo  = mo;
    }

    @Override
    public InputValidatorContext build() {
        this.ctx.setBOTName(this.mo.getName());

        for(Metaattribute ma: mo.getMetaattributes().getMetaattribute()) {
            Attribute attr = new Attribute(ma.getType(), ma.getName());
            this.ctx.addInputParameter(attr);
        }

        //Add Masters Ids
        for(Metadependency dependency : model.getMetadependencies().getMetadependency()) {
            if(!dependency.getDependent().equals(this.mo.getId()))
                continue;

            Metaobject master = Util.findById(model.getMetaobjects().getMetaobject(), dependency.getMaster());

            Attribute attr = new MasterRefAttribute(master);
            this.ctx.addInputParameter(attr);
        }

        return this.ctx;
    }
}
