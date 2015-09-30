# DAO - Data Access Object #
Objeto de acesso a dados (ou simplesmente DAO, acrônimo de Data Access Object), 
é um padrão para persistência de dados que permite separar regras de negócio das 
regras de acesso a banco de dados. Numa aplicação que utilize a arquitetura MVC, 
todas as funcionalidades de bancos de dados, tais como obter as conexões, 
mapear objetos Java para tipos de dados SQL ou executar comandos SQL, 
devem ser feitas por classes DAO.

https://pt.wikipedia.org/wiki/Objeto_de_acesso_a_dados

## Pacote ##

O pacote contém uma interface genérica *DAO* que contém os métodos principais de quaisquer
classe DAO do sistema. 
As demais classes implementam esses métodos permitindo controle das tabelas do 
banco de dados. Por exemplo, PessoaDAO que deverá controlar a tabela *pessoas*.