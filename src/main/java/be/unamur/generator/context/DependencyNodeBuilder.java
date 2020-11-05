package be.unamur.generator.context;

import be.unamur.metamodel.*;
import be.unamur.metamodel.Util;

public class DependencyNodeBuilder {
    private Metamodel metamodel;
    private Metamultiplepropagationconstraint mpc;
    private DependencyNode BONode;
    private boolean enabledPath;

    public DependencyNodeBuilder(Metamodel metamodel, Metamultiplepropagationconstraint mpc, Metaobject bot, boolean enabledPath) {
        //System.out.println("New DNB for BOT: " + bot.getName());
        this.metamodel = metamodel;
        this.mpc = mpc;
        this.BONode = new DependencyNode(bot);
        this.enabledPath = enabledPath;

        this.addDirectDependencies();
        this.addIndirectDependencies();
    }

    private DependencyNodeBuilder(Metamodel metamodel, Metamultiplepropagationconstraint mpc, DependencyNode dn, boolean enabledPath) {
        this.metamodel = metamodel;
        this.mpc = mpc;
        this.BONode = dn;
        this.enabledPath = enabledPath;

        this.addDirectDependencies();
        this.addIndirectDependencies();
    }

    public DependencyNode getDependencyRootNode() { return BONode; }

    private void addIndirectDependencies() {
        //System.out.println("Need to add Indirect Deps ( " + this.BONode.getBOT().getName() + ") ? " + !this.BONode.isLast());
        if(this.BONode.isLast())
            return;

        DependencyNode next = this.BONode.next();
        DependencyNodeBuilder dnb = new DependencyNodeBuilder(this.metamodel, this.mpc, next, this.enabledPath);
    }

    private void addDirectDependencies() {
        for (Metapath path : mpc.getMetapath()) {
            //@TODO: Check for both Paths
            if(path.isIsenabled() != this.enabledPath)
                continue;

            for (int i = path.getMetadependencyinpath().size() - 1; i >= 0; i--) {
                Metadependencyinpath inPath = path.getMetadependencyinpath().get(i);
                Metadependency dependency = Util.findById(this.metamodel.getMetadependencies().getMetadependency(), inPath.getId());

                if (!dependency.getDependent().equals(this.BONode.getBOT().getId()))
                    continue;
                //System.out.println(dependency.getName());
                Metaobject master = Util.findById(metamodel.getMetaobjects().getMetaobject(), dependency.getMaster());
                Metaobject dpd = Util.findById(metamodel.getMetaobjects().getMetaobject(), dependency.getDependent());


                if(dpd.getId().equals(this.BONode.getBOT().getId())) {
                    //System.out.println("Direct Dependency Added For " + this.BONode.getBOT().getName() + ": " + master.getName());
                    this.BONode.addDirectMaster(master);
                }
            }
        }
    }

}
