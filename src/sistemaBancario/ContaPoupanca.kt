package sistemaBancario

//Essa classe é filha da classe Conta

class ContaPoupanca: Conta("Conta Poupança") {

    fun criarContaPoupanca(){
        criarConta()
    }

    fun depositoContaPoupanca(){
        depositarDinheiro()
    }

    fun exibirContaPoupanca(){
        exibirTitularESaldo()
    }
}