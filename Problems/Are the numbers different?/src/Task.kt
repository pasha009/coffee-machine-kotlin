import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val f = scanner.nextInt()
    val s = scanner.nextInt()
    val t = scanner.nextInt()
    println(f != s && s != t && t != f)
}