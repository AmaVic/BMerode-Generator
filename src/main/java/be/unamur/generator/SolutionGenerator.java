package be.unamur.generator;

import be.unamur.generator.context.BusinessObjectTypeContext;
import be.unamur.generator.context.BusinessObjectTypeContextBuilder;
import be.unamur.generator.exception.SolutionGenerationException;
import be.unamur.metamodel.Mermaidmodel;
import be.unamur.metamodel.Metaobject;
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
  }

  private void generateBOTEntities(Mermaidmodel model) throws SolutionGenerationException {
    for(Metaobject mo : model.getMetamodel().getMetaobjects().getMetaobject()) {
      generateBOTEntity(mo);
      System.out.println(">> Generated Entity for " + mo.getName());
    }
  }

  private void generateBOTEntity(Metaobject bot) throws SolutionGenerationException {
    BusinessObjectTypeContext ctx = new BusinessObjectTypeContextBuilder(bot).build();

    String outputFileName = this.outputDirectory + File.separator + ENTITY_FOLDER + bot.getName() + ".java";
    generateFile("entity.vm", ctx, outputFileName);
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
