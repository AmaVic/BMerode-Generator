package be.unamur.generator.context;

import be.unamur.metamodel.Metadependency;
import be.unamur.metamodel.Metamodel;
import be.unamur.metamodel.Metamultiplepropagationconstraint;
import be.unamur.metamodel.Metaobject;

import java.math.BigInteger;
import java.util.stream.Collectors;

public class MPCStringGenerator {
    public static String generateMPCCheckCode(Metamodel metamodel, Metaobject mo, Metamultiplepropagationconstraint mpc) {
        DependencyNodeBuilder enabledPathDNB = new DependencyNodeBuilder(metamodel, mpc, mo, true);
        DependencyNodeBuilder disabledPathDNB = new DependencyNodeBuilder(metamodel, mpc, mo, false);

        String enabledPathSupplier = getRootMasterBusinessObject(enabledPathDNB.getDependencyRootNode(), true, mpc.getId());
        String disabledPathSupplier = getRootMasterBusinessObject(disabledPathDNB.getDependencyRootNode(), false, mpc.getId());
        String booleanCheck = mpc.getType().equals("EQUAL_TO") ? "!" : "";

        StringBuilder sb = new StringBuilder("//Checking Multiple Propagation Constraint " + mpc.getId()).append("\n");
        sb.append(enabledPathSupplier);
        sb.append("\n \n");
        sb.append(disabledPathSupplier);
        sb.append("\n \n");
        sb.append("    if(").append(booleanCheck).append("ultimateMPCObjectEnabledPath").append(mpc.getId()).append("Supplier").append(".get()").append(".getId().equals(ultimateMPCObjectDisabledPath").append(mpc.getId()).append("Supplier").append(".get()").append(".getId()))");
        sb.append("\n");
        sb.append("      throw new FailedEventHandlingException(\"One of the multiple propagation constraints is not met\");");

        return sb.toString();
    }

    public static String getRootMasterBusinessObject(DependencyNode rootDependencyNode, boolean enabledPath, BigInteger mpcId) {
        if(rootDependencyNode.isLast())
            return "";

        StringBuilder sb = new StringBuilder();
        DependencyNode next = rootDependencyNode.next();
        String supplierName = enabledPath ? "ultimateMPCObjectEnabledPath" : "ultimateMPCObjectDisabledPath";
        //Fetch Direct Object
        sb.append("    Supplier<BusinessObject> ").append(supplierName).append(mpcId).append("Supplier").append(" = () -> {\n");
        sb.append("      //Fetching " + next.getBOT().getName()).append("\n");
        sb.append("      ");
        sb.append(next.getBOT().getName()).append(" mpc_").append(Util.getStringWithFirstLowerCap(next.getBOT().getName())).append("_").append(rootDependencyNode.getDependencyName()).append(" = null;\n");
        sb.append("      try {\n");
        sb.append("        mpc_").append(Util.getStringWithFirstLowerCap(next.getBOT().getName())).append("_").append(rootDependencyNode.getDependencyName());
        sb.append(" = (").append(next.getBOT().getName()).append(") ").append("StubHelper.findBusinessObject(ctx, object.get");
        sb.append(next.getBOT().getName()).append("Id_").append(rootDependencyNode.getDependencyName()).append("()");
        sb.append(");\n");
        sb.append("      } catch(BusinessObjectNotFoundException e) { \n");
        sb.append("        throw new FailedEventHandlingException(\"Could not check MPC:\" + e); \n");
        sb.append("      }\n");

        DependencyNode last = rootDependencyNode;
        while(!next.isLast()) {
            sb.append("\n");
            DependencyNode current = next;
            next = next.next();
            //current.setDependencyName(rootDependencyNode.getDependencyName());

            //sb.append("\n \n");
            sb.append(getIndirectBusinessObject(current, next, last));

            if(!next.isLast())
                sb.append("\n");
            last = current;
        }

        sb.append("\n\n");
        sb.append("      return mpc_" + Util.getStringWithFirstLowerCap(next.getBOT().getName())).append("_").append(last.getDependencyName()).append(";\n");
        sb.append("    };");

        return sb.toString();
    }

    private static String getIndirectBusinessObject(DependencyNode previousDn, DependencyNode dn, DependencyNode previouslyFetched) {
        StringBuilder sb = new StringBuilder();

        sb.append("      //Fetching " + dn.getBOT().getName()).append("\n");
        sb.append("      ");
        sb.append(dn.getBOT().getName()).append(" mpc_").append(Util.getStringWithFirstLowerCap(dn.getBOT().getName())).append("_").append(previousDn.getDependencyName()).append(" = null;\n");
        sb.append("      try {\n");
        sb.append("      mpc_").append(Util.getStringWithFirstLowerCap(dn.getBOT().getName())).append("_").append(previousDn.getDependencyName());
        sb.append(" = (").append(dn.getBOT().getName()).append(") StubHelper.findBusinessObject(ctx, mpc_").append(Util.getStringWithFirstLowerCap(previousDn.getBOT().getName())).append("_").append(previouslyFetched.getDependencyName()).append(".");
        sb.append("get").append(dn.getBOT().getName()).append("Id_").append(previousDn.getDependencyName()).append("()");
        sb.append(");\n");
        sb.append("      } catch(BusinessObjectNotFoundException e) { \n");
        sb.append("        throw new FailedEventHandlingException(\"Could not check MPC:\" + e); \n");
        sb.append("      }");

        return sb.toString();
    }
}
