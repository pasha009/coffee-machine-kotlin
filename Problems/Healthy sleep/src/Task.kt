import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val shouldSleepLeast = scanner.nextInt()
    val shouldSleepMost = scanner.nextInt()
    val annSleeps = scanner.nextInt()
    println(if (annSleeps < shouldSleepLeast) {
        "Deficiency"
    } else if (annSleeps > shouldSleepMost) {
        "Excess"
    } else {
        "Normal"
    })
}