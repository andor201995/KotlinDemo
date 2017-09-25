fun main(args: Array<String>) {
    dude("arg1")
    dude("arg1", "arg2")
    dude("arg1", "arg2", "arg3")
    dude()
}

fun dude(s: String = "default", s1: String = "default", s2: String = "default") {
    println("I am 3 arg Dude")
}

fun dude(s: String = "default", s1: String = "default") {
    println("I am 2 arg Dude")
}

fun dude(s: String = "default") {   //this default method is called for no argument
    println("I am 1 arg Dude")
}


