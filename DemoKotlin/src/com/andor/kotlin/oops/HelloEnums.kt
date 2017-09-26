package com.andor.kotlin.oops

enum class Directions {
    NORTH, SOUTH, EAST, WEST
}

fun main(args: Array<String>) {
    var directions = Directions.EAST

    if (directions == Directions.EAST) {
        print(true)
    } else {
        print(false)
    }
}