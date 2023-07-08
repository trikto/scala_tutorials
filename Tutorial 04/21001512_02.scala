object MyClass {
    def pattern(): String = {
        var inp = Integer.parseInt(scala.io.StdIn.readLine("Enter the num: "))
        inp match{
            case x if inp < 0 => "Negative"
            case x if (inp == 0) => "Zero"
            case x if (inp % 2 == 0) => "Even"
            case x if (inp % 2 != 0) => "Odd"
        }
    }

    def main(args: Array[String]) = {
        println(pattern())
    }
}