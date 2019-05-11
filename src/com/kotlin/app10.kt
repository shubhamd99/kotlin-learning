// TailRec Function (Recursive Function)
// Calling its own function within the function
package com.kotlin

import java.math.BigInteger

fun main(args: Array<String>) {

    // prints the 7th value which is 13
    println(getFibonacciNumber( 1000, BigInteger("1"), BigInteger("0") ))
}

// 0 1 1 2 3 5 8 13 21 ...
// if we don't use tailrec then when we give large number like 1000 it will crash , stack overflow
tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (n == 0) {
        return b
    } else {
        return getFibonacciNumber(n - 1, a + b, a)
    }
}