package model

/*no kotlin os metodos podem ter corpo ou não - podemos usar varias interfaces em apenas uma classe*/
interface Dirigivel{
    fun acelerar(velociade: Long)
}

interface Lotacao{
    fun lotacaoTotal(qtd: Int)
}
class Onibus(var ano: Int, var cor: String, var modelo: String): Dirigivel,Lotacao{
    override fun lotacaoTotal(qtd: Int) {
        println("total de pessoa dentro do oibus é: ${qtd+1} !")
    }

    override fun acelerar(velociade: Long) {
        println("acelerando e chegando a ${velociade} km/h")
    }
}


fun main(args: Array<String>){
    var corsa = Onibus(2033,"prata","corsa bus GL")

    println(corsa.modelo)
    corsa.acelerar(120)

   /*
    // posso criar obj de acordo com a interface para ter acesso apenas o que esta na interface
   var chevette: Lotacao = Carro(2033,"red","gol bus GL")// n funciona pq a interface tem apenas o metodo lotacaototal*/

}