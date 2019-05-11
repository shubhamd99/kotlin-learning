package com.kotlin

fun main(args: Array<String>) {

    var student = Student()
    println("Pass Status: ${student.hasPassed(39)}")

    println("Scholarship Status: ${student.isScholarship(95)}")

    var str1: String = "Hello "
    var str2: String = "Shubham"
    val str3: String = "Hey, "

    println(str3.add(str1, str2))

    val x:Int = 10
    val y:Int = 20

    var greatVal = x.greaterValue(y)
    println(greatVal)

    // Infix (more readebility)
    var greatVal1 = x greaterValue1 y
    println(greatVal1)
}

// (Extension Function) make the function behave like inside the class
fun Student.isScholarship(marks: Int): Boolean {
    return marks > 90
}

// Our own Class
class Student {

    fun hasPassed(marks: Int): Boolean {

        return marks > 40
    }
}

// Extension Function another example
fun String.add(a: String, b:String): String {
    return this + a + b
}

fun Int.greaterValue(other: Int): Int {

    if (this > other)
        return this
    else
        return other
}

// infix function has only one arguments or parameter
infix fun Int.greaterValue1(other: Int): Int {

    if (this > other)
        return this
    else
        return other
}