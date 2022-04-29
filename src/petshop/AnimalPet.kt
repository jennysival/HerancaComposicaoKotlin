package petshop

open class AnimalPet(val especieDoPet: String, val nomeDoPet: String, val nomeTutor: String) {
    fun exibirPetCadastrado(){
        println("Seu $especieDoPet se chama $nomeDoPet")
    }

    fun vacinarPetCadastrado(){
        println("$nomeDoPet está sendo vacinado :)")
        println("...")
        println("Obrigada por vacinar seu $especieDoPet")
    }

    fun cadastrarTutor(){
        println("Olá, $nomeTutor!")
    }
}