package com.example.ejercicios_1

class planeta(var nombre: String, var tipo: String, var masa: Double) {

    constructor() : this("Chawarma", "cárnico", 1.00)

    fun set_nombre(nombre : String)
    {
        this.nombre = nombre
    }

    fun set_tipo(tipo : String)
    {
        this.tipo = tipo
    }

    fun set_masa(masa : Double)
    {
        this.masa = masa
    }

}