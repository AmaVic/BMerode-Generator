package be.unamur.metamodel;

import be.unamur.generator.context.SpecificStateMethod;
import be.unamur.generator.exception.SolutionGenerationException;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Util {
  public static Metamethod getOwnedMethodFromEvent(Mermaidmodel model, Metaevent event) {
    for(Metamethod method : model.getMetamodel().getMetamethods().getMetamethod()) {
      if(!method.getOwnereventid().equals(event.getId()))
        continue;

      if(!method.getProvenance().equals("OWNED"))
        continue;

      return method;
    }

    return null;
  }

  public static <ObjectType extends Identifiable> ObjectType findById(List<ObjectType> collection, BigInteger id) {
    for (ObjectType element : collection) {
      if (element.getId().equals(id))
        return element;
    }
    return null;
  }

  public static ArrayList<Metamethod> getBOTMethods(Mermaidmodel model, Metaobject object) {
    ArrayList<Metamethod> objectMethods = new ArrayList<Metamethod>();
    for(Metamethod method : model.getMetamodel().getMetamethods().getMetamethod()) {
      if(!method.getOwnerobjectid().equals(object.getId()))
        continue;

      objectMethods.add(method);
    }

    return objectMethods;
  }

  public static Metastate getStateFromName(Metaobject object, String stateName) {
    Metafsm fsm = Util.getActiveFSM(object);
    for(Metastate state : fsm.getMetastates().getMetastate()) {
      if(state.getName().equals(stateName))
        return state;
    }

    return null;
  }

  public static Metafsm getActiveFSM(Metaobject o) {
    for(Metafsm fsm : o.getMetafsms().getMetafsm()) {
      if(fsm.isCodegeneration())
        return fsm;
    }

    return null;
  }

  public static ArrayList<Metatransition> getAllowedTransitions(Metaobject object, String currentStateName) {
    //Identify correct FSM (used for code generation)
    Metafsm fsm = null;
    for(Metafsm currentFsm : object.getMetafsms().getMetafsm()) {
      if(currentFsm.codegeneration) {
        fsm = currentFsm;
        break;
      }
    }

    //Retrieve Current State
    Metastate currentState = null;
    for(Metastate state : fsm.getMetastates().getMetastate()) {
      if(state.getName().equals(currentStateName)) {
        currentState = state;
        break;
      }
    }

    //Retrieve Allowed Meta Transitions
    ArrayList<Metatransition> transitions = new ArrayList<Metatransition>();
    for(Metatransition transition : fsm.getMetatransitions().getMetatransition()) {
      if(transition.getSourcestateid().equals(currentState.getId()))
        transitions.add(transition);
    }

    return transitions;
  }

  //@ToDo: Fix / Remove: Make sure filtering on duplicates in context building is enough to prevent double event exec
  public static boolean isEnabled(Mermaidmodel model, Metamethod method) {
    return true;
    /*System.out.println("Checking if method " + method.getId() + "(" + method.getName() + ") should be enabled");
    if(method.getViadependency() == null) {
      System.out.println("--------> Method not Acquired via Dependency => Enabled");
      return true;
    }
    //Check if there exists a dependencyInPath with the same viaDependechy as the Method
    for(Metaobject mo: model.getMetamodel().getMetaobjects().getMetaobject()) {
      for(Metamultiplepropagationconstraints mpcs : mo.getMetamultiplepropagationconstraints()) {
        for(Metamultiplepropagationconstraint mpc : mpcs.getMetamultiplepropagationconstraint()) {
          for(Metapath path : mpc.getMetapath()) {
            for(Metadependencyinpath inpath : path.getMetadependencyinpath()) {
              //System.out.println("--------> MetaDependencyInPath ID = " + inpath.getId());
              //System.out.println("--------> Method.viaDependency ID = " + method.getViadependency());
              if(!inpath.getId().equals(method.getViadependency()))
                continue;

              if(path.isIsenabled()) {
                //System.out.println("-------> Enabled");
                return true;
              } else {
                //System.out.println("-------> Disabled");
                return false;
              }
            }
          }
        }
      }
    }
    return true;

    /*List<Metamultiplepropagationconstraints> mpcsList = object.getMetamultiplepropagationconstraints();
    for(Metamultiplepropagationconstraints mpcs : mpcsList) {
      if(mpcs.getMetamultiplepropagationconstraint().size() == 0)
        return true;

      for(Metamultiplepropagationconstraint singleMp : mpcs.getMetamultiplepropagationconstraint()) {
        List<Metapath> paths = singleMp.metapath;
        for(Metapath path : paths) {
          List<Metadependencyinpath> inpaths = path.getMetadependencyinpath();
          for(Metadependencyinpath inpath : inpaths) {
            if(!inpath.getId().equals(method.getViadependency()))
              continue;

            return path.isIsenabled();
          }
        }
      }
    }

    return true;*/
  }
}
