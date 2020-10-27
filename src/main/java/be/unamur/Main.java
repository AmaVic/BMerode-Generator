package be.unamur;

import be.unamur.generator.SolutionGenerator;
import be.unamur.generator.context.DependencyNode;
import be.unamur.generator.context.DependencyNodeBuilder;
import be.unamur.generator.context.MPCStringGenerator;
import be.unamur.generator.exception.SolutionGenerationException;
import be.unamur.loader.ModelParser;
import be.unamur.loader.exception.ModelParsingException;
import be.unamur.metamodel.Mermaidmodel;
import be.unamur.metamodel.Metamultiplepropagationconstraint;
import be.unamur.metamodel.Metamultiplepropagationconstraints;
import be.unamur.metamodel.Metaobject;

import java.util.function.Function;
import java.util.function.Supplier;


public class Main {
  /**
   *
   * @param args
   */
  public static void main(String[] args) {
    String marketPlaceModelPath = Main.class.getClassLoader().getResource("toRemove/identity.mxp").getFile();
    System.out.println(marketPlaceModelPath);

    Mermaidmodel model = null;
    try {
      model = ModelParser.parseModel(marketPlaceModelPath);
    } catch(ModelParsingException e) {
      e.printStackTrace();
      return;
    }

    /*
    for(Metaobject mo: model.getMetamodel().getMetaobjects().getMetaobject()) {
      System.out.println("MO: " + mo.getName());
      System.out.println("> isPtcp? " + mo.isIsParticipant());
    }*/

    SolutionGenerator gen = new SolutionGenerator("/Users/vamarald/Documents/Temp/BM-Output/");
    try {
      gen.generate(model);
    } catch(SolutionGenerationException e) {
      e.printStackTrace();
      return;
    }

  }
}
