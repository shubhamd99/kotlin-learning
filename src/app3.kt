
fun main(args: Array<String>) {

    var rect = Rectangle()
    rect.length = 5
    rect.breadth = 10

    println("The area of rectangle is ${rect.length * rect.breadth}")

    // Variables Constants
    var name2: String = "Shubham Dhage"
    var age: Int = 10
    var isAlive: Boolean = true
    var marks: Float = 97.4F
    var percentage: Double = 90.78
    var gender: Char = 'M'
}

class Rectangle {

    var length: Int = 0
    var breadth: Int = 0
}