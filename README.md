# Criação de Personagens para Dungeons & Dragons

## Descrição

Este projeto é uma implementação em Kotlin para a criação de personagens de **Dungeons & Dragons** (D&D). Ele permite a criação e personalização de personagens, aplicando atributos básicos e bônus raciais de acordo com a raça escolhida. O sistema inclui a distribuição de pontos para habilidades, a aplicação de bônus raciais e a visualização final das características do personagem.

## Funcionalidades

- **Distribuição de Pontos**: Permite distribuir pontos de habilidades entre Força, Destreza, Constituição, Inteligência, Sabedoria e Carisma.
- **Atributos de Características**: Calcula e exibe os atributos finais do personagem após a distribuição de pontos e aplicação de bônus raciais.
- **Seleção de Raça**: Suporta diversas raças de D&D, cada uma com seus próprios bônus raciais, como Anão, Elfo, Humano, entre outros.
- **Exibição de Resultados**: Mostra as características finais do personagem, incluindo a raça e os atributos ajustados.

## Estrutura do Projeto

- **`main.kt`**: Contém a lógica principal do programa, incluindo a distribuição de pontos e a aplicação de bônus raciais.
- **`Caracteristicas.kt`**: Define a estrutura de dados para armazenar as características do personagem.
- **`PontosBase.kt`**: Lida com a distribuição de pontos iniciais nas habilidades do personagem.
- **`Racas.kt`**: Implementa a lógica para aplicar bônus raciais baseados na raça escolhida.
- **`BonusRacaTest.kt`**: Contém testes unitários para verificar a aplicação correta dos bônus raciais.

## Testes

O projeto inclui testes unitários utilizando Kotlin Test para garantir a funcionalidade correta da distribuição de pontos e aplicação dos bônus raciais. Os testes são executados para validar as características finais do personagem e o comportamento das funções principais.

## Como Executar

1. **Clone o Repositório**:
    ```sh
    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    ```

2. **Navegue até o Diretório do Projeto**:
    ```sh
    cd nome-do-repositorio
    ```

3. **Compile e Execute o Projeto**:
    Se estiver usando Maven:
    ```sh
    mvn compile exec:java -Dexec.mainClass="org.example.Main"
    ```

    Se estiver usando Gradle:
    ```sh
    gradle run
    ```

4. **Execute os Testes**:
    Se estiver usando Maven:
    ```sh
    mvn test
    ```

    Se estiver usando Gradle:
    ```sh
    gradle test
    ```

## Contribuição

Sinta-se à vontade para contribuir com o projeto. Se você encontrar um bug ou tiver sugestões de melhorias, abra uma issue ou envie um pull request.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
