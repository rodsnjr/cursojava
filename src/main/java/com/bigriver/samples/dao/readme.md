# DAO - Data Access Object #
Objeto de acesso a dados (ou simplesmente DAO, acrônimo de Data Access Object), 
é um padrão para persistência de dados que permite separar regras de negócio das 
regras de acesso a banco de dados. Numa aplicação que utilize a arquitetura MVC, 
todas as funcionalidades de bancos de dados, tais como obter as conexões, 
mapear objetos Java para tipos de dados SQL ou executar comandos SQL, 
devem ser feitas por classes DAO.

[Referência](https://pt.wikipedia.org/wiki/Objeto_de_acesso_a_dados)

## Pacote ##

O pacote contém uma interface genérica *DAO* que contém os métodos principais de quaisquer
classe DAO do sistema. 
As demais classes implementam esses métodos permitindo controle das tabelas do 
banco de dados. Por exemplo, PessoaDAO que deverá controlar a tabela *pessoas*.

# Utilização de um DAO #
A partir da interface DAO, implementa-se uma classe com todas as funcionalidades de acesso ao banco de dados.

```java
	
	//Classe para acesso a Endereços do BD
	public class EnderecoDAO implements DAO<Endereco> {
		
		//Consultar ...
		@Override
		public Endereco buscar(int id) {
		
			//Abre um gerente de entidades
			EntityManager gerenteEntidades = BancoDeDados.abreEntityManager();
			//Abre uma transação com o BD
			gerenteEntidades.getTransaction().begin();		
			//Busca um endereco no BD pelo ID - X
			Endereco busca = gerenteEntidades.find(Endereco.class, id);
			//Conclui a transação com o BD, garantindo a execução da operação
			gerenteEntidades.getTransaction().commit();
	
			gerenteEntidades.close();
			
			return busca;
		}
		
		
		//Demais Métodos ...
		
	}

```

A classe BancoDeDados nos prepara os [EntityManager](http://docs.oracle.com/javaee/7/api/javax/persistence/EntityManager.html)
para acesso as entidades no BD. Então podemos utilizar os métodos deste objeto para consulta, persistência e etc.