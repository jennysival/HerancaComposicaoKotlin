package biblioteca
//mae dos generos

open class GeneroLiterario(
    private val generoLivro: String,
    private var nomeLivro: String = "",
    private var autorLivro: String = "") {

    protected fun cadastrarLivro(){
        println("--------------------------------")
        println("Cadastrar Livro de $generoLivro:")
        println("--------------------------------")
        print("Digite o nome do Livro: ")
        nomeLivro = readln()
        println("Digite o autor de $nomeLivro:")
        autorLivro = readln()
    }

    protected fun exibirLivro(){
        if(nomeLivro == ""){
            println("-----------------------------------------------")
            println("Não há livros cadastrados no gênero selecionado")
        }
        else{
            println("----------------------------------------")
            println("O livro de $generoLivro cadastrado foi: ")
            println("$nomeLivro, de $autorLivro")
            println("----------------------------------------")
        }
    }
}