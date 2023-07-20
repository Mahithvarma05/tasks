package task2


class ShoppingCart {

    private var list= mutableListOf<Item>()


    fun addItem(item:Item) {
        list.add(item)
        var num=0
        for (i in 0 until list.size){
            num+=1
            println("$num -> name:${list[i].name} price:${list[i].price}")
        }

    }

    fun removeItem(i: Int) {
        list.removeAt(i)

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

    fun displayItems(){
        var list=ItemsList.itemstList
        var num=0
        for (i in 0 until list.size){
            num+=1
            println("$num -> name:${list[i].name} price:${list[i].price}")
        }
    }
    fun displayCartItems(){

        var num=0
        for (i in 0 until list.size){
            num+=1
            println("$num -> name:${list[i].name} price:${list[i].price}")
        }
    }



}
object ItemsList{
    var itemstList = mutableListOf<Item>()

    init {
        var item1=Item("pen",20)
        var item2=Item("cup",200)
        var item3=Item("keyboard",2000)
        var item4=Item("mobile",20000)
        itemstList.apply {
            add(item1)
            add(item2)
            add(item3)
            add(item4)

        }


    }
}