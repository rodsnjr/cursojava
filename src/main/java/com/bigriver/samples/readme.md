# Visão Geral #
O projeto está organizado seguindo padrões de nomenclatura já definidos 
pela comunidade de desenvolvedores e arquitetos em geral.
Essa arquitetura consiste em dividir a aplicações em multi camadas de propósitos únicos, e bem divididos.

São eles:
	* DAO - Camada de objetos responsáveis por controlar os acessos as bases de dados.
	* Model - Camada de mapeamento de objetos, dentro do padrão MVC, consiste nos objetos de dados.
	* Service - Camada de serviço, que contém as regras de negócio da aplicação.
	* View - Camada de front-end que contém as telas da aplicação.
	
Por propósitos de abstração e encapsulamento a camada de "controllers" está inclusa nas classes *view*.

# Pacotes #
As classes de dados vão ser organizadas no pacote *model*, as classes de gerenciamento de dados 
vão estar no pacote *dao*, já o pacote *listener* contem as classes que irão "escutar" os eventos, 
do JPA e tomar ações conforme estes.

O pacote *service* contém os serviços fornecidos pelo sistema, nesse caso o serviço principal é o de vendas.
A venda é definida na interface *vendas* e esta *não deve ser alterada*. 
A implementação desta classe é dada no exemplo: VendaPessoa.
 
Por fim os pacote *view* irá conter as classes de telas, estas classes são a base para 
a interação com o sistema, e por fins de padronização não deverão ser alteradas.

# Classes Principais #
As classes principais do projeto estão separadas neste pacote.
São elas:
	1. BancoDeDados - Responsável por *Abrir a Conexão ao BD*
	2. AppCadastro - Abertura de uma tela de cadastro, utilizada como *exemplo*
	3. AppConsulta - Abertura de uma tela de consulta, utilizada como *exemplo*
	4. DashBoard - Tela principal com a Dashboard do sistema.
