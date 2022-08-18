# Projeto Back-end

Após ler o enunciado disponível [aqui](../README.md "DESAFIO DEVELOPERUP STEFANINI"), você poderá seguir este tutorial para ver os procedimentos necessários para rodar o projeto backend.

Este projeto utiliza o framework Quarkus.
Também estamos utilizando o "Hibernate Simplificado ORM com Panache" como plugin no nosso plojeto para facilitar o trabalho de acesso ao banco de dados.
Obs.: O Hibernate ORM é a implementação JPA de fato e oferece a você toda a amplitude de um "Mapeador Relacional de Objetos" substituindo a necessidade de codificar utilizando o SQL nativo.
Se quiser aprender mais mais sobre o tema acesse a documentação de apoio (https://quarkus.io/guides/hibernate-orm-panache).

** Fique a vontade para utilizar o SQL. **


## Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina o JDK um bom editor de código:
- [Amazon Corretto JDK] (https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html).
- Caso você tenha preferência de IDE, como por exemplo IntelliJ, VSCode, entre outros poderá pular esse passo.
Há sempre quem prefira uma ferramenta mais completa para edição de código Java, basta instalar o [Eclipse](https://www.eclipse.org/downloads/).


## Rodando Back-end
Você tem duas formas de rodar o programa:
Acesse a pasta do projeto clonado no terminal (cmd ou terminal da IDE)

`1`: A primeira é usando o maven embutido no projeto da seguinte forma
# Vá para a pasta backend
```shell script
$ cd backend
```

# Compile a aplicação - Windows
```shell script
mvnw compile quarkus:dev
```

 # Compile a aplicação - Linux
```shell script
./mvnw compile quarkus:dev
```
> **_NOTE:_**  Para usar o maven do projeto as variáveis de ambiente deverão estar configuradas, exemplo JAVA_HOME.
> **_NOTE:_**  O Quarkus agora vem com uma Dev UI, que está disponível no modo dev apenas em at http://localhost:8080/q/dev/.

`2`: A outra forma é utilizando um maven externo do projeto ou fornecido pela sua IDE.


## Acessando a API
Esta API expõe o swagger, que além de outras coisas serve como documentação para o desenvolvedor ver como e quais endpoints estão disponíveis, e poder testar a api sem depender do frontend.

## Swagger UI
http://localhost:8080/q/swagger-ui/

## Executando testes de integração
Para a realização dos testes fique atendo a estrutura de onde cada Classe deve ficar. Além disso é necessário rodar o seguinte comando para rodar os testes.
# Testando a aplicação - Windows
```shell script
mvnw verify
```
# Testando a aplicação - Linux
```shell script
./mvnw verify
```
**_NOTE:_**  Note que o diretorio `\target\jacoco-report` foi criado, para acessar a cobertura do seu código abra o arquivo `index.html` no seu navegador.

### Estrutura do Projeto
📦src\
┣ 📂main\
┃ ┣ 📂docker\
┃ ┣ 📂java\
┃ ┃ ┗ 📂br\
┃ ┃ ┃ ┗ 📂com\
┃ ┃ ┃ ┃ ┗ 📂stefanini\
┃ ┃ ┃ ┃ ┃ ┗ 📂developerup\
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao\
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto\
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂model\
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂rest\
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂service\
┃ ┗ 📂resources\
┃ ┃ ┣ 📂META-INF\
┗ 📂test\
┃ ┣ 📂java\
┃ ┃ ┗ 📂br\
┃ ┃ ┃ ┗ 📂com\
┃ ┃ ┃ ┃ ┗ 📂stefanini\
┃ ┃ ┃ ┃ ┃ ┗ 📂developerup\
┃ ┃ ┗ 📂resources\
┃ ┃ ┃ ┣ 📂schemas\
┃ ┃ ┃ ┗ 📂scripts\