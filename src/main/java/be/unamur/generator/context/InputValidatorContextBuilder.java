package be.unamur.generator.context;

import be.unamur.metamodel.*;
import be.unamur.metamodel.Util;
import be.unamur.extension.MetaObjectExtension;
import be.unamur.metamodel.extension.MerodeExtension;

public class InputValidatorContextBuilder implements ContextBuilder {
    private InputValidatorContext ctx;
    private Metaobject mo;
    private Metamodel model;
    private MerodeExtension ext;

    public InputValidatorContextBuilder(Metamodel model, Metaobject mo, MerodeExtension ext) {
        this.ctx  = new InputValidatorContext();
        this.model = model;
        this.mo  = mo;
        this.ext = ext;
    }

    @Override
    public InputValidatorContext build() {
        this.ctx.setBOTName(this.mo.getName());

        for(Metaattribute ma: mo.getMetaattributes().getMetaattribute()) {
            Attribute attr = new Attribute(ma.getType(), ma.getName());
            this.ctx.addInputParameter(attr);
        }

        if(MetaObjectExtension.INSTANCE.isParticipant(this.mo, this.ext))
            this.ctx.addInputParameter(new Attribute("String", "publicKey"));

        //Add Masters Ids
        for(Metadependency dependency : model.getMetadependencies().getMetadependency()) {
            if(!dependency.getDependent().equals(this.mo.getId()))
                continue;

            Metaobject master = Util.findById(model.getMetaobjects().getMetaobject(), dependency.getMaster());

            Attribute attr = new MasterRefAttribute(master, dependency.getName());
            this.ctx.addInputParameter(attr);
        }

        return this.ctx;
    }
}
