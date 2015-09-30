package com.bigriver.samples.dao;

import java.util.Collection;

import javax.persistence.EntityManager;

import com.bigriver.samples.BancoDeDados;
import com.bigriver.samples.model.Pessoa;

/**
 * DAO com operações básicas ao BD relacionadas a tabela PESSOA
 * @author Rodney
 *
 */
public class PessoaDAO implements DAO<Pessoa> {
	
	/**
	 * Salvar uma ocorrência de Pessoa no Banco de Dados
	 * @param objeto A ocorrência que deverá ser salva
	 * @return A pessoa que foi salva
	 */
	@Override
	public Pessoa salvar(Pessoa objeto) {
		//Abre um gerente de entidades
		EntityManager gerenteEntidades = BancoDeDados.abreEntityManager();
		//Abre uma transação com o BD
		gerenteEntidades.getTransaction().begin();
		//Guarda o Objeto no BD
		gerenteEntidades.persist(objeto);
		//Conclui a transação com o BD, garantindo a execução da operação
		gerenteEntidades.getTransaction().commit();
		//Fecha o Gerente de Entidades, concluindo o ciclo de vida de operações
		gerenteEntidades.close();
		
		return objeto;
	}
	/**
	 * Buscar uma ocorrência de Pessoa no Banco de Dados
	 * @param id O identificador único da Pessoa que deverá ser buscada
	 * @return A pessoa encontrada
	 */
	@Override
	public Pessoa buscar(int id) {
		//Abre um gerente de entidades
		EntityManager gerenteEntidades = BancoDeDados.abreEntityManager();
		//Abre uma transação com o BD
		gerenteEntidades.getTransaction().begin();		
		//Busca uma pessoa no BD pelo ID - X
		Pessoa busca = gerenteEntidades.find(Pessoa.class, id);
		//Conclui a transação com o BD, garantindo a execução da operação
		gerenteEntidades.getTransaction().commit();

		gerenteEntidades.close();
		
		return busca;
	}
	/**
	 * Coletar todas as ocorrências de Pessoas do Banco de Dados
	 * @return Uma coleção com todas as ocorrências de Pessoa
	 */
	@Override
	public Collection<Pessoa> todos() {
		
		EntityManager gerenteEntidades = BancoDeDados.abreEntityManager();
		gerenteEntidades.getTransaction().begin();
		//Cria uma QUERY que buscará TODAS as Pessoas no BD
		@SuppressWarnings("unchecked")
		Collection<Pessoa> todos = gerenteEntidades.createQuery("from Pessoa")
				.getResultList();
		//Garante a conclusão da operação
		gerenteEntidades.getTransaction().commit();
		gerenteEntidades.close();
		
		return todos;
	}
	
}
