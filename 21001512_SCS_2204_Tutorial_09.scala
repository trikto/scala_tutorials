object MyClass {
    class Rational(x : Double) {
        def neg: Double = -x

        def frac_division(numerator: Int, denominator: Int): Double = {
            val numer = numerator.toDouble
            val denom = denominator.toDouble
            return numer / denom
        }

        def sub(a: Double, b: Double): Double = a - b
    }

    class Account(n: String) {
        val name:String = n
        var amount = 0

        def deposit(amt: Int): Int = {
            amount = amount + amt
            return amount
        }

        def withdraw(amt: Int): Int = {
            amount = amount - amt
            return amount
        }

        def transfer(amt: Int, acc:Account): Unit = {
            amount = amount - amt
            acc.deposit(amt)
        }
    }

    def main(args: Array[String]) = {
        //1.
        val num = new Rational(45)
        println(num.neg)

        //2.
        val num1 = num.frac_division(3,4)
        val num2 = num.frac_division(5,8)
        val num3 = num.frac_division(2,7)
        
        val sub_value = num.sub(num.sub(num1, num2),num3)
        println(sub_value)

        //3.
        val acc1 = new Account("acc1")
        val acc2 = new Account("acc2")
        val acc3 = new Account("acc3")

        println("Acc1 balance " + acc1.deposit(1500))
        println("Acc1 balance " + acc1.withdraw(500))
        acc1.transfer(500, acc2)
        println(s"This account balance: ${acc1.amount}")
        println(s"Second account balance: ${acc2.amount}")
        println("Acc3 balance" + acc3.withdraw(500))

        //4.
        val Bank = List(acc1, acc2, acc3)
        //4.1
        val positive_accounts = Bank.filter(account => account.amount > 0)
        println("Positive accounts: " + positive_accounts.map(account => account.name))

        //4.2
        var total = 0
        Bank.map(account => total = total + account.amount)
        println(s"Total amount: ${total}")

        //4.3
        var new_total = 0.0
        Bank.map(account => {
            if (account.amount > 0) {
                new_total = new_total + (0.05 * account.amount) + account.amount
            } else {
                new_total = new_total + (0.1 * account.amount) + account.amount
            }
        })

        println(s"Total amount: ${new_total}")

    }
}