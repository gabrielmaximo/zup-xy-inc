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
* Eu utilizei o HSQL como banco de dados, pois ele é feito totalmente em Java e simples de utilizar, o que facilita na hora de rodar o projeto localmente para testar a aplicação

## :muscle: Dificuldades resumo e aprendizado sobre o desafio
* Como tenho pouca experiência com desenvolvimento de API's REST utilizando kotlin e spring boot então consultei alguns materiais que me ajudaram bastante.
* Consultei primeiramente a [documentação oficial](https://kotlinlang.org/docs/tutorials/spring-boot-restful.html) do kotlin para obter mais informações sobre algumas peculiaridades linguagem.
* Em seguida busquei formas de fazer uma conexão com algum DB popular como postgreSQL ou MySQL porém me deparei com o HSQL que se encaixou perfeitamente e facilitou muito o desenvolvimento, não precisando de um docker ou a instalaço de um banco localmente.
* Por último, um tutorial brasileiro que me ajudou bastante a entender como funciona a arquitetura dentro do kotlin com spring foi a [Medium](https://medium.com/collabcode/criando-um-web-service-base-no-spring-boot-com-kotlin-962a51317d63)
* Tive problemas para usar o tipo Unisgned Int (UInt) do kotlin para inteiros não negativos conforme solicitado no deasfio, então optei pelo tipo Int para manter a aplicação funcionando. 
* Além desse pecado, talvez meu codigo não esteja escrito da melhor maneira e na melhor performance, isso se deve ao fato de que eu estou dando meus primeiros passos no framework spring boot e na linguagem kotlin, eu venho do javascript com node.js, mas aprendi bem rapido em apenas um final de semana, a tal ponto de conseguir rodar a aplicação e conseguir o retorno desejado. 
* Em suma, esse desafio, pra mim, foi um aprendizado surreal! Sei que as boas práticas são o coração do desenvolvimento de software, ainda mais quando se trata do backend e trabalho em equipe, espero poder melhorar essas práticas com vocês.
