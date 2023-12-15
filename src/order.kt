class Order {
    val buger = Burger("", 0)
    val drink = Drink("", 0)
    val side = Side("", 0)

   init{
        buger.initializeBurgers()
        side.initializeSide()
        drink.initializeDrink()
    }
    fun printMenu() {
        while (true) {
            println("[주문하기]")
            println("1.햄버거")
            println("2.사이드")
            println("3.음료")
            println("4.종료")


            val choice = readLine()!!.toIntOrNull()
            //널 처리 안하면 오류뜸 다시 한번 확인할것


            when (choice) {
                1 -> {
                    while (true){
                        //burger.initializeBurgers()
                        buger.showBurger()

                        println("뒤로가기는 4번")
                        val hamChoice = readLine()!!.toIntOrNull()
                        if(hamChoice == 4){
                            break
                        }
                    }

                }

                2 -> {
                    while (true){
                        //side.initializeSide()
                        side.showSide()
                        println("뒤로가기는 4번")
                        val sideChoice = readLine()!!.toIntOrNull()
                        if(sideChoice == 4){
                            break
                        }
                    }

                }

                3 -> {
                    while (true){
                        //drink.initializeDrink()
                        drink.showDrink()
                        println("뒤로가기는 4번")
                        val drinkChoice = readLine()!!.toIntOrNull()
                        if(drinkChoice == 4){
                            break
                        }
                    }

                }
                4->break
                else ->{
                    println("숫자로 입력 잘못됨")
                }
            }
        }
    }

}


