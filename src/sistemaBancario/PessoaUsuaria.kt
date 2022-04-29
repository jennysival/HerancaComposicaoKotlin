package sistemaBancario

class PessoaUsuaria {
   var nomeUsuario: String = ""

    fun cadastrarUsuario(){
        println("Digite o nome do titular da conta: ")
        nomeUsuario = readln()
    }

}

