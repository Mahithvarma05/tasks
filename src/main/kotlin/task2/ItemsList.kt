package task2


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