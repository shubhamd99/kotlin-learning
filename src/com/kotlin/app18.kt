package com.kotlin

fun main(args: Array<String>) {

    CustomerData.count = 97
    println(CustomerData.count)

    CustomerData.count = 1001
    println(CustomerData.count)

    println( CustomerData.typeOfCustomer() )

    CustomerData.myMethod("Shubham123")
}

open class MySuperClass {

    open fun myMethod(str: String) {
        println("My super class")
    }
}

// singleton (static in java), we can create only one instance
object CustomerData: MySuperClass() {

    var count:Int = -1   // static variable

    fun typeOfCustomer(): String {    // static method

        return "Indian"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
        println("object customer data " + str)
    }
}