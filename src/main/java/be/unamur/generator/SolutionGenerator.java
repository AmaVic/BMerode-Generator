package be.unamur.generator;

import be.unamur.generator.context.*;
import be.unamur.generator.exception.SolutionGenerationException;
import be.unamur.metamodel.*;
import be.unamur.metamodel.Util;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SolutionGenerator {
  private final String outputDirectory;
  private final VelocityEngine templateEngine;

  private final String ENTITY_FOLDER = "src" + File.separator + "main" + File.separator + "java" + File.separator + "entity" + File.separator;
  private final String STATE_FOLDER = "src" + File.separator + "main" + File.separator + "java" + File.separator + "state" + File.separator;
  private final String EVENT_FOLDER = "src" + File.separator + "main" + File.separator + "java" + File.separator + "event" + File.separator;
  public SolutionGenerator(String outputDirectoryPath) {
    this.outputDirectory = outputDirectoryPath;

    this.templateEngine = new VelocityEngine();
    this.templateEngine.setProperty("file.resource.loader.path", SolutionGenerator.class.getClassLoader().getResource("be.unamur.generator.templates").getPath());
    this.templateEngine.init();
  }

  public void generate(Mermaidmodel model) throws SolutionGenerationException {
    System.out.println("===== Starting Generation =====");
    System.out.println("--- Generating Entities Classes ---");
    generateBOTEntities(model);
    System.out.println("--- Generating General State Classes ---");
    generateBOTGeneralStates(model);
    System.out.println("--- Generating Specific State Classes ---");
    generateAllSpecificStates(model);
    System.out.println("--- Generating Events Mapping ---");
    generateEventsMapping(model);
    System.out.println("===== Generation Completed =====");
  }

  private void generateBOTEntities(Mermaidmodel model) throws SolutionGenerationException {
    for(Metaobject mo : model.getMetamodel().getMetaobjects().getMetaobject()) {
      generateBOTEntity(mo, model);
      System.out.println(">> Generated Entity for " + mo.getName());
    }
  }

  private void generateBOTEntity(Metaobject bot, Mermaidmodel model) throws SolutionGenerationException {
    BusinessObjectTypeContext ctx = new BusinessObjectTypeContextBuilder(bot, model).build();

    String outputFileName = this.outputDirectory + File.separator + ENTITY_FOLDER + bot.getName() + ".java";
    generateFile("entity.vm", ctx, outputFileName);
  }

  private void generateBOTGeneralStates(Mermaidmodel model) throws SolutionGenerationException {
    for(Metaobject mo : model.getMetamodel().getMetaobjects().getMetaobject()) {
      generateBOTGeneralState(mo, model);
      System.out.println(">> Generated General State for " + mo.getName());
    }
  }

  private void generateBOTGeneralState(Metaobject bot, Mermaidmodel model) throws SolutionGenerationException {
    StateContext ctx = new GeneralStateContextBuilder(model, bot).build();

    String outputFileName = this.outputDirectory + File.separator + STATE_FOLDER + File.separator + be.unamur.generator.context.Util.getStringWithFirstLowerCap(bot.getName()) + File.separator + bot.getName() + "State.java";
    generateFile("generalState.vm", ctx, outputFileName);
  }

  private void generateAllSpecificStates(Mermaidmodel model) throws SolutionGenerationException {
    for(Metaobject o : model.getMetamodel().getMetaobjects().getMetaobject())
      generateBOTSpecificStates(o, model);
  }

  private void generateBOTSpecificStates(Metaobject bot, Mermaidmodel model) throws SolutionGenerationException {
    Metafsm fsm = Util.getActiveFSM(bot);
    for(Metastate state : fsm.getMetastates().getMetastate())
      generateBOTSpecificState(bot, model, state.getName());
    System.out.println(">> Generated Specific States for " + bot.getName());
  }

  private void generateBOTSpecificState(Metaobject bot, Mermaidmodel model, String stateName) throws SolutionGenerationException {
    SpecificStateContext ctx = new SpecificStateContextBuilder(model, bot, stateName).build();

    if(stateName.equals("initial"))
      stateName = "allocated";

    String outputFileName = this.outputDirectory + File.separator + STATE_FOLDER + File.separator + be.unamur.generator.context.Util.getStringWithFirstLowerCap(bot.getName()) + File.separator + bot.getName() + be.unamur.generator.context.Util.getStringWithFirstCap(stateName) + "State.java";
    generateFile("specificState.vm", ctx, outputFileName);
  }

  private void generateEventsMapping(Mermaidmodel model) throws SolutionGenerationException {
    EventsMappingContext ctx = new EventsMappingContextBuilder(model).build();

    String outputFileName = this.outputDirectory + File.separator + EVENT_FOLDER + File.separator + "EventsMapping.java";
    generateFile("eventsMapping.vm", ctx, outputFileName);
  }

  private void generateFile(String templateName, VelocityContext ctx, String outputFilePath) throws SolutionGenerationException {
    Template template = null;
    try {
      template = this.templateEngine.getTemplate(templateName);
    } catch(ResourceNotFoundException e) {
      throw new SolutionGenerationException("[SolutionGenerator.generateFile(String, VelocityContext, String)]: Template " + templateName + " Could not be Loaded");
    } catch(ParseErrorException e) {
      throw new SolutionGenerationException("[SolutionGenerator.generateFile(String, VelocityContext, String)]: Template " + templateName + " Could not be Parsed");
    }

    File outputFile = null;
    outputFile = this.createFileIfDoesNotExist(outputFilePath);

    FileWriter fw = null;
    try {
      fw = new FileWriter(outputFile);
    } catch (IOException e) {
      throw new SolutionGenerationException("[SolutionGenerator.generateFile(String, VelocityContext, String)]: Could not Create FileWriter with Path: " + outputFilePath + " (" + e.getClass().getName() + ")");
    }

    try {
      template.merge(ctx, fw);
      fw.flush();
      fw.close();
    } catch(ResourceNotFoundException | ParseErrorException | MethodInvocationException | IOException e) {
      throw new SolutionGenerationException("[SolutionGenerator.generateFile(String, VelocityContext, String)]: Could not Generate File Based on Provided Context and Template (" + e.getClass().getName() + ")");
    }
  }

  private File createFileIfDoesNotExist(String outputFilePath) throws SolutionGenerationException {
    File outputFile = new File(outputFilePath);
    if(outputFile.exists()) {
      if(!outputFile.delete())
        throw new SolutionGenerationException("[SolutionGenerator.createFileIfDOesNotExist(String)]: File " + outputFilePath + " Already Exists but Could not be Deleted");
    }

    try {
      outputFile.getParentFile().mkdirs();
      outputFile.createNewFile();
    } catch(IOException e) {
      throw new SolutionGenerationException("[SolutionGenerator.createFileIfDOesNotExist(String)]: File " + outputFilePath + " Could not be Created (" + e.getClass().getName() + ")");
    }

    return outputFile;
  }
}
