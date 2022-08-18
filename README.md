# AVALIAÇÃO DEVELOPER UP STEFANINI

## Índice
* [Resumo do Projeto] (#resumo)
* [Funcionalidades do projeto] (#funcionalidades-do-projeto)
* [Critérios de Aceitação] (#friterios-de-Aceitacao)
* [Cenários de Teste] (#fenarios-de-Teste)
* [Técnicas e tecnologias utilizadas] (#tecnicas-e-tecnologias-utilizadas)
* [Observações] (#observacoes)


## Resumo do Projeto
Criar uma lista de compras onde o produto deve persistir em uma listagem em tela.


## :hammer: Funcionalidades do projeto
- `1.`: Inclusão de produtos, deve conter:
- `1.1.`: Campo texto para inclusão do "Nome do Produto";
- `1.2.`: Botão para "Incluir Produto".

- `2.`: Llsta de produtos
- `2.1.`: Nome do Produto;
- `2.2.`: Botão para Excluir o Produto;

- `Funcionalidade 1` `Listar Produto`: Apresentar listagem dos Itens inclusos. 
- `Funcionalidade 2` `Incluir Produto`: Incluir produtos em uma lista.
- `Funcionalidade 3` `Excluir Produto`: Exclui o produto da lista. Ao clicar em "Excluir produto" o produto é excluido da lista e a tela é atualizada em tempo de execução.

- `Funcionalidade BONUS` `Editar produto`: Ao clicar em "Editar produto" o produto da lista fica disponível para edição como o campo texto "Nome do produto" onde o valor "Nome do produto" pode ser atualizado.
- `Funcionalidade BONUS` `Cancelar Alteração`: Ao clicar em "Cancelar Alterações" a alteração é cancelada, o "Nome do produto" retorna para o valor original e a tela é atualizada em tempo de execução.


## Critérios de Aceitação
- Seguir o padrão e estrutura do projeto, respeitando a finalidade dos componentes (front-end e back-end)
- Todas as funções, métodos, variáveis e etc devem estar designadas com seus respectivos "tipos"
- Se for formatar, utilizar CSS ou SASS para formatação dos elementos;
- Ao programar não se esqueça de deixar o seu código limpo, separe as responsabilidades em funções;
- Não se esqueça: O código pronto (front-end e back-end) deve ser compilado, apto para ser clonado e executado para avaliação;
- Realize os commits separadamente conforme o desenvolvimento de cada funcionaloidade.
- Fique avontade para utilizar bibliotecas (externas) de componentes Angular

- Bonus: O botão "Editar Produto" fica habilitado para os itens da lista que não estiverem concluídos;
- Bonus: Código com cobertura de teste funcionando será avaliado com muito mais satisfação :)


## Critérios tecnicos
- CSS - Nos ajude a reduzir a duplicidade de código, crie um arquivo .css para todas as funções duplicas que podem ser aplicadas para todo o site;
- HTML - Implemente utilizando as melhores práticas;
- JavaScript - não se esqueça de fazer a tipagem em todas as funções, métodos, variáveis;
- Jasnime - Faça pelo menos o teste de instancia para cada componente.


## :construction: Cenários de Teste
Font-end
- `1`: O projeto deve executar após o build (os testes e o lint devem ser executado com sucesso também);
- `2`: Todos os campos exigidos devem ser apresentados em tela;
- `3`: Botão incluir habilitando ao digitar o nome do Produto;
- `4`: Ao incluir, o Produto deve ser adicionado à lista e apresentado em tela atualizada em tempo de execução;
- `5`: Ao excluir, o Produto deve ser excluido da lista em tela atualizada em tempo de execução;
- `6`: A lista deve conter os botões corretos;
- `7`: Cada produto da lista deve ser visualmente diferente conforme a sua situação (o formato ficará ao seu critério)
- `BONUS`: Ao Editar, o Produto "nome do Produto" deve ser habilitado na lista e apresentado os botões corretos para a funcionalidade;
- `BONUS`: Ao salvar a Edição, o nome do Produto deve ter o seu valor atualizado;
- `BONUS`: Ao cancelar a Edição, o nome do Produto deve retornar ao valor original;

Back-end
- `1`: O projeto deve executar após o build;
- `2`: O Serviço para Incluir produto deve ser implementada;
- `5`: O Serviço para Excluir produto deve ser implementada.
- `BONUS`: O Serviço para Editar produto deve ser implementada;


## ✔️ Técnicas e tecnologias utilizadas
- ``Git``
- ``CLI``
- ``HTML``
- ``CSS``
- ``Bootstrap``
- ``JavaScript``
- ``Angular``
- ``NPM``
- ``Jasmine``
- ``TypeScript``
- ``Java``
- ``Spring Boot``
- ``Quarkus``
- ``JUnit``
- ``Mokito``
- ``Maven``

1) Testes:
   1.1) Para garantir a qualidade do código é necessário fazer teste de unidade no frontend e de integração no backend a fim de atingir o máximo de cobertura possível do código novo e 40% do código legado;

2) Bugs
   2-1) Existem alguns bugs no código ou fluxo como por exemplo Listar produto, que está fixo no frontend, sendo que a mesma deverá vir do backend.
   2-2) Código Comentado
      O último DEV não deixou claro o que ele deixou comentado, mas é sempre bom ver o que ele tentou fazer.


# Observações
- `1`: O Projeto deve ser entregue até o dia 17/08/2022 às 23h59 via GIT
- `2`: A sua conta GIT será enviada pelo e-mail (<maratona@stefanini.com>) contendo login e senha para que possa enviar o projeto.
- `3`: Não se preocupe em não entregar o projeto todo, mesmo que não termine tudo, envie o projeto 😊
- `4`: Ficou com dúvida? Mande um e-mail para <maratona@stefanini.com>