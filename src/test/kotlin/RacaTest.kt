package org.example

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class RacasTest {

    @Test
    fun testRacaSelecionada() {
        val anao = racaSelecionada(1)
        assert(anao is AnaoDaMontanha)

        val draconato = racaSelecionada(2)
        assert(draconato is Draconato)

        val humano = racaSelecionada(3)
        assert(humano is Humano)
    }

    @Test
    fun testRacaSelecionadaInvalida() {
        assertFailsWith<IllegalArgumentException> {
            racaSelecionada(99)
        }
    }

    @Test
    fun testCapRaca() {
        assertEquals("Anão da Montanha", capRaca(1))
        assertEquals("Draconato", capRaca(2))
        assertEquals("Raça desconhecida", capRaca(99))
    }
}
