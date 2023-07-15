object MyClass {
    def toUpper(inp: String) : String = {
        return inp.toUpperCase()
    } 

    def toLower(inp: String) : String = {
        return inp.toLowerCase()
    }

    def formatNames(name: String, start: Int, end: Int, format: String => String): Unit = {
        if (start == 0 && end == 0) {
            println(format(name))
        } else {
            var startingName = name.substring(0,start)
            var formattedName = format(name.substring(start, end))
            var remainingName = name.substring(end)
            var result = startingName + formattedName + remainingName
            println(result)
        }
        
    }

    def main(args: Array[String]) = {
        formatNames("Benny", 0, 0, toUpper)
        formatNames("Niroshan", 0, 2, toUpper)
        formatNames("Saman", 0, 0, toLower)
        formatNames("Kumara", 5, 6, toUpper)
    }
}