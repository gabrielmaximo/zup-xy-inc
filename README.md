# :cyclone: Desafio Backend Zup - XY Inc - GPS

<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/gabrielmaximo/zup-xy-inc.svg">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/gabrielmaximo/zup-xy-inc.svg">

  <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen">
</p>

## :clipboard: Documentação

### :arrows_counterclockwise: Rota para cadastro de um novo POI (Ponto de Interesse)
* ```http://localhost:8080/POIs/create```
* OBS: Perceba que o caminho da rota recebe POIs com a letra 's' em minuscula.
* Body Example:
  ```json
  "name": "Churrascaria",
  "x": 28,
  "y": 2
  ```
* Response Example:
```json
{
  "id": 7,
  "name": "Churrascaria",
  "x": 28,
  "y": 2
}
```

### :arrows_counterclockwise: Rota para listagem de todos os POI's cadastrados
* ```http://localhost:8080/POIs/list```
* Response Example:
  ```json
  [
    {
      "id": 1,
      "name": "Lanchonete",
      "x": 27,
      "y": 12
    },
    {
      "id": 2,
      "name": "Posto",
      "x": 31,
      "y": 18
    },
    {
      "id": 3,
      "name": "Joalheria",
      "x": 15,
      "y": 12
    },
        ...
  ]
  ```
  
### :arrows_counterclockwise: Rota para listar POIs por proximidade
* ```http://localhost:8080/POIs/proximities?x=20&y=10&d=10```
* OBS: Os params da requisição são obrigatórios (x, y, d).
* Response Example:
```json
  [
    {
      "id": 1,
      "name": "Lanchonete",
      "x": 27,
      "y": 12
    },
    {
      "id": 3,
      "name": "Joalheria",
      "x": 15,
      "y": 12
    },
    {
      "id": 5,
      "name": "Pub",
      "x": 12,
      "y": 8
    },
    {
      "id": 6,
      "name": "Supermercado",
      "x": 23,
      "y": 6
    }
  ]
```

## :warning: Dependências
* spring Boot Web
* JPA
* HSQL
* DevTools
* OpenJDK

## :arrow_forward: Como executar o projeto?
* Basta clonar o repositório, instalar as dependências (eu utilizei o maven para gerenciar as dependências), abrir o repositório pelo IntelliJ IDEA (eu utilizei a versão Ultimate Edition) e rodar a aplicação pelo arquivo XyIncApplication.kt que esta dentro de ```./src/main/kotlin/maximo/xyinc```. Simples assim!

## :floppy_disk: Base de Dados
* Eu utilizei o HSQL como banco de dados no projeto, pois ele é feito totalmente em Java e simples de utilizar dentro do projeto em questão, o que facilita na hora de rodar o projeto localmente para testar a aplicação

## :muscle: Dificuldades resumo e aprendizado sobre o desafio
* Como tenho pouca experiência com desenvolvimento de web services utilizando kotlin e spring boot então consultei alguns materiais que me ajudaram bastante.
* Consultei primeiramente a [documentação oficial](https://kotlinlang.org/docs/tutorials/spring-boot-restful.html) do kotlin para obter mais informações sobre REST API com spring boot e encontrei um tutorial ótimo!
* Em seguida busquei formas de faze uma conexão com algum DB popular como postgreSQL ou MySQL porém me deparei com o HSQL que se encaixou perfeitamente e facilitou muito o desenvolvimento
* Por último, um tutorial brasileiro que me ajudou bastante a entender como funciona a arquitetura dentro do kotlin foi a [Medium](https://medium.com/collabcode/criando-um-web-service-base-no-spring-boot-com-kotlin-962a51317d63)
* Tive problemas para usar o tipo Unisgned Int (UInt) do kotlin para inteiros não negativos conforme solicitado no deasfio, então optei pelo tipo Int para manter a aplicação funcionando