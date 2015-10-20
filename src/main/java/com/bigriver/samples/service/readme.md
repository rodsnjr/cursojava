# Pacote de Serviços - Service #
A camada de *Serviços* irá conter os serviços do Sistema.

O serviço base para as vendas é ServicoVenda. É uma interface que provê dois métodos, a busca pelos produtos não vendidos, e a venda de um produto.

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

A informação do atributo em <Atributo> é feita através de [Generics](http://www.devmedia.com.br/usando-generics-em-java/28981) em Java.