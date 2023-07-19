package task1

fun main(args: Array<String>) {

    println("1->create account  2->login")

    var loginVariable:Int=readln().toInt()
    when(loginVariable){
        1->CustomerList.createList()

        2->{
            var name:String= readln()
            var password:Int= readln().toInt()
            Access().login(name,password,CustomerList.customerList)

        }
    }


}










