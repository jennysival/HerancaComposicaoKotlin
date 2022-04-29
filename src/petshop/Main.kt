package petshop
//Construa um sistema para petshop onde o cliente pode registrar o
//nome de pelo menos 3 tipos de animais diferentes, crie alguns
//objetos exemplo e mostre em tela o nome dos animais registrados.
fun main() {

    val gatinho = Gato()
    val cachorrinho = Cachorro()
    val peixinho = Peixe()

    println("SEJA BEM-VINDE AO PETSHOP")
    println("-------------------------")


    gatinho.cadastrarTutorGato()
    println("Cadastrar seu Pet:")
    gatinho.cadastrarGato()
    println("...")
    println("Vacinar seu Pet:")
    gatinho.vacinarGato()


    println("------------------")
    cachorrinho.cadastrarTutorCachorro()
    println("Cadastrar seu Pet:")
    cachorrinho.cadastrarCachorro()
    println("...")
    println("Vacinar seu Pet:")
    cachorrinho.vacinarCachorro()

    println("------------------")
    peixinho.cadastrarTutorPeixe()
    println("Cadastrar seu Pet:")
    peixinho.cadastrarPeixe()
    println("...")
    println("Vacinar seu Pet:")
    peixinho.vacinarPeixe()

}