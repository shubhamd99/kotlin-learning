// normal, open and abstract
package com.kotlin

fun main(args: Array<String>) {


}

// you can not create instance of abstract class (var person = PersonPP)
abstract class PersonPP {

    abstract var namePerson: String

    // All abstract classes are open in nature. It should not contain body
    abstract fun eating()

    open fun getHeightOf() {}

}

// Subclass or Derived Class
class IndianI: PersonPP() {

    override var namePerson: String = "Shubham DDD"

    // abstract class must be overide unlike open which is optional
    override fun eating() {

    }

    override fun getHeightOf() {

    }
}