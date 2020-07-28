package be.unamur.metamodel;

import be.unamur.generator.context.SpecificStateMethod;
import be.unamur.generator.exception.SolutionGenerationException;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Util {
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
}
