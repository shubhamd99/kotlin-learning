package com.kotlin

fun main(args: Array<String>) {

    val program3 = Program3()

    // if we have one parameter we can replace it with "it" keyword
    program3.reverseAndDisplay("hello", { it.reversed() })

}

class Program3 {

    fun reverseAndDisplay(str: String, myFunc: (String) -> String) {

       var result =  myFunc(str)
        println(result)
    }
}