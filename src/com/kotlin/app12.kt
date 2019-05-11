// Inheritance in Kotlin
package com.kotlin

fun main(args: Array<String>) {

    var dog = Dog()
    dog.color = "Red"
    dog.eat()
    dog.breed = "Labra"
    dog.bark()

    var cat = Cat()
    cat.color = "Red"
    cat.age = 10
    cat.meow()

    println(cat.color1)

}

// by defining open this class is no longer final only public
open class Animal {

    var color: String = "White"

    open var color1: String = ""

    open fun eat() {
        println("Eating")
    }
}

class Dog: Animal() {

    var breed: String = ""

    fun bark() {
        super<Animal>.eat()
        println("Bark")
    }

    // overridng
    override fun eat() {
        println("Dog is Eating")
    }
}

class Cat: Animal() {

    var age: Int = -1

    override var color1 = "Blue"

    fun meow() {
        println("Meow")
    }
}


