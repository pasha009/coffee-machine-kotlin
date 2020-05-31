import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()
    val n = scanner.nextInt()
    println("Symbol # $n of the string \"$str\" is '${str[n - 1]}'")
}
