package be.unamur.generator.context;

import be.unamur.metamodel.Metaobject;

public class DependencyNode {
    private Metaobject bot;
    private DependencyNode directMaster;
    private boolean last;

    public DependencyNode(Metaobject bot) {
        this.bot = bot;
        this.directMaster = null;
        this.last = true;
    }

    public void addDirectMaster(Metaobject master) {
        this.directMaster = new DependencyNode(master);
        this.last = false;
    }

    public Metaobject getBOT() { return this.bot; }
    public DependencyNode next() { return this.directMaster; }
    public boolean isLast() { return this.last; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.getBOT().getName());
        if(this.isLast())
            return sb.toString();

        DependencyNode nextNode = this.next();
        sb.append(" --> ").append(nextNode.toString());

        return sb.toString();
    }
}
