fun man(args: Array<String>) {

    // Ranges

    val r1 = 1..5 // Double Dot Operator
    // range contains 1,2,3,4,5

    val r11 = 1..5 step 2

    val r2 = 5 downTo 1 // 5,4,3,2,1

    val r3 = 5 downTo 1 step 2 // 5, 3, 1

    var r4 = "a".."z"  // a to z

    var isPresent = "c" in r4 // true

    var countDownStart = 10.downTo(1) // decrement from 10 to 1

    var moveUpto = 1.rangeTo(10) // increment from 1 to 10


}