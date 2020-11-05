import be.unamur.generator.SolutionGenerator
import be.unamur.generator.exception.SolutionGenerationException
import be.unamur.generator.iar.domain.ResolveOperation
import be.unamur.generator.iar.parser.IARComponentSplitter
import be.unamur.loader.ModelParser
import be.unamur.loader.exception.ModelParsingException
import be.unamur.metamodel.Mermaidmodel
import be.unamur.metamodel.Metamethod
import domain.IAR
import domain.IARPathElement
import java.math.BigInteger

fun main() {
    Main.main()
}

object Main {
    fun main() {

        val marketPlaceModelPath = Main::class.java.classLoader.getResource("toRemove/permtest-iar.mxp")?.file
        println(marketPlaceModelPath)
        var model: Mermaidmodel? = null
        model = try {
            ModelParser.parseModel(marketPlaceModelPath)
        } catch (e: ModelParsingException) {
            e.printStackTrace()
            return
        }

        val gen = SolutionGenerator("/Users/vamarald/Documents/Temp/BMO-KTL-2/");
        try {
            gen.generate(model);
        } catch(e: SolutionGenerationException) {
            e.printStackTrace();
            return;
        }
    }
}