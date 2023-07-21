package task2


class ShoppingCart {

    var list= mutableListOf<Item>()


    fun addItem(item:Item) {
        list.add(item)
        var num=0


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
