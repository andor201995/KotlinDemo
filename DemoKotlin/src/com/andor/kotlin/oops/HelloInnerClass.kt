package com.andor.kotlin.oops


fun main(args: Array<String>) {
    var inner = Outer().Inner()
    inner.dispInner()

}

class Outer {

    init {
        println("Outer class Constructor")
    }

    fun dummy() {
        var inner = Inner()
    }

    inner class Inner {

        init {
            println("Inner class Constructor")

        }

        fun dispInner() {
            println("Inner Class Instance Function")
        }
    }
}