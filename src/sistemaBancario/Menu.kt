package sistemaBancario
import kotlin.system.exitProcess

class Menu {
    private val contaC = ContaCorrente()
    private val contaP = ContaPoupanca()
    private val contaS = ContaSalario()

    fun menuGeral(){
        println("-------------------------")
        println("[1] Sou novo cliente")
        println("[2] Já tenho conta")
        print("Escolha a opção desejada: ")
        when(readln().toInt()){
            1 -> menuAbrirConta()
            2 -> menuClienteTitular()
            else -> {
                println("Comando inválido")
                menuGeral()
            }
        }
    }

    private fun menuAbrirConta(){
        println("------------------------")
        println("ABRIR CONTA:")
        println("[1] Corrente")
        println("[2] Poupança")
        println("[3] Salário")
        println("[4] Sair")
        print("Escolha a opção desejada: ")
        when(readln().toInt()){
            1 -> {
                contaC.criarContaCorrente()
                contaC.depositoContaCorrente()
                menuClienteTitular()
            }
            2 -> {
                contaP.criarContaPoupanca()
                contaP.depositoContaPoupanca()
                menuClienteTitular()
            }
            3 -> {
                contaS.criarContaSalario()
                contaS.depositoContaSalario()
                menuClienteTitular()
            }
            4 -> exitProcess(0)
            else -> {
                println("Comando inválido")
                menuAbrirConta()
            }
        }
    }

    private fun menuClienteTitular(){
        println("--------------------------")
        println("Escolha a opção desejada: ")
        println("[1] Exibir minha Conta")
        println("[2] Depositar dinheiro")
        println("[3] ABRIR nova conta")
        println("[4] Sair")
        when(readln().toInt()){
            1 -> menuExibirConta()
            2 -> menuDepositoEmConta()
            3 -> menuAbrirConta()
            4 -> exitProcess(0)
            else -> {
                println("Comando inválido")
                menuClienteTitular()
            }
        }
    }

    private fun menuExibirConta(){
        println("-------------------------")
        println("EXIBIR SALDO: ")
        println("[1] Conta Corrente")
        println("[2] Conta Poupança")
        println("[3] Conta Salário")
        println("[4] Voltar")
        println("[5] Sair")
        println("Escolha a opção desejada:")
        when(readln().toInt()){
            1 -> {
                contaC.exibirContaCorrente()
                menuClienteTitular()
            }
            2 -> {
                contaP.exibirContaPoupanca()
                menuClienteTitular()
            }
            3 -> {
                contaS.exibirContaSalario()
                menuClienteTitular()
            }
            4 -> menuClienteTitular()
            else -> {
                println("Comando inválido")
                menuExibirConta()
            }
        }
        }

    private fun menuDepositoEmConta(){
        println("-------------------------")
        println("DEPÓSITO EM:")
        println("[1] Conta Corrente")
        println("[2] Conta Poupança")
        println("[3] Conta Salário")
        println("[4] Voltar")
        println("[5] Sair")
        print("Escolha a opção desejada: ")
        when(readln().toInt()){
            1 -> {
                contaC.depositoContaCorrente()
                menuClienteTitular()
            }
            2 -> {
                contaP.depositoContaPoupanca()
                menuClienteTitular()
            }
            3 -> {
                contaS.depositoContaSalario()
                menuClienteTitular()
            }
            4 -> menuClienteTitular()
            else -> {
                println("Comando inválido")
                menuDepositoEmConta()
            }
        }
    }
    }