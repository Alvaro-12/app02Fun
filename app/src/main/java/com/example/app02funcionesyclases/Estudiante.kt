package com.example.app02funcionesyclases

class Estudiante(var nombre:String,var edad:Int,var lenguajes:Array<lengua>, val amigo:Array<Estudiante>?=null){

    enum class lengua
    {
        KOTLIN,
        JAVA,
        Cc,
        Python

    }

    fun codigo()
    {
        for (lenguaje: lengua in lenguajes){
            println("los lenguajes de programacion que conoces son: $lenguajes")
        }
    }


}