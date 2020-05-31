import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val hrs = scanner.next()
    val min = scanner.next()
    val sec = scanner.next()

    val dt = scanner.next()
    val mon = scanner.next()
    val yr = scanner.next()

    println("$hrs:$min:$sec $dt/$mon/$yr")
}