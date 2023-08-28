object MyClass {
    def calculateAverage(numbers: List[Double]) : Double = {
        val temps = numbers.map(num => (num * 9/5) + 32)
        val total = temps.reduce((acc,num) => acc + num)
        val length = numbers.length
        val average = total / length
        return average
    } 

    def main(args: Array[String]) = {
        val out = calculateAverage(List(31,32,33,34,35))
        println("%.2f".format(out))
    }
}