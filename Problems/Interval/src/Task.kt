import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    println(if (n >= 19 || n == 15 || n == 16 || n <= 12 && n > -15) "True" else "False")
}