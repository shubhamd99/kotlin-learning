package com.kotlin

open class PersonP {

    // visible within the class
    private val a = 1

    // available inside sub class ex- Indian
    protected val b = 2

    // available within the module (Module means- Kotlin, Maven, Groove)
    internal val c = 3

    // default is always public
    public val d = 4
}

class Indian: PersonP() {

    fun getProtect() {
        println(b)
    }
}