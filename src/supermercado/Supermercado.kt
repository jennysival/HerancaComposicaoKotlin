package supermercado

//tem produto
//tem cliente

class Supermercado {
    private val novoCliente = Cliente("Jenny")

    fun cadastroCliente(){
        novoCliente.cadastrarCliente()
    }

    fun cadastroProdutos(){
        println("VAMOS CADASTRAR SEUS PRODUTOS")

        val primeiroProduto = CocaCola()
        primeiroProduto.cadastrarCoca()

        val segundoProduto = Doritos()
        segundoProduto.cadastrarDoritos()

        val terceiroProduto = Cheddar()
        terceiroProduto.cadastrarCheddar()
    }
}