object MyClass {
    def filterEvenNumbers(nums: List[Int]): List[Int] = {
        nums.filter(value => value % 2 == 0)
    }

    def calculateSquare(nums: List[Int]) : List[Int] = {
        nums.map(value => value * value)
    }

    def filterPrime(nums: List[Int]): List[Int] = {
        nums.filter(value => {
            if (value < 2) {
            false
            } else if (value == 2) {
            true
            } else {
            var count = 0
            for (i <- 2 until value) {
                if (value % i == 0) {
                count = count + 1
                }
            }
            count == 0
            }
        })
    }


    def main(args: Array[String]) = {
        println(filterEvenNumbers(List(1,2,3,4,5,6,7,8,9,10)))
        println(calculateSquare(List(1,2,3,4,5)))
        println(filterPrime(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
    }
}