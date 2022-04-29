package sistemaBancario

//Essa é a classe mãe

open class Conta(private val tipoDeConta: String) {
    private var saldo = 0.0
    private var nomeTitular = "Você não tem uma conta do tipo selecionado"
    private val cadastrarUsuario = PessoaUsuaria()

    protected fun criarConta(){
        cadastrarUsuario.cadastrarUsuario()
        nomeTitular = cadastrarUsuario.nomeUsuario
        println("Conta criada com sucesso!")
    }

    protected fun depositarDinheiro(){
        if(nomeTitular == "Você não tem uma conta do tipo selecionado"){
            println(nomeTitular)
        }
        else{
            println("Digite a quantidade de dinheiro a ser depositada: ")
            val deposito = readln().toDouble()
            saldo += deposito
        }

    }

    protected fun exibirTitularESaldo(){

        if(nomeTitular == "Você não tem uma conta do tipo selecionado"){
            println(nomeTitular)
        }
        else{
            println(tipoDeConta)
            println("Titular: $nomeTitular")
            println("Saldo: $saldo")
        }


    }
}