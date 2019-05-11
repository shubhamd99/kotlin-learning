package com.kotlin
// Companion Object

fun main(args: Array<String>) {

    MyCompanionClass.count = 101
    MyCompanionClass.typeOfCustomer()

}

class MyCompanionClass {

    companion object CustomerData1 {

        var count:Int = -1   // behaves like static variable

        @JvmStatic
        fun typeOfCustomer(): String {    // behaves like static method

            return "Indian"
        }

    }

}

