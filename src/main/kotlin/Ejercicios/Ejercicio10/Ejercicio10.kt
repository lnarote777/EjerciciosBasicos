package Ejercicios.Ejercicio10


fun main(){

    val enemigo = Enemigo(500)
    val equipo = listOf(
        MiembroEquipo("Jorge", 40),
        MiembroEquipo("Lucas", 15),
        MiembroEquipo("Antonio", 27),
        MiembroEquipo("Maria", 50),
        MiembroEquipo("Fran", 32)
    )

    var ronda = 0

    while(!enemigo.derrotado()){
        ronda++
        println("Ronda $ronda")
        equipo.forEach {it.atacar(enemigo)}
    }

    println("Enemigo derrotado!!!!!!")
}