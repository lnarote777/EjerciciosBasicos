package org.example.Ejercicios

fun main() {
    print("Ingrese su nivel: ")
    val nivel = readln().toInt()

    if (nivel < 10) {
        println("Personaje principiante")
    }else if (nivel in 11..19) {
        println("Personaje intermedio")
    }else if (nivel < 20) {
        println("Personaje avanado")
    }
}