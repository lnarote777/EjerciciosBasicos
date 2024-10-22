package org.example.Ejercicios.Ejercicio8

class Personaje() {

    private val inventario: MutableList<String> = mutableListOf()
    fun añadirItem(item: String) {
        inventario.add(item)
    }

    fun eliminarItem(item: String) {
        inventario.remove(item)
    }

    fun mostrarInventario(){
        inventario.forEach {println(it)}
    }
}