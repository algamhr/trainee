package com.algatraining.trainee.basiccode

/**
 * Create by Alga Mahargarika on 19/10/2022
 */

fun main() {
    /*
    Boolean adalah nilai true ataupun false. Kita juga tidak perlu deklarasi tipedata dengan catatan
    bahwa variabel diisi antara true dan false.
    Tpe Inference: Inferensi tipe menemukan tipe dari konteks
     */
    var isSunny: Boolean = true
    isSunny = false

    /*
    Characters (Char) hanya bisa di isi satu karakter.
     */
    val letterChar = 'A'
    val digiChar = '1'

    /*
    String adalah kumpulan beberapa karakter.
     */
    val myStr = "Hello World"
    /*
    Kita juga bisa mencari karakter keberapa yg kita butuhkan dengan tanda [angka]. Dihitung
    mulai dari 0,1,2 ...
     */
    val firstCharInStr = myStr[0]
    // Untuk mencari karakter dari terakhir, kita bisa tambahkan .length - angka untuk mencarinya.
    val lastCharInStr = myStr[myStr.length - 1]

    println("First Character in String is " + firstCharInStr)
    print("Last Character in String is " + lastCharInStr)
}
