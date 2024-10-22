package Ejercicios.Ejercicio9

class Jugador(var ataque: Int, var vida: Int, var experiencia: Int = 0, var nivel: Int = 1) {
    fun ganarExperiencia() {
        if (experiencia == 200) {
            subirNivel()
            experiencia = 0
        } else {
            experiencia += 50
        }
    }

    fun subirNivel() {
        nivel += 1
    }

    fun atacar(): Int {
        return ataque
    }

    fun recibirDaño(daño: Int): Int {
        vida -= daño
        if (vida >= 0) {
            return vida
        } else {
            vida = 0
            return 0

        }
    }
}