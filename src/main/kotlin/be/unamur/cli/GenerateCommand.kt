package be.unamur.cli

import be.unamur.generator.SolutionGenerator
import be.unamur.generator.exception.SolutionGenerationException
import be.unamur.loader.ModelParser
import be.unamur.loader.exception.ModelParsingException
import be.unamur.metamodel.Mermaidmodel
import be.unamur.metamodel.extension.MerodeExtension
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.path
import java.io.File


class GenerateCommand: CliktCommand() {
    val modelFilePath by option("-m", "--model", help = "Absolute Path to .mxp model file").path()
    val extensionFilePath by option("-e", "--extension", help = "Absolute Path to .mxpx model file").path()
    val outputPath by option("-o", "--output", help = "Absolute Generation Output Directory").path()

    override fun run() {
        echo("==========BMERODE Generation Tool==========")
        echo("===========================================")
        echo("> Input Model File: ${modelFilePath?.toAbsolutePath()}")
        echo("> Extension File: ${extensionFilePath?.toAbsolutePath()}")

        val f: File? = modelFilePath?.toFile()
        val extF: File? = extensionFilePath?.toFile()
        if (f == null) {
            echo("> ERROR: File ${modelFilePath?.toAbsolutePath()} does not exist")
            return
        }

        if (extF == null) {
            echo("> ERROR: File ${extensionFilePath?.toAbsolutePath()} does not exist")
            return
        }

        if(!f.exists()) {
            echo("> ERROR: File ${modelFilePath?.toAbsolutePath()} does not exist")
            return
        }

        if(!extF.exists()) {
            echo("> ERROR: File ${extensionFilePath?.toAbsolutePath()} does not exist")
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

        echo("> Loading Extension File")
        var extension: MerodeExtension? = try {
            ModelParser.parseExtension(extF.absolutePath)
        } catch(e: ModelParsingException) {
            e.printStackTrace()
            return
        }

        /*extension?.ept?.authorization?.forEach{
            System.out.println("EPT Rule: ${it.eventId}; ${it.participantTypeId}; ${it.isAllowed}")
        }

        extension?.participantTypes?.participantType?.forEach {
            System.out.println("PTCP Type: ${it.objectTypeId}")
        }

        extension?.iars?.iar?.forEach {
            System.out.println("IAR: ${it.transitionId}; ${it.methodId}; ${it.rule}; ${it.isAllowed}")
        }*/

        val gen = SolutionGenerator(outputPath?.toAbsolutePath().toString());
        try {
            gen.generate(model, extension);
        } catch(e: SolutionGenerationException) {
            e.printStackTrace();
            return;
        }

    }
}