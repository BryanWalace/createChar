package org.example

data class Caracteristicas (
    var forca: int,
    var destreza: int,
    var constituicao: int,
    var inteligencia: int,
    var sabedoria: int,
    var carisma: int
) {
    val pontoDeVida: int = 10 + (constituicao - 10) / 2

    fun mostrarCaracteristicas(){
        println("Atributos do personagem:")
        println("Força: $forca")
        println("Destreza: $destreza")
        println("Constituição: $constituicao")
        println("Inteligencia: $inteligencia")
        println("Sabedoria: $sabedoria")
        println("Carisma: $carisma")
        println("Pontos de vida: $pontoDeVida")
    }
}