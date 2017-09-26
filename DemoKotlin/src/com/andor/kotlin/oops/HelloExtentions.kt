package com.andor.kotlin.oops

//special feature of kotlin

fun main(args: Array<String>) {
    var arrayList = ArrayList<String>().apply {
        add("anmol")
        add("avi")
        add("amulya")
    }
    println(arrayList)
    arrayList.swap(0, 1)
    println(arrayList)
}

//Extention to a class and making your own fun for a class to make it more extensible
fun ArrayList<String>.swap(index1: Int, index2: Int) {
    var temp = this.get(index1)
    this.set(index1, this.get(index2))
    this.set(index2, temp)
}