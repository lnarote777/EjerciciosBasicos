package org.example.Ejercicios

fun main() {
    val ataque1 = 2
    val ataque2 = 3
    val ataque3 = 5

    println(multiplicarAtaques(ataque1))
    println(multiplicarAtaques(ataque2))
    println(multiplicarAtaques(ataque3))
}

fun multiplicarAtaques( ataque : Int ): Int {
    val daño = ataque * 5
    return daño
}