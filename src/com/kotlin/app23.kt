// WITH & APPLY (Lambdas)
package com.kotlin

fun main (args: Array<String>) {

    var person10 = Person10()

    // create instance in short way
    with(person10) {
        name = "Shubham 100"
        id = 100
    }

    println(person10.name)
    println(person10.id)

    var person11 = Person10()

    person11.apply{
        name = "Rocky Rock"
        id = 200
    }.startRun()
}

class Person10 {

    var name: String = "dummy"
    var id: Int = -1

    fun startRun() {
        println("Now im ready to run")
    }
}