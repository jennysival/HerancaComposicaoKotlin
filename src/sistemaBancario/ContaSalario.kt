package sistemaBancario

//Essa classe é filha da classe Conta

class ContaSalario: Conta("Conta Salário") {

    fun criarContaSalario(){
        criarConta()
    }

    fun depositoContaSalario(){
        depositarDinheiro()
    }

    fun exibirContaSalario(){
        exibirTitularESaldo()
    }
}