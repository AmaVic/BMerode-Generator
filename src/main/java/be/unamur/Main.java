package be.unamur;

import be.unamur.generator.SolutionGenerator;
import be.unamur.generator.exception.SolutionGenerationException;
import be.unamur.loader.ModelParser;
import be.unamur.loader.exception.ModelParsingException;
import be.unamur.metamodel.Mermaidmodel;
import be.unamur.metamodel.Permission;


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

    SolutionGenerator gen = new SolutionGenerator("/Users/vamarald/Documents/Temp/BMO-EPT/");
    try {
      gen.generate(model);
    } catch(SolutionGenerationException e) {
      e.printStackTrace();
      return;
    }

  }
}
