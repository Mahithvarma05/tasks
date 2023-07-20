package task2

fun main(args: Array<String>) {

    println("select the item you need")
    ShoppingCart().displayItems()
    var select= readln().toInt()
    ShoppingCart().addItem(ItemsList.itemstList[select-1])
    println("Items in cart")
    ShoppingCart().displayCartItems()

    var loop=0

    while (loop!=5){
        println("1->select another item  2->remove item from  cart  3->get price  4-> get 10% discount  5->exit")
        var choice= readln().toInt()
        when(choice){
            1->{
                var select= readln().toInt()
                println("${ItemsList.itemstList[select-1]}")
                ShoppingCart().addItem(ItemsList.itemstList[select-1])
                println("Items in cart")
                ShoppingCart().displayCartItems()
            }
            2->{
                println("select remove item from cart")
                var select= readln().toInt()
                ShoppingCart().removeItem(select-1)
                println("Items in cart")
                ShoppingCart().displayCartItems()
            }
            3->{
                var price=ShoppingCart().totalPrice()
                println("tota price is $price")
            }
            4->{

                var dicountPrice=ShoppingCart().applyDiscount(10)
                println("After discount price $dicountPrice /-")
            }
            5->{
                println("Thank you visit again")
                loop=5
            }
        }
    }



}


