object MyClass {
    def fib(n: Int) : Int = {
        if (n == 0) {
            return 0
        } else if (n == 1) {
            return 1
        } else {
            return fib(n-1) + fib(n-2)
        }
    } 

    def main(args: Array[String]) = {
        for (i <- 0 to 10) {
            println(fib(i))
        }
    }
}