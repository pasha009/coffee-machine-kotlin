import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val f = scanner.nextInt()
    val s = scanner.nextInt()
    val t = scanner.nextInt()
    var ret = f > 0 && s <= 0 && t <= 0
    ret = ret || s > 0 && f <= 0 && t <= 0
    ret = ret || t > 0 && s <= 0 && f <= 0
    println(ret)
}