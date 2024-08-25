package org.example

fun main() {
    val habilidade = mutableMapOf(
        "Força" to 8,
        "Destreza" to 8,
        "Constituição" to 8,
        "Inteligencia" to 8,
        "Sabedoria" to 8,
        "Carisma" to 8
    )

    val pontosBase = PontosBase(27, habilidade)
    pontosBase.distribuirPontos()

    val caracteristicas = Caracteristicas(
        habilidade["Força"] ?:8,
        habilidade["Destreza"] ?:8,
        habilidade["Constituição"] ?:8,
        habilidade["Inteligencia"] ?:8,
        habilidade["Sabedoria"] ?:8,
        habilidade["Carisma"] ?:8,
    )

    mostrarRacas()

    val idRaca = selecionarRaca()
    val nomeRaca = capRaca(idRaca)
    val bonusRaca = racaSelecionada(idRaca)
    val caracteristicaFinal = bonusRaca.bonus(caracteristicas)


    mostrarResultado(nomeRaca, caracteristicaFinal)
}
