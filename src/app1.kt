// Hello World
fun main(args: Array<String>) {
    println("Hello World")

    var myNumber = 10
    var myDecimal = 5.0
    println(myNumber + myDecimal)

    var myString: String  // Mutable String
    myString = "Shubham Dhage"
    println(myString)

    myString = "Hello World"
    display(myString)

    val myConstant = "My Constant Variable"  // Immutable String

    var mypersonObj = Person1()
    mypersonObj.display2(myString)

    mypersonObj.name1 = "Rohan"
    mypersonObj.display2(mypersonObj.name1)

    println("The name is " + mypersonObj.name1)
    // string interpolation
    println("The name of the person is ${mypersonObj.name1}")

}

fun display(myString: String) {
    println(myString)
}

// function class
class Person1 {
    var name1:String = ""

    fun display2(myString: String) {
        println(myString)
    }

}

