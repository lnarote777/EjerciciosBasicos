package org.example.Ejercicios

fun main() {
    var ataque = 70
    ataque = critico(ataque)

    println(ataque)

}

fun critico(ataque: Int): Int{
    return if(ataque > 50) {
        println("Golpe crítico")
        ataque * 2
    } else{
        ataque
    }
}