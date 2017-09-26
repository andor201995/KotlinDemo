package com.andor.kotlin.oops

import com.andor.kotlin.oops.Outer.Inner

fun main(args: Array<String>) {
    var inner = Inner()

}

class Outer {

    init {
        println("Outer class Constructor")
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