package com.kotlin

fun main(args: Array<String>) {

    // Map - key value pair (data structure)
    var myMap = mapOf<Int, String>( 2 to "Shubham", 3 to "Vandita", 7 to "Ayush" )  // Immutable

    for (  key in myMap.keys ) {
        // println(myMap[key])
        println("Element at key: $key = ${myMap[key]}")
    }


    // Hash Map - Mutable
    var myHashMap = HashMap<Int, String>()
    var myHashMap1 = hashMapOf<Int, String>()
    var myHashMap2 = mutableMapOf<Int, String>()  // Linked hash map


    myHashMap.put(4, "Shubham")
    myHashMap.put(7, "Vandita")
    myHashMap.put(10, "Ayush")

    myHashMap.replace(10, "Gopal")      // myHashMap.put(10, "Gopal")

    for (  key in myHashMap.keys ) {
        // println(myMap[key])
        println("Element at key: $key = ${myHashMap[key]}")
    }

}

