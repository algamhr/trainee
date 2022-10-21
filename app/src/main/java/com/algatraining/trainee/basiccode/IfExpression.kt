package com.algatraining.trainee.basiccode

/**
 * Create by Alga Mahargarika on 21/10/2022
 */

fun main() {
    val heightPerson1 = 170
    val heightPerson2 = 170

    if (heightPerson1 > heightPerson2) {
        println("Use raw force")
    } else if (heightPerson1 == heightPerson2) {
        println("Use your power technique 1337")
    } else {
        println("Use technique")
    }

    //Sample
    val agePerson = 22

    if(agePerson >= 21) {
        print("Can drink in US.")
    } else if(agePerson >= 18) {
        print("You cant vote.")
    } else if(agePerson >= 16) {
        print("U can drive now.")
    } else {
        println("You're too young.")
    }
}
