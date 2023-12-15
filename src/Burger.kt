class Burger(name:String ,price: Int) {

    var name: String
    var price: Int

    init {
        this.name = name
        this.price = price
    }

    var burgerList = mutableListOf<Burger>()

    fun addBurger(burger: Burger) {
        burgerList.add(burger)
    }

    fun initializeBurgers() {
        addBurger(Burger("새우버거", 5000))
        addBurger(Burger("햄버거", 3500))
        addBurger(Burger("치즈버거", 4500))
    }

    fun showBurger() {
        for ((idx, burger) in burgerList.withIndex()) {
            println("${idx+1}.${burger.name} - $${burger.price}")
        }
    }

}

