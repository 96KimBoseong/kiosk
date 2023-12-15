class Drink(name: String, price: Int) {
    var name: String
    var price: Int
    init {
        this.name = name
        this.price = price
    }
    var drinkList = mutableListOf<Drink>()

    fun addDrink(drink: Drink) {
        drinkList.add(drink)
    }

    fun initializeDrink() {
        addDrink(Drink("콜라", 1000))
        addDrink(Drink("사이다", 1000))
        addDrink(Drink("쩨로", 1000))
    }

    fun showDrink() {
        for ((idx , Drink) in drinkList.withIndex() ) {
            println("${idx+1}.${Drink.name} - $${Drink.price}")
        }
    }
}

