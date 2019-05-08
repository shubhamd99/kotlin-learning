fun main (args: Array<String>) {

    // For Loop
    for (i in 1..10) {
        // print even number
        if (i % 2 == 0)
            println(i)
    }

    // While Loop
    var j:Int = 1
    while ( j <= 15 ) {
        if( j % 2 == 0) {
            println(j)
        }
        j++
    }


    // Do While Loop
    var k:Int = 1
    do {
        println(k)
        k++
    } while ( k <= 5 )


    // Break statement
    for(i in 1..6) {

        println(i)
        if(i==5) {
            break
        }
    }

    // Loop inside Loop
    for (i in 1..2) {
        for (j in 1..3) {
            println("$i $j")
        }
    }

    // Nested Loop - Break (Labeled For Loop)
    myLoop@ for (i in 1..5) {
        for (j in 1..6) {
            println("$i $j")
            if ( i == 2 && j == 3)
                break@myLoop // now it will break outer loop not inner
        }
    }

    // Continue Statement (Skip 5 in loop)
    for (i in 1..10) {
        if ( i == 5 ) {
            continue
        }
        println(i)
    }

    // print odd number
    for (i in 1..10) {
        if ( i % 2 == 0 ) {
            continue // skip even
        }
        println(i)
    }

    // Nested Loop - Continue
    outer@ for (i in 1..3) {
        for ( j in 1..3) {
            if ( i ==2 && j == 2 )
                continue@outer

            println("$i $j")
        }
    }

}