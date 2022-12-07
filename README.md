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
