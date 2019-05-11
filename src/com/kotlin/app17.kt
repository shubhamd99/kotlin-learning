// Data Classes
package com.kotlin

fun main(args: Array<String>) {

    var user1 = UserBody("Bob", 16)
    var user2 = UserBody("Bob", 16)

    // it will print the class body not the object address when we use data classes
    println(user1)

    if (user1 == user2) {
        println("Equal")
    } else {
        println("Un-Equal")
    }

    // Copies the data class
    var newUser = user2.copy()
    println(newUser)

    var newUser1 = user1.copy(name = "Peter")
    println(newUser1)
}

// data deals with data not object, thats why comparing two objects shows equal
// it should contain var or val, no parameters
data class UserBody (var name: String, var id: Int) {


}