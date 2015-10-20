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
public interface Vendas<T> {
	Collection<T> todosNaoVendidos();
	void vender(T produto, Pessoa cliente);
}
