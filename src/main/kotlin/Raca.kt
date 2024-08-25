package org.example
import java.util.Scanner

interface BonusRaca {
    fun bonus(caracteristicas: Caracteristicas): Caracteristicas
}
class AnaoDaMontanha : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca + 2,
            caracteristicas.destreza,
            caracteristicas.constituicao ,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria,
            caracteristicas.carisma
        )
    }
}

class Draconato : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca + 2,
            caracteristicas.destreza,
            caracteristicas.constituicao,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria,
            caracteristicas.carisma + 1
        )
    }
}

class Humano : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca + 1,
            caracteristicas.destreza + 1,
            caracteristicas.constituicao + 1,
            caracteristicas.inteligencia + 1,
            caracteristicas.sabedoria + 1,
            caracteristicas.carisma + 1
        )
    }
}

class MeioOrc : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca + 2,
            caracteristicas.destreza,
            caracteristicas.constituicao + 1,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria,
            caracteristicas.carisma
        )
    }
}

class Elfo : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza + 2,
            caracteristicas.constituicao,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria,
            caracteristicas.carisma
        )
    }
}

class Halfling : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza + 2,
            caracteristicas.constituicao,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria,
            caracteristicas.carisma
        )
    }
}

class GnomoDaFloresta : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza + 1,
            caracteristicas.constituicao,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria,
            caracteristicas.carisma
        )
    }
}

class Anao : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza,
            caracteristicas.constituicao + 2,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria,
            caracteristicas.carisma
        )
    }
}

class HalflingRobusto : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza,
            caracteristicas.constituicao + 1,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria,
            caracteristicas.carisma
        )
    }
}

class GnomoDasRochas : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza,
            caracteristicas.constituicao + 1,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria,
            caracteristicas.carisma
        )
    }
}

class AltoElfo : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza,
            caracteristicas.constituicao,
            caracteristicas.inteligencia + 1,
            caracteristicas.sabedoria,
            caracteristicas.carisma
        )
    }
}

class Tiefling : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza,
            caracteristicas.constituicao,
            caracteristicas.inteligencia + 1,
            caracteristicas.sabedoria,
            caracteristicas.carisma + 2
        )
    }
}

class AnaoDaColina : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza,
            caracteristicas.constituicao,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria + 1,
            caracteristicas.carisma
        )
    }
}

class ElfoDaFloresta : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza,
            caracteristicas.constituicao,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria + 1,
            caracteristicas.carisma
        )
    }
}

class MeioElfo : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza,
            caracteristicas.constituicao,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria,
            caracteristicas.carisma + 2
        )
    }
}

class Drow : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza,
            caracteristicas.constituicao,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria,
            caracteristicas.carisma + 1
        )
    }
}

class HalflingPesLeves : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza,
            caracteristicas.constituicao,
            caracteristicas.inteligencia,
            caracteristicas.sabedoria,
            caracteristicas.carisma + 1
        )
    }
}

class Gnomo : BonusRaca {
    override fun bonus(caracteristicas: Caracteristicas): Caracteristicas {
        return Caracteristicas(
            caracteristicas.forca,
            caracteristicas.destreza,
            caracteristicas.constituicao,
            caracteristicas.inteligencia + 2,
            caracteristicas.sabedoria,
            caracteristicas.carisma
        )
    }
}

fun mostrarRacas() {
    println("Todas as Raças:")
    println("1. Anão da Montanha")
    println("2. Draconato")
    println("3. Humano")
    println("4. Meio-Orc")
    println("5. Elfo")
    println("6. Halfling")
    println("7. Gnomo da Floresta")
    println("8. Anão")
    println("9. Halfling Robusto")
    println("10. Gnomo das Rochas")
    println("11. Alto Elfo")
    println("12. Tiefling")
    println("13. Anão da Colina")
    println("14. Elfo da Floresta")
    println("15. Meio-Elfo")
    println("16. Drow")
    println("17. Halfling Pés-Leves")
    println("18. Gnomo")
}

fun selecionarRaca(): Int {
    val scanner = Scanner(System.`in`)
    print("Digite o numero da raça: ")
    return scanner.nextInt()
}

fun racaSelecionada(idRaca: Int): BonusRaca {
    return when (idRaca){
        1 -> AnaoDaMontanha()
        2 -> Draconato()
        3 -> Humano()
        4 -> MeioOrc()
        5 -> Elfo()
        6 -> Halfling()
        7 -> GnomoDaFloresta()
        8 -> Anao()
        9 -> HalflingRobusto()
        10 -> GnomoDasRochas()
        11 -> AltoElfo()
        12 -> Tiefling()
        13 -> AnaoDaColina()
        14 -> ElfoDaFloresta()
        15 -> MeioElfo()
        16 -> Drow()
        17 -> HalflingPesLeves()
        18 -> Gnomo()
        else -> throw IllegalArgumentException("Numero da raça desconhecida: $idRaca")
    }
}

fun capRaca(idRaca: Int): String {
    return when (idRaca) {
        1 -> "Anão da Montanha"
        2 -> "Draconato"
        3 -> "Humano"
        4 -> "Meio-Orc"
        5 -> "Elfo"
        6 -> "Halfling"
        7 -> "Gnomo da Floresta"
        8 -> "Anão"
        9 -> "Halfling Robusto"
        10 -> "Gnomo das Rochas"
        11 -> "Alto Elfo"
        12 -> "Tiefling"
        13 -> "Anão da Colina"
        14 -> "Elfo da Floresta"
        15 -> "Meio-Elfo"
        16 -> "Drow"
        17 -> "Halfling Pés-Leves"
        18 -> "Gnomo"
        else -> "Raça desconhecida"
    }
}