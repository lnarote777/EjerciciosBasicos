package org.example.Ejercicios

fun main() {
    var monedas = 0
    for (i in 1..10){
        monedas += 5
        println("Ronda: $i -> Se han recogido $monedas monedas")
    }
}