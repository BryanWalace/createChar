package org.example

data class Caracteristicas (
    var forca: Int,
    var destreza: Int,
    var constituicao: Int,
    var inteligencia: Int,
    var sabedoria: Int,
    var carisma: Int
) {
    val pontoDeVida: Int = 10 + (constituicao - 10) / 2

    fun mostrarCaracteristicas(){
        println("Habilidades do personagem:")
        println("Força: $forca")
        println("Destreza: $destreza")
        println("Constituição: $constituicao")
        println("Inteligencia: $inteligencia")
        println("Sabedoria: $sabedoria")
        println("Carisma: $carisma")
        println("Pontos de vida: $pontoDeVida")
    }
}

fun mostrarResultado(nomeRaca: String, caracteristicas: Caracteristicas) {
    repeat(50) { println() }
    println("Raça: $nomeRaca")
    caracteristicas.mostrarCaracteristicas()
}