package com.example.app02funcionesyclases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//llamado de la funcion a ejecutar
        //arrays()
        // seguridadNula()
       // funciones()
        clases()

    }
//funcion y su nombre
    fun arrays ()
    {
        //variables creadas a utilizar
        val nombre = "Alvaro"
        val apellido = "Lopez"
        val departamento = "San salvador"
        val edad = "20"

        //crear el arreglo
        val miArreglo = arrayListOf<String>()

        //ahora agregamos las variables que creamos para que esten en el arreglo
        miArreglo.add(nombre)
        miArreglo.add(apellido)
        miArreglo.add(departamento)
        miArreglo.add(edad)

        println(miArreglo)

        //añadir conjunto de datos
        miArreglo.addAll(listOf("Estudiantes","progra"))
        println(miArreglo)

        //acceso a datos//entre llaves va el numero de la variable que tengamos
        var miDepartamento = miArreglo[2]
        println(miDepartamento)
        //tambien podemos realizar lo mismo mandando a imprimir directamente de esta forma
        println(miArreglo[2])


        //modificar una parte del arreglo
        miArreglo[0] = "Danilo"
        println(miArreglo[0])

        //eliminar dato de un arreglo
        miArreglo.removeAt(2)
        println(miArreglo)

        //imprimir el arreglo 1 por 1 con un ciclo y el it indica que imprimira este arreglo
        miArreglo.forEach{
            println(it)
        }

        //otras operaiones, para contar los valores del arreglo
        println(miArreglo.count())
        //limpia los datos del arreglo
        miArreglo.clear()
        //si imprimimos el contador de datos nos mostrara 0 datos del arreglo.
        println(miArreglo.count())
    }

//funcion seguridad contra nulos (null safety)
    fun seguridadNula()
    {
        var miString:String = "Progra 13/09/22"
        //miString = null; esto seria un error de compilacion
        println(miString)

        //variable seguridad nula (null safety)
        var miSeguridadNula:String? = "valor de seguridad nula"
        miSeguridadNula = null
        println(miSeguridadNula)

        miSeguridadNula = "le volvemos a dar valor"
        println(miSeguridadNula)

        if(miSeguridadNula !=null) {
            println(miSeguridadNula.toString()!!)
        }else{
            println(miSeguridadNula.toString())
        }
        //ahora interpretariamos lo mismo de arriba
        println(miSeguridadNula?.length)
        miSeguridadNula?.let { println(it.toString()) }?:
        kotlin.run {
            println(miSeguridadNula)
        }



    }


    //funciones
   fun funciones()
   {
       decirhola()
       decirhola()
       decirhola()

       decirNombre("Alvaro")
       decirNombreyEdad("Alvaro", 20)

       var sumResultado = sumarNumeros(1 , 9)
       println(sumResultado)
       println(sumarNumeros(10,7))

       println(sumarNumeros(5 , sumarNumeros(7,3)))
       //println(sumarNumeros(5 ,3),sumarNumeros(2,3))

   }

    //funcion simple
    fun decirhola()
    {
        println("hola")
    }

    //funcion con parametros de entrada
    fun decirNombre(nombre:String)
    {
        println("Hola $nombre")
    }
    fun decirNombreyEdad(nombre:String, edad:Int)
    {
        println("Hola $nombre de edad $edad años")
    }

    fun sumarNumeros(num1:Int, num2:Int):Int
    {
        val suma = num1+num2
        return suma
    }


    //Funcion clase que trae parametros de los datos de una clase distinta en este caso la clase estudiante
    fun clases()
    {
        val persona = Estudiante("Alvaro", 20, arrayOf(Estudiante.lengua.JAVA,Estudiante.lengua.Cc))
        println(persona.nombre)
        persona.edad= 21
        println(persona.codigo())

        val persona2 = Estudiante("Danilo", 21, arrayOf(Estudiante.lengua.KOTLIN), arrayOf(persona))
        println(persona2.codigo())

        println("${persona2.amigo?.first()?.nombre} es amigo de ${persona2.nombre}")


    }


}

