import java.util.* // required import

fun main() {
    val isUnit = println("this is an expression")
    println(isUnit) // prints "kotlin.Unit"

    val temperature = 10
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK"
    }."
    println(message)

}



fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println ("Today is $day and the fish eat $food")
}
fun main(args: Array<String>) {
    feedTheFish()
}
    fun randomDay() : String {
        val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
        return week[Random().nextInt(week.size)]
    }

fun fishFood (day : String) : String {
    val food: String
    when (day) {
        "Monday" -> food = "flakes"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Sunday" -> food = "plankton"
        else -> food = "nothing"
    }
    return food
    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
    }
}

