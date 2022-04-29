package petshop

class Gato: AnimalPet("Gato", "Figaro", "Jenny") {

    fun cadastrarGato(){
        exibirPetCadastrado()
    }

    fun vacinarGato(){
        vacinarPetCadastrado()
    }

    fun cadastrarTutorGato(){
        cadastrarTutor()
    }

}