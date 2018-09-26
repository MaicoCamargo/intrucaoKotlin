/*parte de orientação a objetos de kotlin*/

//exemplo classe kotlin
class Carro{
    //no kotlin n precisa de getters e setters - mas pode sobreescrever eles

    var ano: Int =2017;// atributo mutavel se criado com 'val' é imutavel o valor n pd ser mudado
    var cor: String = "Amarelo";// atributo mutavel se criado com 'val' é imutavel o valor n pd ser mudado
    var modelo: String = "Corsa";
}

//exemplo classe com construtor
class Camioneta(modelo: String, ano: Int, cor: String){

    var modelo: String
    var ano:  Int
    var cor: String

    //passa para dentro dos atributos os dados recebidos por parametro
    init {
        this.modelo = modelo
        this.cor = cor
        this.ano =  ano
    }

    fun acelerar(){
        println("Acelerando $modelo\n\n")// referencia para atributo dentro da classe
    }
}

//exemplo classe com construtor e inicialização dos atributos de forma mais simples
class Moto(var ano: Int, var modelo: String, var cor: String){// pode ser usado o val tbm

    //mesmo n usando o construtor posso deixar o init toda novo obj criado dessa classe o codigo do construtor é executado
    init {
        print("Construindo minha moto...")
    }
    fun polotar(){
        print("coloque gasolina para pilotar a $modelo")
    }
}


fun main(args: Array<String>){
    print("\n\n")
    val meuCarro= Carro();// criado instancia do obj carro
    println("Carro ano: ${meuCarro.ano}, modelo: ${meuCarro.modelo}")

    val camaro = Carro()
    camaro.ano = 2020
    camaro.cor = "Branca com Preta"
    camaro.modelo = "SS";
    println("Camaro ${camaro.modelo}\n\n")


    //camioneta
    val strada = Camioneta("Strada",2018,"Vermelha Alpino")
    println("Camioneta ${strada.modelo}")
    strada.acelerar()

    //moto
    var honda = Moto(2020,"xr 950","Azul fosco")
    println(" Minha moto: ${honda.modelo}")
    honda.polotar()


    print("\n\n")
}