package org.example.Ejercicios.Ejercicio7

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val j1 = Character(100, 20)
    val j2 = Character(200, 30)

    var ronda = 0

    val dañoJ1 = j1.atacar()
    val dañoJ2 = j2.atacar()

    while(j1.vida != 0 && j2.vida != 0){

        ronda++
        println("Ronda: $ronda")

        println("El jugador 1 ataca: $dañoJ1 puntos de ataque")
        val vidaj2 = j2.recibirDaño(dañoJ1)
        println("el jugador 2 recive daño, vida actual: $vidaj2")

        println("El jugador 2 ataca: $dañoJ2 puntos de ataque")
        val vidaj1 = j1.recibirDaño(dañoJ2)
        println("El jugador 1 recive daño, vida actual: $vidaj1")

        if (j1.vida == 0){
            println("GANADOR: Jugador 2")
        }else if(j2.vida == 0){
            println("GANADOR: Jugador 1")}
    }



}
