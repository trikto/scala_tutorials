object MyClass {
    def toUpper(inp: String) : String = {
        return inp.toUpperCase()
    } 

    def toLower(inp: String) : String = {
        return inp.toLowerCase()
    }

    def formatNames(name: String, format: String => String): String = {
        format(name)
    }

    def main(args: Array[String]) = {
        println(formatNames("Benny", toUpper))
        println(formatNames("Niroshan", toLower))
        println(formatNames("Saman", toUpper))
        println(formatNames("Kumara", toLower))
    }
}