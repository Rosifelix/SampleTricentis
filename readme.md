 # Projeto de automação de Testes - SampleApp Tricentis

# Projeto de Automação de Testes

Este projeto tem como objetivo validar a cotação de seguros, utilizando **Page objects**, utilizando **Java**, **Selenium WebDriver**, **JUnit** e **Cucumber** para testes BDD (Behavior-Driven Development).

## Ferramentas e Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver os testes.
- **Selenium WebDriver**: Ferramenta de automação para interação com navegadores.
- **JUnit**: Framework de testes para execução e organização dos testes automatizados.
- **Cucumber**: Framework para desenvolvimento de testes BDD, permitindo escrita de cenários de teste em linguagem natural (Gherkin).
- **Maven**: Gerenciador de dependências e execução de testes.
- **Gherkin**: Linguagem usada para descrever cenários de teste de forma legível.

## Pré-requisitos

Antes de iniciar, você precisará ter o seguinte instalado na sua máquina:

- **Java** (JDK 8 ou superior)
- **Maven** (para gerenciar dependências)
- **Git** (para versionamento de código)

> Certifique-se de que o Java e o Maven estão configurados nas variáveis de ambiente para uso no terminal.

## Configuração do Projeto

1. Clone o repositório:

    ```bash
    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    ```

2. Acesse o diretório do projeto:

    ```bash
    cd nome-do-repositorio
    ```

3. Instale as dependências do projeto com o Maven:

    ```bash
    mvn install
    ```

## Estrutura do Projeto

O projeto está organizado nas seguintes pastas:

- `src/main/java`: Contém o código fonte do projeto.
- `src/test/java`: Contém os testes automatizados.
- `src/test/resources`: Contém os arquivos de configuração e os arquivos `.feature` do Cucumber.

### Principais Pacotes

- `features`: Contém os arquivos `.feature` escritos em Gherkin, descrevendo os cenários de teste.
- `steps`: Contém as classes de implementação dos passos (step definitions) dos cenários de teste.
- `runners`: Contém a configuração do JUnit para executar os testes com o Cucumber.

## Execução dos Testes

Para executar os testes, utilize um dos seguintes comandos:

### Executar Todos os Testes

```bash
mvn test
