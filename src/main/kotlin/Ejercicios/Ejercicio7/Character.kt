package org.example.Ejercicios.Ejercicio7

class Character(var vida: Int, val ataque: Int){
    fun atacar(): Int{
        return ataque
    }

    fun recibirDaño(daño: Int): Int{
        vida -= daño
        if (vida >= 0){
            return vida
        }else{
            vida = 0
            return 0
        }
    }
}