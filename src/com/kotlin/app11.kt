package com.kotlin

fun main(args: Array<String>) {

    var student = Student1("Shubham DHage")


    var student2 = Student2("Rock", 22)
    println(student2.id)

}

// Primary constructor
class Student1(var name: String) {

    // initialize the value
    init {
        println("Student name is $name")
    }

}


// Secondary constructor
class Student2(var name: String) {

    var id:Int = 0

    // initialize the value
    init {
        println("Student name is $name and the id is $id")
    }

    // var or val is not allowed in secondary contructor
    constructor(n: String, id: Int): this(n) {

        this.id = id

    }

}