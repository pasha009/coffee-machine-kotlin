import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var x1 = scanner.nextInt()
    var y1 = scanner.nextInt()
    var z1 = scanner.nextInt()
    var x2 = scanner.nextInt()
    var y2 = scanner.nextInt()
    var z2 = scanner.nextInt()

    var tem: Int
    if (y1 < x1) {
        tem = x1
        x1 = y1
        y1 = tem
    }

    if (z1 < y1) {
        tem = z1
        if (z1 < x1) {
            z1 = y1
            y1 = x1
            x1 = tem
        } else {
            z1 = y1
            y1 = tem
        }
    }

    if (y2 < x2) {
        tem = x2
        x2 = y2
        y2 = tem
    }

    if (z2 < y2) {
        tem = z2
        if (z2 < x2) {
            z2 = y2
            y2 = x2
            x2 = tem
        } else {
            z2 = y2
            y2 = tem
        }
    }

    if (z2 == z1 && y2 == y1 && x2 == x1) {
        println("Box 1 = Box 2")
    } else if (z2 >= z1 && y2 >= y1 && x2 >= x1) {
        println("Box 1 < Box 2")
    } else if (z2 <= z1 && y2 <= y1 && x2 <= x1) {
        println("Box 1 > Box 2")
    } else {
        println("Incomparable")
    }
}
