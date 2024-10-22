package Ejercicios.Ejercicio10

class MiembroEquipo(val nombre: String, val ataque: Int) {
    fun atacar(enemigo: Enemigo){
        enemigo.recibirDamage(ataque)
        println("El enemigo recibió $ataque de daño.")
    }
}