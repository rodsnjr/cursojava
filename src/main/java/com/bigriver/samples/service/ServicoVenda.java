package com.bigriver.samples.service;

import java.util.Collection;

import com.bigriver.samples.model.Pessoa;

/**
 * Interface de Serviços Providos pelo Sistema.
 * Organizar conforme a necessidade.
 * @author Rodney
 *
 * @param <T>
 */
public interface ServicoVenda<T> {
	/**
	 * Busca todos os produtos não vendidos
	 * @return Uma coleção com todos os produtos que ainda não foram vendidos, ou esgotados do estoque.
	 */
	Collection<T> todosNaoVendidos();
	/**
	 * Realiza a venda de um Produto para um determinado Cliente
	 * @param produto O produto a ser comercializado
	 * @param cliente O cliente que irá comprar o produto
	 */
	void vender(T produto, Pessoa cliente);
}
