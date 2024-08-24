package org.example

data class Caracteristicas (
    var nome: String,
    var raca: Race,
    var forca: int,
    var destreza: int,
    var constituicao: int,
    var inteligencia: int,
    var sabedoria: int,
    var carisma: int
) {
    val pontoDeVida: int
        get() = 10 + (constitution - 10) / 2
}