object MyClass {
    def sumEven(n: Int) : Int = {
        var num = 0
        if (n % 2 == 0) {
            num = n - 2
        } else {
            num = n - 1
        }
        sum(num)
    }
    
    def sum(n: Int) : Int = {
        if (n == 2) {
            return 2
        } else {
            return n + sum(n - 2)
        }
    } 

    def main(args: Array[String]) = {
        println(sumEven(6))
        println(sumEven(5))
    }
}