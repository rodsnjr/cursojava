#Projeto da URI#

#

 Projeto Exemplo #
O projeto pode ser utilizado como base para a construção de uma aplicação de cadastro e consultas simples.
A aplicação utiliza as seguintes tecnologias:

	1. Java 8 e JPA
	2. Hibernate e Entity Manager
	3. JavaFX
	4. FXForm2
	
# Organização do Projeto #
Os códigos fontes estão na pasta (src/main/java).
Seguindo os padrões do [Maven](https://pt.wikipedia.org/wiki/Apache_Maven), o pacote base do projeto ficará com o nome "entidade.organização.projeto", nesse caso "com.bigriver.samples".

Dentro do pacote principal, temos os pacotes:
	
	1. dao (classes responsáveis por comunicar-se com o banco de dados)
	2. listener (classes responsáveis pelo tratamento dos eventos que ocorrem)
	3. model (classes responsáveis por mapear os dados)
	4. view (classes responsáveis pelo desenho das telas da aplicação)
	5. samples (pacote principal, classes responsáveis por iniciar a aplicação)
	
Seguindo o mesmo padrão os códigos de testes estarão agrupados na pasta (src/test/java), e os recursos do projeto na pasta (src/main/resources).

Os códigos fontes de testes demonstram a utilização crua das classes da aplicação, e testam a sua funcionalidade. 
E estão agrupados por funcionalidades

O recurso principal para a utilização do Hibernate é o arquivo de persistência (persistence.xml), ele dita quais conexões serão feitas aos bancos de dados do projeto. No caso deste projeto só há uma conexão ao banco de dados MySQL local.

```xml

	<!-- Dita o Driver para o BD MySQL -->
	<property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver" />
	
	<!-- Abre uma conexão local ao MySQL -->
	<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/samples" />
	<property name="javax.persistence.jdbc.user" value="root" />
	<property name="javax.persistence.jdbc.password" value="root" />
            
```

# JavaDoc #
O [JavaDoc](https://pt.wikipedia.org/wiki/Javadoc) está na pasta (JavaDoc) do projeto.
Ele contém as informações referentes a todas as classes e métodos do projeto.
Deve ser usado como referência para futuras implementações, e manuntenção dos projetos Java.

# Utilização das Classes #

[Acessos ao Banco de Dados](https://github.com/rodsnjr/cursojava/tree/master/src/main/java/com/bigriver/samples/dao)

[Mapeamento do Banco de Dados](https://github.com/rodsnjr/cursojava/tree/master/src/main/java/com/bigriver/samples/model)

[Eventos Do Banco de Dados](https://github.com/rodsnjr/cursojava/tree/master/src/main/java/com/bigriver/samples/listener)

[Telas De Cadastro e Consulta](https://github.com/rodsnjr/cursojava/tree/master/src/main/java/com/bigriver/samples/view)

# Testando o Projeto #
Para testar utilizar as telas, rodar as classes *AppCadastro* ou *AppConsulta*.
