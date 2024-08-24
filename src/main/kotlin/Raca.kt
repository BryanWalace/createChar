package org.example

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