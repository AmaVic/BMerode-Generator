package be.unamur;

import be.unamur.generator.SolutionGenerator;
import be.unamur.generator.exception.SolutionGenerationException;
import be.unamur.loader.ModelParser;
import be.unamur.loader.exception.ModelParsingException;
import be.unamur.metamodel.Mermaidmodel;
import org.apache.velocity.VelocityContext;

public class Main {
  /**
   *
   * @param args
   */
  public static void main(String[] args) {
    String marketPlaceModelPath = Main.class.getClassLoader().getResource("toRemove/model.mxp").getFile();
    System.out.println(marketPlaceModelPath);

    Mermaidmodel model = null;
    try {
      model = ModelParser.parseModel(marketPlaceModelPath);
    } catch(ModelParsingException e) {
      e.printStackTrace();
    }


    SolutionGenerator gen = new SolutionGenerator("/Users/vamarald/Documents/Temp/BM-Gen/");
    try {
      gen.generate(model);
    } catch(SolutionGenerationException e) {
      e.printStackTrace();
    }

  }
}
