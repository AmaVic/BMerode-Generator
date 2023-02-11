package be.unamur.generator;

import be.unamur.generator.context.*;
import be.unamur.generator.context.Util;
import be.unamur.generator.exception.SolutionGenerationException;
import be.unamur.metamodel.*;

import be.unamur.metamodel.extension.MerodeExtension;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.app.event.implement.IncludeRelativePath;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.apache.velocity.runtime.resource.loader.JarResourceLoader;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Enumeration;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class SolutionGenerator {
  private final String outputDirectory;
  private final VelocityEngine templateEngine;
  private final String templatesFolder;

  private final String ENTITY_FOLDER = "src" + File.separator + "main" + File.separator + "java" + File.separator + "entity" + File.separator;
  private final String STATE_FOLDER = "src" + File.separator + "main" + File.separator + "java" + File.separator + "state" + File.separator;
  private final String EVENT_FOLDER = "src" + File.separator + "main" + File.separator + "java" + File.separator + "event" + File.separator;
  private final String INPUT_VALIDATOR_FOLDER = "src" + File.separator + "main" + File.separator + "java" + File.separator + "inputValidator" + File.separator;
  private final String PERMISSIONS_FOLDER = "src" + File.separator + "main" + File.separator + "java" + File.separator + "permissions" + File.separator;
  private final String RUNTIME_FOLDER = "src" + File.separator + "main" + File.separator + "java" + File.separator + "runtime" + File.separator;

  public SolutionGenerator(String outputDirectoryPath) {
    this.outputDirectory = outputDirectoryPath;
    final File jarFile = new File(getClass().getProtectionDomain().getCodeSource().getLocation().getPath());

    this.templateEngine = new VelocityEngine();
    this.templateEngine.setProperty(RuntimeConstants.EVENTHANDLER_INCLUDE, IncludeRelativePath.class.getName());

    if(jarFile.isFile()) {
      String jarUrl = null;
      try {
        jarUrl = this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI().toString();
      } catch (URISyntaxException e) {
        e.printStackTrace();
      }
      jarUrl = "jar:"+jarUrl;
      System.out.println(jarUrl);

      this.templatesFolder = "be.unamur.generator.templates";
      this.templateEngine.setProperty("resource.loader", "jar");
      this.templateEngine.setProperty("jar.resource.loader.class", JarResourceLoader.class.getName());
      this.templateEngine.setProperty("jar.resource.loader.path", jarUrl);
    } else {
      this.templatesFolder = "";
      this.templateEngine.setProperty("resource.loader", "classpath");
      this.templateEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
      this.templateEngine.setProperty("file.resource.loader.path", SolutionGenerator.class.getClassLoader().getResource("be.unamur.generator.templates").getPath());
    }

    this.templateEngine.init();
  }

  public void generate(Mermaidmodel model, MerodeExtension ext) throws SolutionGenerationException {
    System.out.println("===== Starting Generation =====");
    System.out.println("--- Preparing Boilerplate Code  ---");
    copyBoilerplateCode();
    System.out.println("--- Generating Collaboration Setup ---");
    generateCollaborationSetup(model.getMetamodel());
    System.out.println("--- Generating Entities Classes ---");
    generateBOTEntities(model, ext);
    System.out.println("--- Generating General State Classes ---");
    generateBOTGeneralStates(model, ext);
    System.out.println("--- Generating Specific State Classes ---");
    generateAllSpecificStates(model, ext);
    System.out.println("--- Generating Events Mapping ---");
    generateEventsMapping(model);
    System.out.println("--- Generating Input Validators ---");
    generateInputValidators(model, ext);
    System.out.println("--- Generating Permissions Handlers ---");
    generateEPT(model, ext);
    System.out.println("===== Generation Complete =====");
  }

  private void generateCollaborationSetup(Metamodel metamodel) throws SolutionGenerationException {
    CollaborationSetupContext ctx = new CollaborationSetupContextBuilder(metamodel).build();

    String outputFileName = this.outputDirectory + File.separator + RUNTIME_FOLDER + File.separator + "CollaborationSetup.java";
    generateFile("be.unamur.generator.templates/collaborationSetup.vm", ctx, outputFileName);
  }

  private void copyBoilerplateCode() throws SolutionGenerationException {
    File outputDir = new File(this.outputDirectory);
    recurisevelyDelete(outputDir);
    outputDir.mkdir();

    final File jarFile = new File(getClass().getProtectionDomain().getCodeSource().getLocation().getPath());

    try {
      if (jarFile.isFile()) {  // Run with JAR file
        final JarFile jar = new JarFile(jarFile);
        final Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
        while (entries.hasMoreElements()) {
         JarEntry entry = entries.nextElement();
         if(entry.getName().startsWith("BMerodeChaincodeStructure/") && entry.getName().length() > "BMerodeChaincodeStructure/".length()) {
           String[] parts = StringUtils.split(entry.getName(),"/");
           if(!parts[parts.length-1].contains("."))
             continue;

           String cleanEntryName = entry.getName().substring("BMerodeChaincodeStructure/".length());
           InputStream is = jar.getInputStream(entry);
           Path targetPath = Paths.get(this.outputDirectory).resolve(cleanEntryName);

           FileUtils.copyInputStreamToFile(is, targetPath.toFile());
           is.close();
         }
        }
        jar.close();
      } else {
        Path sourceDir = Paths.get(this.getClass().getClassLoader().getResource("BMerodeChaincodeStructure").getPath());
        AtomicBoolean success = new AtomicBoolean(true);

        try {
          Path finalSourceDir = sourceDir;
          Files.walk(sourceDir)
                  .forEach(sourcePath -> {
                    try {
                      Path targetPath = Paths.get(this.outputDirectory).resolve(finalSourceDir.relativize(sourcePath));
                      Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                      e.printStackTrace();
                      success.set(false);
                    }
                  });
        } catch (IOException e) {
          throw new SolutionGenerationException("SolutionGenerator.copyBoilerplateCode(): " + e.toString());
        }

        if(!success.get()) {
          throw new SolutionGenerationException("SolutionGenerator.copyBoilerplateCode(): failed: ");
        }
      }
    } catch(IOException e) {
      e.printStackTrace();
      throw new SolutionGenerationException("Could not Copy Boilerplate Code");
    }


    /*
    Path sourceDir = Paths.get(this.getClass().getClassLoader().getResource("BMerodeChaincodeStructure").getPath());
    File outputDir = new File(this.outputDirectory);

    recurisevelyDelete(outputDir);

    outputDir.mkdir();

    AtomicBoolean success = new AtomicBoolean(true);

    try {
      Path finalSourceDir = sourceDir;
      Files.walk(sourceDir)
              .forEach(sourcePath -> {
                try {
                  Path targetPath = Paths.get(this.outputDirectory).resolve(finalSourceDir.relativize(sourcePath));
                  Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                  success.set(false);
                }
              });
    } catch (IOException e) {
      throw new SolutionGenerationException("SolutionGenerator.copyBoilerplateCode(): " + e.toString());
    }

    if(!success.get()) {
      throw new SolutionGenerationException("SolutionGenerator.copyBoilerplateCode(): failed");
    } */
  }

  private void generateInputValidators(Mermaidmodel model, MerodeExtension ext) throws SolutionGenerationException {
    for(Metaobject mo: model.getMetamodel().getMetaobjects().getMetaobject())
      generateInputValidators(model.getMetamodel(), mo, ext);
  }

  private void generateInputValidators(Metamodel model, Metaobject mo, MerodeExtension ext) throws SolutionGenerationException {
    InputValidatorContext ctx = new InputValidatorContextBuilder(model, mo, ext).build();

    String outputFileName = this.outputDirectory + File.separator + INPUT_VALIDATOR_FOLDER + mo.getName() + "InputValidator.java";
    generateFile("be.unamur.generator.templates/inputValidator.vm", ctx, outputFileName);
  }

  private void generateBOTEntities(Mermaidmodel model, MerodeExtension ext) throws SolutionGenerationException {
    for(Metaobject mo : model.getMetamodel().getMetaobjects().getMetaobject()) {
      generateBOTEntity(mo, model, ext);
      //System.out.println(">> Generated Entity for " + mo.getName());
    }
  }

  private void generateBOTEntity(Metaobject bot, Mermaidmodel model, MerodeExtension ext) throws SolutionGenerationException {
    BusinessObjectTypeContext ctx = new BusinessObjectTypeContextBuilder(bot, model, ext).build();

    String outputFileName = this.outputDirectory + File.separator + ENTITY_FOLDER + bot.getName() + ".java";
    generateFile("be.unamur.generator.templates/entity.vm", ctx, outputFileName);
  }

  private void generateBOTGeneralStates(Mermaidmodel model, MerodeExtension ext) throws SolutionGenerationException {
    for(Metaobject mo : model.getMetamodel().getMetaobjects().getMetaobject()) {
      generateBOTGeneralState(mo, model, ext);
      //System.out.println(">> Generated General State for " + mo.getName());
    }
  }

  private void generateBOTGeneralState(Metaobject bot, Mermaidmodel model, MerodeExtension ext) throws SolutionGenerationException {
    StateContext ctx = new GeneralStateContextBuilder(model, ext, bot).build();

    String outputFileName = this.outputDirectory + File.separator + STATE_FOLDER + File.separator + Util.getStringWithFirstLowerCap(bot.getName()) + File.separator + bot.getName() + "State.java";
    generateFile("be.unamur.generator.templates/generalState.vm", ctx, outputFileName);
  }

  private void generateAllSpecificStates(Mermaidmodel model, MerodeExtension ext) throws SolutionGenerationException {
    for(Metaobject o : model.getMetamodel().getMetaobjects().getMetaobject())
      generateBOTSpecificStates(o, model, ext);
  }

  private void generateBOTSpecificStates(Metaobject bot, Mermaidmodel model, MerodeExtension ext) throws SolutionGenerationException {
    Metafsm fsm = be.unamur.metamodel.Util.getActiveFSM(bot);
    for(Metastate state : fsm.getMetastates().getMetastate())
      generateBOTSpecificState(bot, model, ext, state.getName());
    //System.out.println(">> Generated Specific States for " + bot.getName());
  }

  private void generateBOTSpecificState(Metaobject bot, Mermaidmodel model, MerodeExtension ext, String stateName) throws SolutionGenerationException {
    SpecificStateContext ctx = new SpecificStateContextBuilder(model, ext, bot, stateName).build();

    if(stateName.toUpperCase().equals("INITIAL")) {
      ctx.setStateName("allocated");
      stateName = "allocated";
    }

    //System.out.println("Generating State: " + stateName + " for object type " + bot.getName());

    String outputFileName = this.outputDirectory + File.separator + STATE_FOLDER + File.separator + Util.getStringWithFirstLowerCap(bot.getName()) + File.separator + bot.getName() + Util.getStringWithFirstCap(stateName) + "State.java";
    generateFile("be.unamur.generator.templates/specificState.vm", ctx, outputFileName);
  }

  private void generateEventsMapping(Mermaidmodel model) throws SolutionGenerationException {
    EventsMappingContext ctx = new EventsMappingContextBuilder(model).build();

    String outputFileName = this.outputDirectory + File.separator + EVENT_FOLDER + File.separator + "EventsMapping.java";
    generateFile("be.unamur.generator.templates/eventsMapping.vm", ctx, outputFileName);
  }

  private void generateEPT(Mermaidmodel model, MerodeExtension ext) throws SolutionGenerationException {
    EPTContext ctx = new EPTContextBuilder(model, ext).build();
    String outputFilePath = this.outputDirectory + File.separator + PERMISSIONS_FOLDER + File.separator + "EPT.java";

    generateFile("be.unamur.generator.templates/ept.vm", ctx, outputFilePath);
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

  private void recurisevelyDelete(File f) {
    if (!f.exists())
      return;

    if (f.isDirectory())
      for (File file : Objects.requireNonNull(f.listFiles()))
        recurisevelyDelete(file);

    f.delete();
  }
}
