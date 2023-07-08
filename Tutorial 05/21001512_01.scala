object MyClass {
    def prime(num: Int) : Boolean = {
        for (i <- 2 to num - 1) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    } 

    def main(args: Array[String]) = {
        println(prime(5))
    }
}