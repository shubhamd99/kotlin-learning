// FILTER & MAP
package com.kotlin

fun main (args: Array<String>) {

    val myNumbers: List<Int> = listOf(2, 3, 5, 6, 10, 5, 60)

    val mySmallNums: List<Int> = myNumbers.filter { it < 10 }  // OR { num -> num < 10 }

    for (num in mySmallNums) {
        println(num)
    }

    val mySquaredNums: List<Int> = myNumbers.map { num -> num * num }   // OR { it * it }

    for (num in mySquaredNums) {
        println(num)
    }

    val mySmallSquaredNums: List<Int> = myNumbers.filter { it < 8 }.map { it * it }

    for (num in mySmallSquaredNums) {
        println(num)
    }


    var people: List<PersonList> = listOf<PersonList>(PersonList(10, "Shubham"), PersonList(10,"Siddhant"))
    var namesMap = people.filter { p -> p.name.startsWith("S") }.map { p -> p.name }   // { it.name.startsWith() } { it.name }

    for ( element in namesMap ) {
        println(element)
    }

}


class PersonList(var age: Int, var name: String) {
// class body
}
