package org.example

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class PontosBaseTest {

    @Test
    fun testDistribuirPontosCorretamente() {
        val habilidades = mutableMapOf(
            "Força" to 8,
            "Destreza" to 8,
            "Constituição" to 8,
            "Inteligencia" to 8,
            "Sabedoria" to 8,
            "Carisma" to 8
        )
        val pontosBase = PontosBase(27, habilidades)

        //interação com o usuário
        pontosBase.distribuirPontos()

        // Pontos foram distribuídos corretamente?
        assertTrue(habilidades["Força"] ?: 0 > 8)
        assertTrue(habilidades["Destreza"] ?: 0 > 8)
        assertTrue(habilidades["Constituição"] ?: 0 > 8)
        assertEquals(27, 27) // Exemplo de teste
    }

    @Test
    fun testDistribuirPontosInsuficientes() {
        val habilidades = mutableMapOf(
            "Força" to 15,
            "Destreza" to 8,
            "Constituição" to 8,
            "Inteligencia" to 8,
            "Sabedoria" to 8,
            "Carisma" to 8
        )
        val pontosBase = PontosBase(1, habilidades)

        pontosBase.distribuirPontos()

        // Pontos não foram alterados?
        assertEquals(15, habilidades["Força"])
        assertEquals(8, habilidades["Destreza"])
    }
}
