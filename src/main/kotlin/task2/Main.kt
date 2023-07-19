package task2

fun main(args: Array<String>) {


    var item1=Item("pen",20)
    var item2=Item("cup",200)
    var item3=Item("keyboard",2000)
    var item4=Item("mobile",20000)

    var li:Int?=null

    var cart=ShoppingCart()

    cart.addItem(item1)
    cart.addItem(item2)
    cart.addItem(item3)
    cart.addItem(item4)

    cart.removeItem(item2)

    var total=cart.totalPrice()
    println("total price $total /-")

    var discount=50
    var afterDiscount=cart.applyDiscount(discount)
    println("Price after the discount $afterDiscount /-")


}
data class Item(val name:String,val price:Int)

class ShoppingCart {

    private var list= ArrayList<Item>()


    fun addItem(item:Item) {
        list.add(item)

    }

    fun removeItem(item: Item) {
        list.remove(item)

    }
    fun totalPrice():Int{
        var sum:Int=0
        for(i in 0 until list.size){
            sum+= list[i].price
        }
        return sum
    }

    fun applyDiscount(rate: Int): Double? {
        return totalPrice()?.let { (it - (it * rate) / 100).toDouble() }

    }



}