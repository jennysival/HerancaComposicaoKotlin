package petshop

class Peixe: AnimalPet("Peixinho Dourado", "Cleo", "Jenny e Gabe") {
    fun cadastrarPeixe(){
        exibirPetCadastrado()
    }

    fun vacinarPeixe(){
        vacinarPetCadastrado()
    }
}