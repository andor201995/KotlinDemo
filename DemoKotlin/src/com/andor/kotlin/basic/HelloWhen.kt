package com.andor.kotlin.basic

fun main(agrs: Array<String>) {
    println("Enter a number")
    var i = readLine()!!.toInt()

    //use 1 of when
    when (i) {
        1, 3 -> println("value is 1 || 3")

        in 10..30 -> println("value in range 10-30")

        !in 0..10 -> println("value not in range 0-10")

        2 -> {
            println("value is 2")
        }

        else -> {
            println("not in range")
        }

    }

    //use 2 of when
    var x = when (i) {
        1 -> 10
        2 -> 20
        else -> i * 10
    }
    println("value of i*10=$x")
}