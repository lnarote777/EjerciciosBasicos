package org.example.Ejercicios.Ejercicio8

fun main() {
    val j1 = Personaje()

    j1.añadirItem("Mazo")
    j1.añadirItem("Hacha")
    j1.añadirItem("Escudo")

    j1.eliminarItem("Mazo")

    j1.mostrarInventario()

}
