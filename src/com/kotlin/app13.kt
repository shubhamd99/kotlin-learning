// Primary and Secondary constructor
package com.kotlin

fun main(args: Array<String>) {

    var lion = Lion("yellow","Wild")

    var tiger = Lion2("purple", "Less Wild")

}

// Primary
open class Mamal(var color: String) {

    init {
        println("From Mammal $color")
    }

}

class Lion(color: String, var breed: String): Mamal(color) {

    init {
        println("From Lion color: $color and breed: $breed")
    }

}


// Secondary
open class Mamal2 {

    var color3: String = ""

    constructor(color3: String) {
        this.color3 = color3

        println("From Lion2 color: $color3")
    }

}

class Lion2: Mamal2 {

    var breed3: String = ""

    constructor(color3: String, breed3: String): super(color3) {
        this.breed3 = breed3

        println("From Lion2 color: $color3 and breed: $breed3")
    }

}
