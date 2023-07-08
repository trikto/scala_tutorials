object MyClass {
    def prime(num: Int) : Boolean = {
        for (i <- 2 to num - 1) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }

    def primeSeq(n : Int) : Unit = {
        for (j <- 2 to n - 1) {
            if (prime(j)) {
                println(j)
            }
        }
    } 

    def main(args: Array[String]) = {
        primeSeq(10)
    }
}