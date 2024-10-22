package org.example.Ejercicios

import Ejercicios.Ejercicio9.Jugador

fun main() {
    val j1 = Jugador(100, 1000)
    val j2 = Jugador(10, 100)

    var ronda = 0
    val dañoJ1 = j1.atacar()
    val dañoJ2 = j2.atacar()

    while (ronda != 10){
        while(j1.vida != 0 && j2.vida != 0) {

            ronda++
            println("Ronda: $ronda")

            println("El jugador 1 ataca: $dañoJ1 puntos de ataque")
            val vidaj2 = j2.recibirDaño(dañoJ1)
            println("el jugador 2 recive daño, vida actual: $vidaj2")

            println("El jugador 2 ataca: $dañoJ2 puntos de ataque")
            val vidaj1 = j1.recibirDaño(dañoJ2)
            println("El jugador 1 recive daño, vida actual: $vidaj1")

            if (j1.vida <= 0){
                println("GANADOR: Jugador 2")
                j2.ganarExperiencia()
            }else if(j2.vida <= 0){
                println("GANADOR: Jugador 1")
                j1.ganarExperiencia()
            }
        }
        j2.vida = 100
        j1.vida = 1000
        println("Jugador 1 - Experiencia: ${j1.experiencia}, Nivel: ${j1.nivel}")
    }

}