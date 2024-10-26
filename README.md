# API ViaCEP Integration Project

Este é um projeto desenvolvido como parte do curso da Alura, com o objetivo de realizar a integração com a API **ViaCEP** para busca de endereços a partir de CEPs no Brasil. O projeto foi criado em **Java** e utiliza **Gson** para conversão de JSON para objetos Java.

## Índice

- [Sobre o Projeto](#sobre-o-projeto)
- [Como Funciona](#como-funciona)
- [Funcionalidades](#funcionalidades)
- [Instalação e Uso](#instalação-e-uso)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Sobre o Projeto

O projeto tem como objetivo permitir que o usuário insira um CEP e receba os dados do endereço completo, utilizando a API pública **ViaCEP**. Esta aplicação foi desenvolvida como exercício prático para aplicar conceitos de requisições HTTP e manipulação de JSON em Java.

## Como Funciona

1. O usuário insere um CEP (sem hífen) através do terminal.
2. A aplicação envia uma requisição HTTP para a API ViaCEP.
3. O retorno da API é um JSON que é convertido em um objeto Java.
4. Os dados do endereço são exibidos no terminal e também salvos em um arquivo `enderecos.txt`.

## Funcionalidades

- Consultar endereços pelo CEP.
- Conversão automática de JSON para objetos Java.
- Salva os dados do endereço em um arquivo `.txt`.

## Instalação e Uso

### Pré-requisitos

- **Java JDK** 11 ou superior.
- Dependência **Gson** para manipulação de JSON.

### Passos para Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/usuario/nome-do-repositorio.git
   Instale as dependências necessárias (exemplo usando Maven):
2. Instale as dependências necessárias (exemplo usando Maven):
    ```xml
    <dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.6</version>
    </dependency>
3. Compile e execute o projeto:
    ```bash
    javac -d bin src/br/com/alura/cursos/API/Main/Main.java
    java -cp bin br.com.alura.cursos.API.Main.Main
4. Digite um CEP para buscar o endereço e visualize o resultado.

## Tecnologias Utilizadas
- **Java** - Linguagem principal do projeto.
- **Gson** - Para serialização e desserialização de JSON.
- **ViaCEP API** - Para consultar endereços.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para fazer um fork do repositório e enviar um pull request com melhorias, correções de bugs ou novas funcionalidades.

## Licença
Este projeto é licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.