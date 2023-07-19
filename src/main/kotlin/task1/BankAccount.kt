package task1

sealed class BankAccount(var customer: Customer) {
    var list=CustomerList.customerList
    class SavingsAccount(val accountNumber: Long, private var balance: Float, customer: Customer) :
        BankAccount(customer) {

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
object CustomerList{
    var customerList = mutableListOf<Customer>()

    init {


        val customer1 = Customer("mahith", 123, 1, 123, 10f, 100f)
        val customer2 = Customer("arjun", 123, 2, 456, 25f, 50f)
        val customer3 = Customer("manoj", 123, 3, 789, 20f, 100f)
        customerList.add(customer1)
        customerList.add(customer2)
        customerList.add(customer3)


    }
    fun createList() {
        var name:String= readln()
        var password:Int= readln().toInt()
        var lastIndex=customerList.size
        var accountNumber:Long= customerList[lastIndex-1].accountNumber + 1
        var phoneNum:Int= readln().toInt()
        var bankBalance:Float= readln().toFloat()
        var fixedBalance:Float= readln().toFloat()

        val customer = Customer(name,password,accountNumber,phoneNum,bankBalance,fixedBalance)

        customerList.add(customer)
//        customerList.forEach { println(it) }
        Access().login(name,password,customerList)
//        for(i in 0 until customerList.size){
//            println("${customerList[i].name}")
//        }

    }
}
