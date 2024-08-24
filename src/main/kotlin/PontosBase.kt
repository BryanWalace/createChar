package org.example
import java.util.Scanner

class PontosBase(private var pontos: Int, private val habilidades: MutableMap<String, Int>) {
    private val custoPontos = mapOf(8 to 0, 9 to 1, 10 to 2, 11 to 3, 12 to 4, 13 to 5, 14 to 7, 15 to 9)

    private val idNome = mapOf(
        1 to "Força",
        2 to "Destreza",
        3 to "Constituição",
        4 to "Inteligencia",
        5 to "Sabedoria",
        6 to "Carisma"
    )

    fun distribuirPontos() {
        val scanner = Scanner(System.`in`)
        println("Distribua seus pontos: $pontos")

        while (pontos > 0) {
            var pontosPossiveis = false

            println("Habilidades disponíveis:")
            idNome.forEach { (id, nome) ->
                println("Número: $id, Habilidade: $nome, Valor: ${habilidades[nome]}")
            }

            println("Escolha o número da habilidade para aumentar:")
            val idHabilidade = scanner.nextInt()
            scanner.nextLine()

            val nomeHabilidade = idNome[idHabilidade]
            if (nomeHabilidade == null || !habilidades.containsKey(nomeHabilidade)) {
                println("Número inválido. Tente novamente.")
                continue
            }

            val valorAtual = habilidades[nomeHabilidade] ?: 8
            if (valorAtual >= 15) {
                println("O valor da habilidade \"$nomeHabilidade\" já está no máximo.")
                continue
            }

            println("Digite a quantidade de pontos para adicionar à habilidade \"$nomeHabilidade\":")
            val qtdPontos = scanner.nextInt()
            scanner.nextLine()

            val novoValor = valorAtual + qtdPontos
            if (novoValor > 15) {
                println("O valor da habilidade não pode exceder 15. Tente uma quantidade menor.")
                continue
            }

            val custo = custoPontos[novoValor] ?: 0
            if (qtdPontos <= pontos && custo <= pontos) {
                habilidades[nomeHabilidade] = novoValor
                pontos -= custo
                pontosPossiveis = true
                println("Pontos restantes: $pontos")
            } else {
                println("Pontos insuficientes ou valor inválido.")
            }

            if (!pontosPossiveis) {
                println("Não é mais possível aumentar nenhuma habilidade com os pontos restantes.")
                break
            }
        }

        println("Todos os pontos distribuídos.")
        idNome.forEach { (id, nome) ->
            println("Número: $id, Atributo: $nome, Valor: ${habilidades[nome]}")
        }
    }
}
