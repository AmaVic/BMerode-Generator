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
      if(!mo.getName().equals("InvoiceLine"))
        continue;

      for(Metamultiplepropagationconstraints mpcs : mo.getMetamultiplepropagationconstraints())
        for(Metamultiplepropagationconstraint mpc : mpcs.getMetamultiplepropagationconstraint())
          System.out.println(mpc.getId());


    }*/

    SolutionGenerator gen = new SolutionGenerator("/Users/vamarald/Documents/Temp/BmerodeOutput/");
    try {
      gen.generate(model);
    } catch(SolutionGenerationException e) {
      e.printStackTrace();
      return;
    }

  }
}
