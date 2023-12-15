class Side(name:String ,price: Int) {

    var name:String
    var price:Int
    init {
        this.name = name
        this.price = price
    }
    var sideList = mutableListOf<Side>()

    fun addSide(side: Side) {
        sideList.add(side)
    }
    fun initializeSide() {
        addSide(Side("감튀", 2500))
        addSide(Side("치킨너겟", 3000))
        addSide(Side("치즈스틱", 4000))

    }
    fun showSide() {
        for ((idx, side) in sideList.withIndex()) {
            println("${idx + 1}.${side.name} - $${side.price}")
        }
    }
}
