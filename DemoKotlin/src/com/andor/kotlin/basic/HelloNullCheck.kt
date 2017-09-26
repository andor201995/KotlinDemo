package com.andor.kotlin.basic

fun main(args:Array<String>){
    var name :String ?  // no null check
//    name=null
    name ="anmol"
    println(name!!)     // force null check

    var a="1"
    var b=a.toInt()
    print(a+"\n"+b)
}