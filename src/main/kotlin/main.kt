import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

fun main() {
    val year: Int = Calendar.getInstance().get(Calendar.YEAR)
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    val today = LocalDate.now()
    val formattedToday = today.format(formatter)

    println("Today is $formattedToday")

    println("Enter today's month: ")
    val month: Int = readLine()!!.toInt()

    println("Enter today's day: ")
    val day: Int = readLine()!!.toInt()

    var holdday: LocalDate = LocalDate.of(year,month,day)


    println("${holdday.isBefore(today)}")
    if (holdday.isBefore(today)){
        println("$holdday")
        holdday = holdday.plusYears(1)
        println("$holdday")
    }

    val next = holdday.format(formatter)

    val daysToday = today.until(holdday, ChronoUnit.DAYS)

    if (daysToday.toInt() == 0){
        println("The full moon is today!")
    } else {
        println("The next full moon is: $next and there are $daysToday until then!")
    }




}