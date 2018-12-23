package examples.colletions
/*
* implementações de estruturas de dados  - aula 29, seção 4*/

fun main(args: Array<String>) {
    val notas = listOf<Int>(1,4,5) // imutavel - pode ser criada sem especificar o tipo
    val notas2 = mutableListOf(3,78,5)// mutavel
    val mix = arrayListOf("Maico","Ana","Vania")

    mix.add("Leticia")
    println(mix)
    for(nome in mix){
        println("-> ${nome}")
    }

    mix.remove("Vania") // remover

    println(mix.size)

}