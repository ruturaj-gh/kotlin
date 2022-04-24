

fun main() {
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")
    
    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
    System.out.print("hello world how are you")
    

}

class Dice (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}