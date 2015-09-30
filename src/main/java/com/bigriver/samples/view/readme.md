# Pacote de Telas - View #
Contém as classes responsáveis por montar as telas de *cadastro, e *consulta da aplicação.

As telas foram criadas utilizando a API do JavaFX.

Exemplo de utilização:

```java

		//Carrega um objeto Pessoa e Endereço
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		pessoa.setEndereco(endereco);
		//Carrega um DAO de Pessoas
		PessoaDAO dao = new PessoaDAO();
		//Cria uma tela de cadastro de Pessoas
		TelaCadastro<Pessoa> cadastro = new TelaCadastro<>(pessoa, dao, endereco);
		
```

Atrelando a classe em uma Tela

```java

			//Cria a Scene (JavaFX) com a tela de Cadastro
			Scene scene = new Scene(cadastro);
			//Cria a Tela
			primaryStage.setScene(scene);
			//Mostra a Tela
			primaryStage.show();

```

(JavaFX)
https://docs.oracle.com/javafx/2/get_started/hello_world.htm