package task2

fun main(args: Array<String>) {

    var shoppingCart=ShoppingCart()

    println("select the item you need")
    shoppingCart.displayItems()
    var select= readln().toInt()
    shoppingCart.addItem(ItemsList.itemstList[select-1])
    println("Items in cart")
    shoppingCart.displayCartItems()


    var loop=0

    while (loop!=5){
        println("1->select another item  2->remove item from  cart  3->get price  4->get 10% discount  5->exit")
        var choice= readln().toInt()
        when(choice){
            1->{
                var select= readln().toInt()
                println("${ItemsList.itemstList[select-1]}")
                shoppingCart.addItem(ItemsList.itemstList[select-1])
                println("Items in cart")
                shoppingCart.displayCartItems()
            }
            2->{
                println("select remove item from cart")
                var select= readln().toInt()
                shoppingCart.removeItem(select-1)
                println("Items in cart")
                shoppingCart.displayCartItems()
            }
            3->{
                var price=shoppingCart.totalPrice()
                println("total price is $price /-")
            }
            4->{

                var dicountPrice=shoppingCart.applyDiscount(10)
                println("After discount price $dicountPrice /-")
            }
            5->{
                println("Thank you visit again")
                loop=5
            }
        }
    }



}


