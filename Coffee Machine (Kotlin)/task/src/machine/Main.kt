package machine

class CoffeeMaker() {

    var water = 400
    var milk = 540
    var coffee = 120
    var cups = 9
    var money = 550
    var exit = false

    fun waterCounter(drink: Int): Int {
        return when (drink) {
            1 -> 250
            2 -> 350
            3 -> 200
            else -> 0
        }
    }

    fun milkCounter(drink: Int): Int {
        return when (drink) {
            1 -> 0
            2 -> 75
            3 -> 100
            else -> 0
        }
    }

    fun coffeeCounter(drink: Int): Int {
        return when (drink) {
            1 -> 16
            2 -> 20
            3 -> 12
            else -> 0
        }
    }

    fun moneyCounter(drink: Int): Int {
        return when (drink) {
            1 -> 4
            2 -> 7
            3 -> 6
            else -> 0
        }
    }

    fun textOutput(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
        val text: String = """
        The coffee machine has:
        $water ml of water
        $milk ml of milk
        $coffee g of coffee beans
        $cups disposable cups
        $$money of money
        
    """.trimIndent()
        return println(text)
    }

    fun fillWater(): Int {
        println("Write how many ml of water you want to add:\n")
        return readln().toInt()
    }

    fun fillMilk(): Int {
        println("Write how many ml of milk you want to add:\n")
        return readln().toInt()
    }

    fun fillCoffee(): Int {
        println("Write how many grams of coffee beans you want to add:\n")
        return readln().toInt()
    }

    fun fillCups(): Int {
        println("Write how many disposable cups you want to add:\n")
        return readln().toInt()
    }

    fun optionsChooser(): Int {
        println("Write action (buy, fill, take, remaining, exit):")
        val action: String = readln()
        return when (action) {
            "buy" -> 1
            "fill" -> 2
            "take" -> 3
            "remaining" -> 4
            "exit" -> 5
            else -> 0
        }
    }

    fun coffeeAbilityChecker(water: Int, milk: Int, coffee: Int, cups: Int, drink: Int): Boolean {
        return if (water < waterCounter(drink)) {
            println("Sorry, not enough water!")
            false
        } else if (coffee < coffeeCounter(drink)) {
            println("Sorry, not enough coffee!")
            false
        } else if (milk < milkCounter(drink)) {
            println("Sorry, not enough milk!")
            false
        } else if (cups < 1) {
            println("Sorry, not enough cups!")
            false
        } else true
    }

    fun processing() {
        while (!exit){
            when(optionsChooser()){
                1-> {
                    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                    val drinkOption = readln()
                    if (drinkOption != "back"){
                        val drink = drinkOption.toInt()
                        if (coffeeAbilityChecker(water,milk,coffee,cups, drink)){
                            println("I have enough resources, making you a coffee!")
                            water -= waterCounter(drink)
                            milk -= milkCounter(drink)
                            coffee -= coffeeCounter(drink)
                            cups -= 1
                            money += moneyCounter(drink)
                        }
                    }
                }
                2-> {
                    water += fillWater()
                    milk += fillMilk()
                    coffee += fillCoffee()
                    cups+= fillCups()
                }
                3-> {
                    println("I gave you $$money")
                    money = 0
                }
                4-> {
                    textOutput(water, milk, coffee, cups, money)
                }
                5-> {
                    exit = true
                }
            }
        }
    }
}

fun main(){
    val coffee = CoffeeMaker()
    coffee.processing()
}
