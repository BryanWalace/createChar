package org.example

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test
import kotlin.test.assertEquals

class CaracteristicasTest {

    @Test
    fun testMostrarCaracteristicas() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        caracteristicas.mostrarCaracteristicas()

        // Valores iniciais certos?
        assertEquals(10, caracteristicas.forca)
        assertEquals(10, caracteristicas.destreza)
        assertEquals(10, caracteristicas.constituicao)
        assertEquals(10, caracteristicas.inteligencia)
        assertEquals(10, caracteristicas.sabedoria)
        assertEquals(10, caracteristicas.carisma)
    }

    @Test
    fun testPontoDeVida() {
        val caracteristicas = Caracteristicas(10, 10, 14, 10, 10, 10)

        // Pontos de vida são calculados corretamente?
        val pontoDeVidaEsperado = 12
        assertEquals(pontoDeVidaEsperado, caracteristicas.pontoDeVida)
    }

    @Test
    fun testMostrarResultado() {
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        val caracteristicas = Caracteristicas(12, 14, 13, 11, 15, 10)
        mostrarResultado("Anao", caracteristicas)

        val output = outputStream.toString()
        assert(output.contains("Raça: Anao"))
        assert(output.contains("Força: 12"))
        assert(output.contains("Destreza: 14"))
    }
}
