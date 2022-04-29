package biblioteca

import kotlin.system.exitProcess

class Menus {
    private val livroRomance = Romance()
    private val livroTerror = Terror()
    private val livroSuspense = Suspense()

    fun menuCadastro(){
        println("Atualmente estamos recebendo livros nos gêneros: Romance, Terror e Suspense")
        print("Digite o gênero desejado: ")
        when(readln().lowercase()){
            "romance" -> {
                livroRomance.cadastrarLivroDeRomance()
                menuOpcoes()
            }
            "terror" -> {
                livroTerror.cadastrarLivroDeTerror()
                menuOpcoes()
            }
            "suspense" -> {
                livroSuspense.cadastrarLivroDeSuspense()
                menuOpcoes()
            }
            else -> {
                println("Gênero inválido")
                menuCadastro()
            }
        }
    }

    private fun menuOpcoes(){
        println("---------------------------------")
        println("O que deseja fazer agora?")
        println("[1] Visualizar livros cadastrados")
        println("[2] Cadastrar Mais Livros")
        println("[3] Sair")
        print("Digite a opção desejada: ")
        when(readln().toInt()){
            1 -> menuExibirLivro()
            2 -> menuCadastro()
            3 -> exitProcess(0)
            else -> {
                println("Opção inválida")
                menuOpcoes()
            }
        }
    }

    private fun menuExibirLivro(){
        println("-------------------------")
        println("EXIBIR LIVROS CADASTRADOS")
        println("Escolha o gênero literário:")
        println("[1] Romance")
        println("[2] Terror")
        println("[3] Suspense")
        when(readln().toInt()){
            1 -> {
                livroRomance.exibirLivroRomance()
                menuOpcoes()
            }
            2 -> {
                livroTerror.exibirLivroTerror()
                menuOpcoes()
            }
            3 -> {
                livroSuspense.exibirLivroSuspense()
                menuOpcoes()
            }

        }
    }
}