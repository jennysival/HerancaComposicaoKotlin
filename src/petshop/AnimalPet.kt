package petshop

open class AnimalPet(private val especieDoPet: String, private val nomeDoPet: String, private val nomeTutor: String) {
    protected fun exibirPetCadastrado(){
        println("Seu $especieDoPet se chama $nomeDoPet")
    }

    protected fun vacinarPetCadastrado(){
        println("$nomeDoPet está sendo vacinado :)")
        println("...")
        println("Obrigada por vacinar seu $especieDoPet")
    }

    protected fun cadastrarTutor(){
        println("Olá, $nomeTutor!")
    }
}