package sistemaBancario

//Essa classe é filha da classe Conta

class ContaCorrente: Conta("Conta Corrente") {

    fun criarContaCorrente(){
        criarConta()
    }

    fun depositoContaCorrente(){
        depositarDinheiro()
    }

    fun exibirContaCorrente(){
        exibirTitularESaldo()
    }

}