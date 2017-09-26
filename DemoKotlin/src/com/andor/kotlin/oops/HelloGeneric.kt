package com.andor.kotlin.oops

class Parser<T>(parse: T) {  //generic
    private var parse: T? = null

    init {
        this.parse = parse
    }

    fun getParser(): T? {
        return parse
    }

    fun <T> display(parse: T){
        println(parse)
    }
}

fun main(args: Array<String>) {
    var parse: String = "parse"
    var parser = Parser(parse)
    println(parser.getParser())

    parser.display(parse)
}