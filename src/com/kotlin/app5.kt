package com.kotlin

// Control statment (if, when)
fun main(args: Array<String>) {

    val a = 5
    val b = 10

    var maxValue: Int

    // if as expresion
    if (a > b)
        maxValue = a
    else
        maxValue = b

    println(maxValue)

    // small method
    var maxValue1: Int = if (a < b)
                            a
                        else
                            b

    // multiline if, last value will return automatically ex- a and b
    maxValue1 = if (a < b) {
                    println("a is greater")
                    a
                } else {
                    println("b is greater")
                    b
                }

    println(maxValue1)



    // When as Expression
    // (replacement of switch statement)
    val x = 5
    var str:String

    when(x) {

        1 -> println("x is one")
        2 -> println("x is two")
        3, 4 -> println(" x is three OR four")
        in 5..10 -> println("x lies between 5-10")
        11 -> println("x is 11")
        !in 12..15 -> ("not in between 12-15")
        12 -> ("x is 12")
        13 -> str = "x is thirteen"
        else -> {
            println("x is null")
            println("multiline")
        }
    }

    val x1 = 100

    var str1:String = when (x1) {
        50 -> "str value is 50"
        else -> "str value is 100"
    }

    println(str1)
}