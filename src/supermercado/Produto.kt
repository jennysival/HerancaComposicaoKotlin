package supermercado
//nome, codigo de barras, validade

open class Produto(private val nomeProduto: String, private val codigoDeBarras: Int, private val validade: String) {
    protected fun cadastrarProduto(){
        println("--------------------")
        println("Cadastrando produto:")
        println("Produto: $nomeProduto")
        println("CDB: $codigoDeBarras")
        println("Validade: $validade")
        println("--------------------")
    }
}