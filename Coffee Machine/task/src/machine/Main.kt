package machine

import java.util.Scanner

class CoffeeMachine(var water: Int, var milk: Int, var beans: Int, var cups: Int, var money: Int) {

    private data class Requirements(val water: Int, val milk: Int, val beans: Int, val cups: Int, val money: Int)
    private val scanner = Scanner(System.`in`)
    private val espressoRequirements = Requirements(250, 0, 16, 1, 4)
    private val latteRequirements = Requirements(350, 75, 20, 1, 7)
    private val cappuccinoRequirements = Requirements(200, 100, 12, 1, 6)

    fun run() {
        loop@ do {
            print("Write action (buy, fill, take, remaining, exit): ")
            val choice = scanner.next()
            if (choice == "exit") break
            println()
            when (choice) {
                "buy" -> buyPrompt()
                "fill" -> fill()
                "take" -> take()
                "remaining" -> remaining()
                else -> continue@loop
            }
            println()
        } while (true)

    }

    private fun buyPrompt() {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
        when (scanner.next()) {
            "1" -> buy(espressoRequirements)
            "2" -> buy(latteRequirements)
            "3" -> buy(cappuccinoRequirements)
        }
    }

    private fun buy(coffeeRequirements: Requirements) {
        when {
           water < coffeeRequirements.water -> return blame("water")
           milk < coffeeRequirements.milk -> return blame("milk")
           beans < coffeeRequirements.beans -> return blame("beans")
           cups < coffeeRequirements.cups -> return blame("cups")
        }
        println("I have enough resources, making you a coffee!")
        water -= coffeeRequirements.water
        milk -= coffeeRequirements.milk
        beans -= coffeeRequirements.beans
        cups -= coffeeRequirements.cups
        money += coffeeRequirements.money
    }

    private fun blame(bt: String) {
        println("Sorry, not enough $bt!")
    }

    private fun fill() {
        print("Write how many ml of water do you want to add: ")
        water += scanner.nextInt()
        print("Write how many ml of milk do you want to add: ")
        milk += scanner.nextInt()
        print("Write how many grams of coffee beans do you want to add: ")
        beans += scanner.nextInt()
        print("Write how many cups of coffee do you want to add: ")
        cups += scanner.nextInt()
    }

    private fun take() {
        println("I gave you $$money")
        money = 0
    }

    private fun remaining() {
        println("The coffee machine has: ")
        println("$water of water")
        println("$milk of milk")
        println("$beans of coffee beans")
        println("$cups of disposable cups")
        println("$$money of money")
    }
}

fun main() {
    val coffeeMachine = CoffeeMachine(400, 540, 120, 9, 550)
    coffeeMachine.run()
}


