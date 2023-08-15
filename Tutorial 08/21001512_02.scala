object MyClass {
    val patternMatching: (Int) => String = (inp) => {
        if (inp < 0) "Negative"
        else if (inp == 0) "Zero"
        else if (inp % 2 == 0) "Even"
        else if (inp % 2 != 0) "Odd"
        else "Invalid input"
    }


    def main(args: Array[String]) = {
    val inp = Integer.parseInt(scala.io.StdIn.readLine("Enter the num: "))
    val out = patternMatching(inp)    
    println(out)
    }
}