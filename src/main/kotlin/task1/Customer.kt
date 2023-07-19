package task1

data class Customer(
    val name:String,
    val password:Int,
    val accountNumber:Long,
    val phoneNum: Int,
    var bankBalance:Float,
    val fixedBalance:Float
)