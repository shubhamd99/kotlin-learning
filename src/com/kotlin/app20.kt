// High level/Order function and Kotlin Lamdas
package com.kotlin

// we can pass function as a parameter in HOF
fun main(args: Array<String>) {

    val program = Program()
    program.addTwoNumbers(54, 26)

    program.addTwoNumbers(22, 55, object : MyInterface{

        override fun execute(sum: Int) {
            println("Interface " + sum)
        }
    })


    val myLambda: (Int, Int) -> Int = { x: Int, y: Int -> x + y }   // Lambda expression [  Function ]
    program.addTwoNumbers(66, 100, myLambda)

    // short way =>     program.addTwoNumbers(66, 100, { x, y -> x + y })
    // another way =>   program.addTwoNumbers(66, 100) { x, y -> x + y }
}

class Program {

    fun addTwoNumbers( a: Int, b: Int, action: (Int, Int) -> Int ) {

        // High level function with lambda as a parameter
        val result = action(a, b)
        println(result)
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {

        val sum = a + b             // Using interface / Object oriented way
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int) {

        val sum = a + b
        println("Normal Method " + sum)
    }
}

interface MyInterface {

    fun execute(sum: Int)
}