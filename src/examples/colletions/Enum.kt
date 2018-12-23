package examples.colletions

enum class Direcao{
    NORTE,SUL,LESTE, OESTE
}

class Busola{
    var direcao : Direcao = Direcao.SUL;
}

/*conjunto de constantes !*/
fun main(args: Array<String>) {
    val busola = Busola()
    println(busola.direcao)
}