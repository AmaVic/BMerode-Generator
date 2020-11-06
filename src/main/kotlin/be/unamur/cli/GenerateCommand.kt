package be.unamur.cli

import be.unamur.generator.SolutionGenerator
import be.unamur.generator.exception.SolutionGenerationException
import be.unamur.loader.ModelParser
import be.unamur.loader.exception.ModelParsingException
import be.unamur.metamodel.Mermaidmodel
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.path
import java.io.File


class GenerateCommand: CliktCommand() {
    val modelFilePath by option("-m", "--model", help = "Absolute Path to .mxp model file").path()
    val outputPath by option("-o", "--output", help = "Absolute Generation Output Directory").path()

    override fun run() {
        echo("==========BMERODE Generation Tool==========")
        echo("===========================================")
        echo("> Input Model File: ${modelFilePath?.toAbsolutePath()}")

        val f: File? = modelFilePath?.toFile()
        if(f == null) {
            echo("> ERROR: File ${modelFilePath?.toAbsolutePath()} does not exist")
            return
        }

        if(!f.exists()) {
            echo("> ERROR: File ${modelFilePath?.toAbsolutePath()} does not exist")
            return
        }

        echo("> Loading Model Selected File")

        var model: Mermaidmodel?
        model = try {
            ModelParser.parseModel(f.absolutePath)
        } catch (e: ModelParsingException) {
            e.printStackTrace()
            return
        }

        val gen = SolutionGenerator(outputPath?.toAbsolutePath().toString());
        try {
            gen.generate(model);
        } catch(e: SolutionGenerationException) {
            e.printStackTrace();
            return;
        }

    }
}