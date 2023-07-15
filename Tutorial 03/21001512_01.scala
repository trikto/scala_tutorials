object MyClass {
    def reverseString(str: String) : String = {
        if (str.isEmpty) {
            return str
        } else {
            return reverseString(str.tail) + str.head
        }
    }
    def pattern(): Unit = {
        var inp = scala.io.StdIn.readLine("Enter the string: ")
        println(reverseString(inp))
    }

    def main(args: Array[String]) = {
        pattern()
    }
}