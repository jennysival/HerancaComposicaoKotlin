package petshop

class Cachorro: AnimalPet("Cachorro", "Melancia", "Gabe") {
    fun cadastrarCachorro(){
        exibirPetCadastrado()
    }

    fun vacinarCachorro(){
        vacinarPetCadastrado()
    }

}