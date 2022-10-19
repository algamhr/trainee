package com.algatraining.trainee.basiccode

/**
 * Create by Alga Mahargarika on 19/10/2022
 */

fun main() {
    /*
    Arithmetic operators (+, -, *, /, %)
    plus, minus, multiple , divide, modulo
     */

    var resultSum = 5+3
    var resultDis = resultSum / 2
    // or
    resultSum /= 2
    resultDis *= 2

    // modulo berfungsi untuk mencari sisa dari pembagian.

    val resultModulo = 15%2

    println(resultSum)
    println(resultDis)
    println(resultModulo)

    // Convert from Int to Double

    val a = 5.0
    val b = 3
    val resultConvert: Double = a / b

    print(resultConvert)
}
