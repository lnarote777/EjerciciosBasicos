package Ejercicios.Ejercicio10

class Enemigo(var vida: Int) {
    fun recibirDamage(danio: Int){
        vida -= danio
        if (vida <= 0) vida = 0
    }

    fun derrotado(): Boolean{
        return vida <= 0
    }
}