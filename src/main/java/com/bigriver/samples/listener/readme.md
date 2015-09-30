# Entity Listeners #
Esse pacote contém classes que deverão controlar a ocorrência de determinados eventos com as
entidades do sistema.
 
https://docs.jboss.org/hibernate/entitymanager/3.5/reference/en/html/listeners.html

Controle dos Eventos com as Entidades do BD.

Os eventos podem ser:

* PrePersist, antes de persistir alguma entidade 
* PostPersist, após persistir alguma entidade
* PreRemove, antes remover alguma entidade
* PostRemove, após remover alguma entidade
* PreUpdate, antes atualizar alguma entidade
* PostUpdate, após atualizar alguma entidade
* PostLoad, após carregar alguma entidade

Utilizando um EntityListener:

```java
	
	//Define uma Entidade
	@Entity
	//Define que a classe PessoaListener irá gerenciar os eventos de Entidades
	@EntityListener(PessoaListener.class)
	public class Pessoa {
		//Métodos e Atributos ...
	}

```

Implementando um EntityListener

```java

	public class EnderecoListener {
		//Define um evento para Antes de Atualizar o Objeto
		@PostUpdate
		public void antesAtualizar(Endereco endereco){
			//Checa se o Estado é o Rio Grande do Sul
			if (endereco.getEstado().equals(Estado.RS)){
				//Printa uma Mensagem!
				System.out.println("Tchê bagual!!!");
			}
		}
	}
	
```