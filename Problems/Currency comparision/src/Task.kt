import java.util.Scanner

enum class Countries(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar"),
    Null("");

    companion object {
        private fun getCountryByName(name: String): Countries {
            for(enum in Countries.values()) {
                if(enum.name.toLowerCase() == name.toLowerCase()) return enum
            }
            return Null
        }

        fun checkSameCurrency(c1: String, c2: String): Boolean {
            val e1 = getCountryByName(c1)
            val e2 = getCountryByName(c2)
            if(e1 == Null || e2 == Null) return false
            return e1.currency == e2.currency
        }
    }

}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val s1 = scanner.next()
    val s2 = scanner.next()
    println(Countries.checkSameCurrency(s1, s2))
}