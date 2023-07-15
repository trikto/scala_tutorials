object MyClass {
    def avg(num1: Double, num2: Double) : Float = {
        var average = (num1 + num2) / 2
        var result = BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat
        return result
    }

    def main(args: Array[String]) = {
        println(avg(256.456178,456.7648))
    }
}