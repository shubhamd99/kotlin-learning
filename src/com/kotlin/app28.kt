// Predicate - Just a condition
package com.kotlin

fun main(args: Array<String>) {

    val numbersList =listOf(2, 3, 4, 5, 6, 10, 11, 12)

    val myPredicate = { num: Int -> num > 10 }

    var check1: Boolean = numbersList.all( myPredicate ) // All elements are greater than 10? False
    println(check1)

    var check2: Boolean = numbersList.any( myPredicate )  // Does any of the element satisfy the predicate?  true
    println(check2)

    var check3: Int = numbersList.count( myPredicate )  // 1
    println(check3)

    var check4: Int? = numbersList.find( myPredicate )  // 11
    println(check4)
}
