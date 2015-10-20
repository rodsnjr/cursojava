# Model #
Pacote de Dados - Model

Nomeado a partir da convenção do [MVC](https://pt.wikipedia.org/wiki/MVC)
 
Este pacote contém as classes que são referentes as entidades/tabelas do Banco de Dados,
essas classes seguem o padrão de get/set para cada atributo(coluna) do BD.
Como convenção elas estarão anotadas como *Entity*.

Define uma classe com os dados utilizando o padrão [BEAN do Java](https://pt.wikipedia.org/wiki/JavaBeans) que irá mapear uma tabela do Banco de Dados.

Exemplo: 

```java
	
	@Entity
	public class Cachorro {
		//Atributos privados, 
		//seguindo regras de encapsulamento
		private String raca;
		private int idade;
		
		public String getRaca(){
			return raca;
		}
		
		public void setRaca(String racaNova){
			this.raca = racaNova;
		}
		
		public int getIdade(){
			return idade;
		}
		
		public void setIdade(int idadeNova){
			this.idade = idadeNova;
		}
	}

```
