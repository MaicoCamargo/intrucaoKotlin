fun main(args: Array<String>) {

    println("hello word")


    //condicao de if dentro de uma variavel -> obrigatório ter um else
    var idade =20
    var str = if(idade >20) "velho de mais" else "nem tão velho"
    println(str)

    var condicaoDoWhen = 3;
    //controler de fluxo when -> tbm pode ser colocado dentro de uma variavel
    var binario = when(idade){ 0,1 -> "binario" else-> "erro"}

    //exemplo de when (similar ao swith case do java )
    var when2 = when(condicaoDoWhen){
        0,1 -> "é binario"
        2 -> "condicao é a dois "
         else-> "erro"
    }

    //laco while
    println("laço while ==============")
    for (contWhile in 1..5){
        println("contador: $contWhile")
    }

    //arrays - no kotlin sao imutavies
    var estados = arrayOf("RS","SP")
    print(estados[0])//pega de acordo com a posicao do array

    var numeros = intArrayOf(31,82,73)//array que vai apenas numeros
    var arrayMisto = arrayOf("maico",20,"pes","fifa",45)

    println("laço for array")
    for ((indexArray,numeros) in numeros.withIndex()){
        println("indice do array: $indexArray - valor: $numeros")
    }

    //no kotlin uma string ja é um array entao entao é possivel manipulaar ela e tudo mais
    var nome = "maico"
    println(nome[2])

}

