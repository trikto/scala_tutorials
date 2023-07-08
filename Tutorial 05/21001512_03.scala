object MyClass {
    def sum(n: Int) : Int = {
        if (n == 1) {
            return 1
        } else {
            return n + sum(n - 1)
        }
    } 

    def main(args: Array[String]) = {
        println(sum(5))
    }
}