package com.bigriver.samples.view;

import java.util.List;

import com.bigriver.samples.model.Pessoa;

public interface Vendas<T> {
	List<T> todosNaoVendidos();
	void vender(T produto, Pessoa cliente);
}
