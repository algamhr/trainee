package com.algatraining.trainee.basiccode

/**
 * Create by Alga Mahargarika on 19/10/2022
 */

fun main() {
    /*
    String Interpolation adalah menggabungkan String dari print tanpa tambah dengan simbol
    $(namavariabel).
    Biasanya ini disebut String Template Expression atau String Interpolation.
     */

    val myFirstName = "Alga"
    val myLastName = "Mahargarika"
    val lastCharInStr = myLastName[myLastName.length -1]
    val lengthChar = myLastName.length

    print("Nama saya $myFirstName $myLastName. Huruf terakhir nama saya adalah $lastCharInStr dan" +
            " panjang karakter nama terakhir saya adalah ${myLastName.length}")
}
