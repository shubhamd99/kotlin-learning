//Custome name
@file:JvmName("MyCustomKotlinFileName")

package com.kotlin

fun main(args: Array<String>) {

    var result = findVolume(2, 4)
    println(result)

    // Named Parameters
    printVolume(height = 30, breadth = 20, length = 50)

}

// Defaul argument in function
fun findVolume(length: Int, breadth: Int, height: Int = 15): Int {

    return length * breadth * height
}

@JvmOverloads
fun findVolume1(length: Int, breadth: Int, height: Int = 15): Int {

    return length * breadth * height
}

@JvmOverloads
fun printVolume(length: Int, breadth: Int, height: Int = 15) {

    println("Lenght is "+ length)
    println("Breadth is "+ breadth)
    println("Height is "+ height)
}
