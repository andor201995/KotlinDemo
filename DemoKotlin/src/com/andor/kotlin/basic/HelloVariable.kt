package com.andor.kotlin.basic

fun main(args: Array<String>) {
    var fName: String = readLine()!!  //!! to check for null

    println("First Name:" + fName)

    var lName = "Srivastava"
    val id = 1031310671

    val dept: String? //? to not check null
    dept = "Computer Science"

    var f: Float = 3.14F
    var d: Double = 3.14
    var list = ArrayList<String>()
    list.add(fName)
    list.add(fName)
    println("$list")
    println("dept:$dept")
}