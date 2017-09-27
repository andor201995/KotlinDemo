package com.andor.kotlin.oops

//Kotlin has nothing as static
fun main(args: Array<String>) {
    var instance1 = Single.instance
    var instance2 = Single.instance
    instance1.text = "name"
    println(instance1.text)
    println(instance2.text)
}

class Single private constructor() {
    var text: String? = null

    init {
        println("Inside Single constructor")
    }

    companion object {
        val instance: Single by lazy { Single() }
    }

}