package examples
/*São classes que servem para passar dados de um lado pro outro
* - ja vem com os gets e sets criados
* - e tem outras funcionalidades ja implementadas
 * - vem com to string e hashcode (cada obj tem o seu unico)*/

class Livro(val titulo: String, val autor: String,val ano: Int )//classe criada de forma normal

data class DataLivro(val titulo: String, val autor: String,val ano: Int )

fun main(args: Array<String>){

    val livro = Livro("android","Paulo",2012)
    val livro2 = Livro("android","Paulo",2012)

    val dataLivro= DataLivro("ts","Paula P.",2014)
    val dataLivro2= DataLivro("ts","Paula P.",2014)

    print(livro)
    print(livro2)

    println("iguais usando obj normal? "+ livro.equals(livro2))
    println("iguais usando obj dataClasse  ? "+ dataLivro.equals(dataLivro2))
}