package task1

fun main(args: Array<String>) {

    val customer1 = Customer("mahith",1,123,10f,100f)
    val customer2 = Customer("arjun",2,456,25f,50f)
    val customer3 = Customer("manoj",2,789,20f,100f)



    val amount:Int= readln().toInt()
    BankAccount.SavingsAccount(customer1.accountNumber, customer1.bankBalance, customer1).withdrawingFunds(amount)


    val withDraw:Int=readln().toInt()
    BankAccount.CurrentAccount(customer2.accountNumber, customer2.bankBalance, customer1).depositing(withDraw)

    val fixedBalance:Int=readln().toInt()
    BankAccount.FixedDepositAccount(customer3.accountNumber, customer3.fixedBalance, customer1).depositing(fixedBalance)

}

data class Customer(val name:String, val accountNumber:Long, val phoneNum: Int, var bankBalance:Float, val fixedBalance:Float)


sealed class BankAccount(var customer: Customer) {
    class SavingsAccount(val accountNumber: Long, private var balance: Float, customer: Customer) : BankAccount(customer) {

        fun depositing(amount: Int) {
            customer.bankBalance += amount
            println("Deposited successful in savings account and current balance is ${customer.bankBalance}")
        }

        fun withdrawingFunds(amount: Int) {
            if (customer.bankBalance > amount) {
                customer.bankBalance -= amount
                println("Debited successful in your savings account and current balance is ${customer.bankBalance}")
            } else {
                println("Insufficient funds your current balance is $balance in your savings account")
            }
        }
    }


    class CurrentAccount(val accountNumber: Long, private var balance: Float,customer: Customer) : BankAccount(customer) {
        fun depositing(amount: Int) {
            balance += amount
            println("Deposited successful in your current account and current balance is $balance")
        }

        fun withdrawingFunds(amount: Int) {
            if (balance > amount) {
                balance -= amount
                println("Debited successful in your current account and current balance is $balance")
            } else {
                println("Insufficient funds your current balance is $balance in your current account")
            }
        }
    }

    class FixedDepositAccount(val accountNumber: Long, private var fixedBalance: Float, customer: Customer) : BankAccount(
        customer
    ) {
        fun depositing(amount: Int) {
            fixedBalance += amount
            println("Deposited successful in FixedDeposit account and current balance is $fixedBalance")
        }

        fun withdrawingFunds(amount: Int) {
            if (fixedBalance > amount) {
                fixedBalance -= amount
                println("Debited successful in your fixed Deposit and current balance is $fixedBalance")
            } else {
                println("Insufficient funds your current balance is $fixedBalance in your fixed Deposit")
            }
        }

    }
}

