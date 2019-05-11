// Closures
package com.kotlin

fun main (args: Array<String>) {

    var result = 0 // Outside variable or Closure

    var program2 = Program2()
    program2.addTwoNumbers2(66, 100) { x, y -> result =  x + y }

    println(result)
}

class Program2 {

    fun addTwoNumbers2( a: Int, b: Int, action: (Int, Int) -> Unit ) {

        action(a, b)    // x + y = a + b
    }
}



