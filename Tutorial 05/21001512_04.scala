object MyClass {
    def isEven(n: Int) : Boolean = {
        if (n % 2 == 0) {
            return true
        } else {
            return false
        }
    } 

    def isOdd(n: Int) : Boolean = {
        return !(isEven(n))
    }

    def main(args: Array[String]) = {
        println(isEven(4))
        println(isOdd(4))
    }
}