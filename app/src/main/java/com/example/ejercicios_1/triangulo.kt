package com.example.ejercicios_1

class Triangulo(var a: Double = 1.00,var b: Double = 1.00,var c: Double = 1.00,var perimeter: Double = a + b + c,var type: String = "Equilatero") {

    fun rectangulo() : Boolean{
        return this.a * this.a + this.b * this.b  == this.c * this.c
    }

    fun get_perimeter() : Double
    {
        return this.perimeter
    }

}