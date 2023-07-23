object MyClass {
    def isLowerCase(c: Char): Boolean = {
        c.toInt >= 97 && c.toInt <= 122
    }

    def encrypt(str: String, number: Int) : Unit = {
        var arr = str.toCharArray()
        for (element <- arr) {
            var num = number % 26

            if (isLowerCase(element)) {
                if (element.toInt + num > 122) {
                var num2 = (element.toInt + num) - 122
                print((96 + num2).toChar)
                } else {
                    print((element.toInt + num).toChar)
                }
            } else {
                if (element.toInt + num > 90) {
                var num2 = (element.toInt + num) - 90
                print((64 + num2).toChar)
                } else {
                    print((element.toInt + num).toChar)
                }
            }
        }
        println()
    }

    def decrpyt(str:String, number: Int) : Unit = {
        encrypt(str,26 - number)
    } 

    def cipher(str: String, number: Int, func: (String, Int) => Unit) : Unit = {
        func(str,number)
    }

    def main(args: Array[String]) = {
        encrypt("azAZ",54)
        decrpyt("dD",5)
        cipher("azAZ",54,encrypt)
    }
}