import be.unamur.cli.GenerateCommand

fun main(args: Array<String>) {
    Main.main(args)
}

object Main {
    fun main(args: Array<String>) {
        GenerateCommand().main(args)
    }
}