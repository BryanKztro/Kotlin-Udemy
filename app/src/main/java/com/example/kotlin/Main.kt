package com.example.kotlin

fun main (){
    val persona: Persona = Persona(nombre = "Braian", apellido = "Castro")
    persona.darBienvenida()

}

class Persona(val nombre: String, val apellido: String) {
    fun darBienvenida(){
        println("Bienvenido $nombre $apellido")
    }

}