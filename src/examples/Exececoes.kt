package examples

import java.lang.Exception
/*kotlin n trabalha com execeçao verifica, sendo assim não somo obrigados a usar try catch e throws*/

fun main(args: Array<String>) {

    try {
        print("digite um nº: ")
        val numero : Int = readLine()!!.toInt() //!! assumir que o valor pode se null
        val divisao : Int = 100 / numero
    }catch (e: Exception){
        println("erro: ${e.message}")
    }finally {
        print("sempre executa ... .")
    }

}