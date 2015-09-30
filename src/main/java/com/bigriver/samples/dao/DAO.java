package com.bigriver.samples.dao;

import java.util.Collection;

/**
 * Interface de Exemplo com um simples conjunto de funções base
 * Qualquer classe DAO pode implementar tais funções
 * @author Rodney
 *
 * @param <T> Entidade / Model / que mapeia a Tabela do Banco de Dados
 */
public interface DAO<T> {
	/**
	 * Salva um determinado Objeto no BD
	 * @param objeto O Objeto a ser Salvo
	 * @return O Objeto depois de ser Salvo
	 */
	T salvar(T objeto);
	/**
	 * Busca um determinado objeto no BD
	 * @param id O identificador do Objeto
	 * @return O Objeto, ou NULL caso este não tenha sido encontrado
	 */
	T buscar(int id);
	/**
	 * Busca todas as ocorrências da Tabela no BD
	 * @return Uma coleção com todas as ocorrências do Banco de Dados
	 */
	Collection<T> todos();

}
