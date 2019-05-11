// Array
package com.kotlin

fun main (args: Array<String>) {

    // Array length is 5 with integer value
    var myArray = Array<Int>(5) { 0 } // Initial value 0, Mutable. Fixed Size

    myArray[0] = 32
    myArray[3] = 40

    // println(myArray[3])

    for (element in myArray) {
        println(element)
    }

    for (index in 0..myArray.size - 1) {
        println(myArray[index])
    }


    // List (Immutable Readonly)
    var list = listOf<String>( "Shubham", "Rocky", "Vandita" )

    for (element in list) {
        println(element)
    }


    // mutable list, no fixed size
    var list1 = mutableListOf<String>( "Shubham", "Rocky", "Vandita", "Josh" )
    var list2 = ArrayList<String>()
    var list3 = arrayListOf<String>()

    list1.add("ransome")
    list1.add("payn")

    list1.remove("ransome")
    list1.add(1, "Rahul")

    list1[3] = "Ganesh"

}

