package model

/*open é usado por que por padrão as classe(e atributos) no kotin n podem ser estendidas, para poder ser extendida e ser
usada como pai de outra sub classe*/
open class Veiculo(open var ano: Int, open var modelo: String, open var cor: String){
    init {
        println("construindo ... ")
    }
    fun acelerar(){
        println("acelerando ${modelo}..")
    }
}

//capacidade é apenas da classe caminhao
class Caminhao( override var ano: Int,override var modelo: String,override var cor: String, var capacidade: Long): Veiculo(ano,cor,modelo) { }

/*: Veiculo - herdar de veiculo
* override sobre escrever o atributo
* */
class Carro(override var ano: Int,override var modelo: String,override var cor: String): Veiculo(ano,cor,modelo) {
    fun abrirPorta(){
        println("abrindo porta ..\n")
    }
}

fun main(args: Array<String>){
    val scania = Caminhao(2020,"1513 v8","Bordo", 3250)

    println("\ncaminhao ${scania.modelo} --> capacidade: ${scania.capacidade}")
    scania.acelerar()

    var corsa = Carro(2021,"Corsa","Prata")
    println("carro ${corsa.modelo} !\n")
    corsa.abrirPorta()
}