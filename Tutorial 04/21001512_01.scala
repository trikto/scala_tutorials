object MyClass {
    def deposit(amount: Int): Double = {
        if (amount <= 20000) {
            return 0.02 * amount
        } else if (amount <= 200000) {
            return 0.035 * amount
        } else if (amount <= 2000000) {
            return 0.04 * amount
        } else {
            return 0.065 * amount
        }
    }

    def main(args: Array[String]) = {
        println(deposit(10000))
        println(deposit(30000))
        println(deposit(100000))
        println(deposit(1000000))
        println(deposit(10000000))
    }
}