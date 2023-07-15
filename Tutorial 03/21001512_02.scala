object MyClass {
    def listFunc() : Unit = {
        var str = scala.io.StdIn.readLine("Enter the string list: ")
        var strList = str.split(",").toList
        var filtered = strList.filter(_.length > 5)
        filtered.foreach(println)
    }

    def main(args: Array[String]) = {
        listFunc()
    }
}