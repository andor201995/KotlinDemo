package com.andor.kotlin.basic

open class BaseClass() {
    open fun functionOver() {
        print("hello from base Class")
    }
}

class ChildClass : BaseClass {
    constructor() : super() {

    }

    override fun functionOver() {
        print("hello from Child Class")
    }

    fun dummy() {

    }
}

fun main(args: Array<String>) {
    var obj = ChildClass() as BaseClass     //TypeCasting
    obj.functionOver()
    //    obj.dummy()   //error as because of type Casting
}