package task1

class Access {
    fun login(name:String,password:Int,list:MutableList<Customer>){
        var valid:Int?=Validation().validate(name,password)
        list.forEach { println(it) }



        if(valid!=null){
            var loop:Int=6
            while (loop!=0){
                println("0->Exit 1->Deposit funds  2->withdraw funds 3->Deposit funds in Fixed deposit 4->Withdraw funds from Fixed Deposit ")
                loop= readln().toInt()
                when(loop){
                    0->println("Thank You")
                    1->{
                        println("Enter the amount that you need to deposit")
                        var deposit= readln().toInt()
                        BankAccount.SavingsAccount(list[valid].accountNumber, list[valid].bankBalance, list[valid]).depositing(deposit)

                    }
                    2->{
                        println("1->Savings Account   2->Current Account")
                        var account= readln().toInt()
                        when(account){

                            1->{
                                println("Enter the amount that you need to withdraw")
                                var withdraw= readln().toInt()
                                BankAccount.SavingsAccount(list[valid].accountNumber, list[valid].bankBalance, list[valid]).withdrawingFunds(withdraw)

                            }
                            2->{
                                println("Enter the amount that you need to withdraw")
                                var withdraw= readln().toInt()
                                BankAccount.CurrentAccount(list[valid].accountNumber, list[valid].bankBalance, list[valid]).withdrawingFunds(withdraw)

                            }
                            else-> println("Incorrect selection")
                        }

                    }
                    3->{
                        println("Enter the amount that you need to deposit")
                        var withdraw= readln().toInt()
                        BankAccount.FixedDepositAccount(list[valid].accountNumber, list[valid].bankBalance, list[valid]).depositing(withdraw)

                    }
                    4->{
                        println("Enter the amount that you need to withdraw")
                        var withdraw= readln().toInt()
                        BankAccount.FixedDepositAccount(list[valid].accountNumber, list[valid].bankBalance, list[valid]).withdrawingFunds(withdraw)

                    }
                    else->println("Incorrect selection")
                }
            }
        }else{
            println("In valid")
        }
    }
}
class Validation{

    fun validate(name: String,password: Int):Int?{


        var list = CustomerList.customerList
        for(i in 0 until list.size){

            if (name.equals(list[i].name) && password.equals(list[i].password)){

                return i
                break
            }
            else
                continue
        }
        return null
    }
}