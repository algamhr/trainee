package com.algatraining.trainee.basiccode

/**
 * Create by Alga Mahargarika on 21/10/2022
 */

fun main() {
    // ReadLine(), Scanner, BufferedReader. Untuk mengambil input nilai yang kita masukkan.

    print("Input nama depan: ")
    val firstName = readLine()

    print("Input umur: ")
    val age = readLine()

    println("Nama saya $firstName dan umur saya $age")

    val newAge2Years = Integer.valueOf(age) + 2
    val newAge5Years = age!!.toInt() + 5

    //Tanda !! artinya mengizinkan NullPointerException jika variabel umur bernilai null.

    println("Umur saya 2 tahun yang akan datang adalah $newAge2Years dan 5 tahun yang akan datang "
            + "adalah $newAge5Years.")
}