// Late Init AND LAZY
package com.kotlin


// no memory will be allocated if we don't use this pi variable
val pi: Float by lazy {     // val pi: Float = 3.14f  (Waste of memory)
    3.14f
}

fun main (args: Array<String>) {

    val country = Country()
    country.name = "India"
    println(country.name)
}

class Country {

    lateinit var name: String
}

// lateinit used only with mutable data type (var)
// lateinit used only with not nullable data type
// lateinit value must be initialized before you used it