package supermercado

class Cliente(private val nomeCliente: String) {

    fun cadastrarCliente(){
        println("Olá, $nomeCliente")
        println("Seja bem vinde ao Supermercado!")
        println("-------------------------------")
    }

}