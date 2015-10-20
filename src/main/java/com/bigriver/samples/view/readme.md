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

Tela de Consulta

```java

		//Cria um DAO para as Pessoas
		PessoaDAO pessoaDao = new PessoaDAO();
		//Cria uma Tela de Consulta de Pessoas
		TelaConsulta<Pessoa> consulta = new TelaConsulta<>("Pessoas", pessoaDao);
		//Cria uma Scene (JavaFX) com a tela de consulta
		
```

Tela de Vendas

Para a tela de Vendas é necessária uma implementação da interface *Vendas*.

Implementando uma classe de Vendas ...

```java
	
	/**
	* Classe para Venda de Produtos
	**/
	public class VendasProdutos implements GerenteVenda<Produto> {
		private ProdutosDao produtosDao = new ProdutosDao();
		
		public Collection<Produto> todosNaoVendidos(){
			return produtosDao.findTodosNaoVendidos();
		}
		
		public void vender(Produto produto, Pessoa cliente){
			produto.setCliente(cliente);
			produtosDao.salvar(produto);
		}
	}

```

Criando uma tela de Vendas

```java
	
	//Criando uma tela para venda de produtos a partir da implementação de
	//VendasProdutos!
	TelaVendas telaVendasProdutos = new TelaVendas("Venda de Produtos", new VendasProdutos());

```

Tela de DashBoard

```java

		//Cria uma tela de DashBoard com as telas de Consulta e Cadastro de Pessoas
		TelaDashboard telaDashboard = new TelaDashboard(consulta, cadastro, telaVendasProdutos);
		
```

[JavaFX](https://docs.oracle.com/javafx/2/get_started/hello_world.htm)
