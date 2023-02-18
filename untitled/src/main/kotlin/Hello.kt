import java.util.* // required import
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
}
fun main(args: Array<String>) {
    feedTheFish()


    fun swim(speed: String = "fast") {
        println("The fish is swimming $speed")
    }

    fun main() {
        // Call swim() using the default parameter value
        swim()

        // Call swim() and pass the speed parameter without a name
        swim("slow")

        // Call swim() by naming the speed parameter
        swim(speed = "turtle-like")
    }

    fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
        return when {
            temperature > 30 -> true
            dirty > 30 -> true
            day == "Sunday" -> true
            else -> false
        }
    }

    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
        println("Change water: ${shouldChangeWater(day)}")
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}





