package org.example

import kotlin.test.Test
import kotlin.test.assertEquals

class BonusRacaTest {

    @Test
    fun testAnaoDaMontanhaBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val anaoDaMontanha = AnaoDaMontanha()
        val resultado = anaoDaMontanha.bonus(caracteristicas)

        assertEquals(12, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(10, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(10, resultado.carisma)
    }

    @Test
    fun testDraconatoBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val draconato = Draconato()
        val resultado = draconato.bonus(caracteristicas)

        assertEquals(12, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(10, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(11, resultado.carisma)
    }

    @Test
    fun testHumanoBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val humano = Humano()
        val resultado = humano.bonus(caracteristicas)

        assertEquals(11, resultado.forca)
        assertEquals(11, resultado.destreza)
        assertEquals(11, resultado.constituicao)
        assertEquals(11, resultado.inteligencia)
        assertEquals(11, resultado.sabedoria)
        assertEquals(11, resultado.carisma)
    }

    @Test
    fun testMeioOrcBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val meioOrc = MeioOrc()
        val resultado = meioOrc.bonus(caracteristicas)

        assertEquals(12, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(11, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(10, resultado.carisma)
    }

    @Test
    fun testElfoBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val elfo = Elfo()
        val resultado = elfo.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(12, resultado.destreza)
        assertEquals(10, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(10, resultado.carisma)
    }

    @Test
    fun testHalflingBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val halfling = Halfling()
        val resultado = halfling.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(12, resultado.destreza)
        assertEquals(10, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(10, resultado.carisma)
    }

    @Test
    fun testGnomoDaFlorestaBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val gnomoDaFloresta = GnomoDaFloresta()
        val resultado = gnomoDaFloresta.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(11, resultado.destreza)
        assertEquals(10, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(10, resultado.carisma)
    }

    @Test
    fun testAnaoBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val anao = Anao()
        val resultado = anao.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(12, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(10, resultado.carisma)
    }

    @Test
    fun testHalflingRobustoBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val halflingRobusto = HalflingRobusto()
        val resultado = halflingRobusto.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(11, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(10, resultado.carisma)
    }

    @Test
    fun testGnomoDasRochasBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val gnomoDasRochas = GnomoDasRochas()
        val resultado = gnomoDasRochas.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(11, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(10, resultado.carisma)
    }

    @Test
    fun testAltoElfoBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val altoElfo = AltoElfo()
        val resultado = altoElfo.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(10, resultado.constituicao)
        assertEquals(11, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(10, resultado.carisma)
    }

    @Test
    fun testTieflingBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val tiefling = Tiefling()
        val resultado = tiefling.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(10, resultado.constituicao)
        assertEquals(11, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(12, resultado.carisma)
    }

    @Test
    fun testAnaoDaColinaBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val anaoDaColina = AnaoDaColina()
        val resultado = anaoDaColina.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(10, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(11, resultado.sabedoria)
        assertEquals(10, resultado.carisma)
    }

    @Test
    fun testElfoDaFlorestaBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val elfoDaFloresta = ElfoDaFloresta()
        val resultado = elfoDaFloresta.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(10, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(11, resultado.sabedoria)
        assertEquals(10, resultado.carisma)
    }

    @Test
    fun testMeioElfoBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val meioElfo = MeioElfo()
        val resultado = meioElfo.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(10, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(12, resultado.carisma)
    }

    @Test
    fun testDrowBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val drow = Drow()
        val resultado = drow.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(10, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(11, resultado.carisma)
    }

    @Test
    fun testHalflingPesLevesBonus() {
        val caracteristicas = Caracteristicas(10, 10, 10, 10, 10, 10)
        val halflingPesLeves = HalflingPesLeves()
        val resultado = halflingPesLeves.bonus(caracteristicas)

        assertEquals(10, resultado.forca)
        assertEquals(10, resultado.destreza)
        assertEquals(10, resultado.constituicao)
        assertEquals(10, resultado.inteligencia)
        assertEquals(10, resultado.sabedoria)
        assertEquals(11, resultado.carisma)
    }
}
