package com.algatraining.trainee.basiccode

/**
 * Create by Alga Mahargarika on 03/11/2022
 */

fun main() {
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    val agePerson = 22
    when(agePerson){
        //in 21..150 -> println("Can drink in US.")
        !in 0..20 -> println("Can drink in US.")
        in 18..20 -> println("You can vote.")
        16, 17 -> println("You can't vote.")
        in 16..17 -> println("You can drive now.")
        in 0..15 -> println("You're too young.")
        else -> println("Invalid Age")
    }

    /*var x: Any = 13.37f
    when(x) {
        is Int -> println("$x is Integer.")
        !is Double -> println("$x is not a Double.")
        is String -> println("$x is String.")
        else -> println("$x is non of the above.")
    }*/

    val x : Any = 13.37
    //assign when to a variable
    val result =  when(x) {
    //let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
    //then print x with the result
    print("$x $result")
}