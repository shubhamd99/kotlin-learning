package com.kotlin

fun main (args: Array<String>) {

    // Set contain unique elements
    // HashSet also contains unique elements but Sequence is not gauranteed in output

    var mySet = setOf<Int>( 2, 54, 100, 26, 88, 66, 66, 250, 25 )   // Immutable, it will remove the duplicates

    var mySet1 = mutableSetOf<Int>( 2, 54, 100, 26, 88, 66, 66, 250, 25 )   // Mutable
    mySet1.remove(54)
    mySet1.add(120)

    for ( element in mySet) {
        println(mySet)
    }



    var mySet2 = hashSetOf<Int>( 2, 54, 100, 26, 88, 66, 66 )  // not in sequence

    for ( element in mySet2) {
        println(mySet2)
    }

}

