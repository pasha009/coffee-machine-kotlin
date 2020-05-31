class Application(private val name: String) {

    fun run(args: Array<String>) {
        println(name)
        for (a in args) {
            println(a)
        }
    }

}

