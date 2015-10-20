package com.bigriver.samples.view;

import java.util.Collection;

import com.bigriver.samples.model.Pessoa;

public interface Vendas<T> {
	Collection<T> todosNaoVendidos();
	void vender(T produto, Pessoa cliente);
}
