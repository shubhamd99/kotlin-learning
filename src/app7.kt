// Methods in Kotlin
fun main(args: Array<String>) {

    add()
    var sum = add2(10,22)
    println("The sum is" + sum)

    var largeValue = maxNum(22,100)
    println("The largest number is $largeValue")
}


// Unit means void return
fun add(): Unit {
    var a = 5
    var b = 10
    println("Sum is ${a + b}")
}

fun add2(a: Int, b: Int ): Int {
    return a + b
}

// One line function expression
fun maxNum(a: Int, b: Int): Int = if (a > b) a else b