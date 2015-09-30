package com.bigriver.samples;

import java.util.Collection;

import com.bigriver.samples.dao.PessoaDAO;
import com.bigriver.samples.model.Pessoa;

/**
 * Classe para Testar Consultas ao BD
 * @author Rodney
 *
 */
public class TestarConsultas {
	public static void main(String[] args) {
		//Cria um objeto de acesso as pessoas no BD
		PessoaDAO pessoaDao = new PessoaDAO();
		
		//Busca todas as pessoas, e guarda em uma coleção
		Collection<Pessoa> todasPessoas = pessoaDao.todos();
		
		//Para cada pessoa da coleção ...
		for (Pessoa pessoa : todasPessoas) {
			//Mostrar o Nome e a Idade
			//%s -> para Strings, %d para numeros inteiros
			System.out.format("Nome %s, Idade %d", pessoa.getNome(), pessoa.getIdade());
		}
		
		//Testar consulta unica
		Pessoa pessoa = pessoaDao.buscar(1);
		//Se foi encontrado uma pessoa
		if (pessoa != null){
			//Mostrar o Nome e a Idade
			//%s -> para Strings, %d para numeros inteiros
			System.out.format("Nome %s, Idade %d", pessoa.getNome(), pessoa.getIdade());
		}else{
			System.out.println("Nenhuma pessoa encontrada com o ID - 1");
		}
		
	}
}
