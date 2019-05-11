// Null Safe Operators
package com.kotlin

fun main(args: Array<String>) {

    val name: String? = null   // Nulable string

    // Safe Call (?.)
    // returns the length if name is not null else print null
    println("the length of the name is ${name?.length}")  // null

    // Safe call with let (?.let)
    // it executes the block only , if the value is not null
    name?.let {
        println("the length of the name is ${name?.length}")
    }

    // Elvis operator ( ?: )
    val length = name?.length ?: -1   // if null print prints -1 else length


    // Not-null assertion operator ( !! )
    // throws null pointer exception if value is not found to be null, use when the value is null
    println("the length of the name is ${name!!.length}")
}