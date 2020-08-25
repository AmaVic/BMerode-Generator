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
    String marketPlaceModelPath = Main.class.getClassLoader().getResource("toRemove/MPCTest.mxp").getFile();
    System.out.println(marketPlaceModelPath);

    Mermaidmodel model = null;
    try {
      model = ModelParser.parseModel(marketPlaceModelPath);
    } catch(ModelParsingException e) {
      e.printStackTrace();
      return;
    }

    for(Metaobject mo: model.getMetamodel().getMetaobjects().getMetaobject()) {
      if(!mo.getName().equals("InvoiceLine"))
        continue;

      //System.out.println(mo.getName());
      for(Metamultiplepropagationconstraints mpcs: mo.getMetamultiplepropagationconstraints()) {
        Metamultiplepropagationconstraint mpc = null;
        try {
          mpc = mpcs.getMetamultiplepropagationconstraint().get(0);
        } catch(IndexOutOfBoundsException e) {
          continue;
        }

        /*System.out.println("----");
        System.out.println(MPCStringGenerator.generateMPCCheckCode(model.getMetamodel(), mo, mpc));*/
      }
    }

    SolutionGenerator gen = new SolutionGenerator("/Users/vamarald/Documents/Temp/BmerodeOutput/");
    try {
      gen.generate(model);
    } catch(SolutionGenerationException e) {
      e.printStackTrace();
      return;
    }

  }
}
