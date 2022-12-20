# jpa-estudo
Passo-a-Passo curso de JPA:

1º Entender diferenças entre JDBC, JPA e HIBERNATE.

2º Criar um projeto JPA através do Maven Project.

3º Configurar o arquivos "persistence.xml" com as tags da JPA e do Hibernate.

4º Configurar o arquivo "pom.xml" com as dependencias do banco de dados e do Hibernate.

5º Criar uma entidade e mapear.

6º Persistir uma entidade no banco de dados, usando a dao e jpautil

7º Mapear a entidade com um enum.

8º Alterar a classe de enum para classe normal e testar o relacionamento através da JPA.

9º Criar a dao para essa nova classe.

10º Entender os estados de insert da entidade. (criar método de cadastro na dao)

11º Entender os estados de update da entidade. (criar método de update na dao) (obs: remove apenas do estado da entidade, e não do banco)

12º Entender os estados no delete da entidade. (criar método de delete na dao) (obs: remove apenas do estado atual da entidade, e não do banco)

13º Criar métodos na classe dao para buscar por ID e buscar por todos

14º Fazer um método usando jpql para buscar por nome.

15º Fazer um método usando jpql para buscar por nome da categoria testando o join.

16º Fazer um método usando jpql para buscar um único resultado pelo nome.

Métodos que devem ter na DAO para estudo

salvar

atualizar

remover

buscarPorId

buscarTodos

buscarPorNome (faz a busca recebendo um parametro e retorna a lsita de resultados)

buscarPorNomeDaCategoria (usa o join e retorna uma lista de resultados)

buscarEnderecoPeloNome (retorna um unico resultado)

Criar as duas novas entidade pedido e cliente
Mapear essas entidades
Mapear o novo relaciomaneto delas
Prestar atenção no mapeamento bidirecional e nas novas anotações
Criar novo teste para ser feito

Criar um método para fazer consultas com função de agregação
-criar método de buscar a soma dentro da classe Dao
-dentro da main, usar a dao para chamar esse metodo
-como se trata de um relacionamento de muitos pra muitos, é importante incrementar o valor total sempre qe for utilizado.

Fazer uma query para retornar um relatório de vendas
-criar o método dentro da dao com a query
-a principio retornar utilizando o array de object
-alterar o tipo de object para uma classe "Vo"
-fazer o select new para chamar a classe Vo (lembrar de passar o FQN)
-aprender o que é uma named query (query juntamente com a entidade), não achei boa prática, importante saber mas não precisa estudar

Aprender os conceitos de eager e lazy
-Todo relaciomento "ToOne" gera um join, que pode ser desnecessário, por isso é uma boa pratica adicionar o fecth = to lazy, para evitar problema de
performance.

Fazer anotações das desvantagens e uma alternativa para o uso do lazy
-Ao utilizar as anotações "ToOne" como lazy, pode dar problema caso a entity manager seja fechada, por esse motivo seria necessario fazer o join
manualmente dentro da string jpql de busca no banco.

-Api criteria
uma das utilizades da api criteria é que ela pode fazer a montagem dinamica das querys, e reconhecer quando um parametro é nulo ou nao, e atribuir isso
na query de forma automatica

-Com as anotações embeddable e embedded é possível generalizar atributos de uma entidade em uma classe separada, caso o código original quebre
por conta dos gets, é possível também usar o método delegate, chamando o get através dessa outra classe que é embeddable.

Caso de herança
-Caso tenhamos uma herança no japa, podemos mapear com a ajuda da anotação "@inheritance", que deve ser colocada na classe mae. Dentro da anotação
deve ser definido uma "strategy". As duas principais são "single_table" que é definido uma tabela grande com todos os atributos da classe mae e das
subclasses, ou a estratégia "joined" que separa uma tabela separada pra classe mae, e outras tabelas separadas para cada subclasse que tiver.

Caso de chave composto
-Caso tenhamos uma chave composta, criamos uma nova classe e criamos as duas chaves nessa classe, como atributo, na classe original, criamos um
atributo com o nome da nova classe e passamos a anotação @EmbeddedId, e na nova classe passamos a anotação @Embeddable. E para fazermos a consulta 
com o find, como teremos uma chave composta, não é possível passar apenas uma chave primary key, como de costume, é necessário instanciar o construtor
da nova classe que possui a chave composta e passar o valores nesse construtor.

obs: bom usar a interfaze serializable nas classes que possuem a anotação @Embeddable, para evitar problemas.
