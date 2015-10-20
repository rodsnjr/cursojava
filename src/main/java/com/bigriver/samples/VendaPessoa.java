package com.bigriver.samples;

import java.util.Collection;

import com.bigriver.samples.dao.PessoaDAO;
import com.bigriver.samples.model.Pessoa;
import com.bigriver.samples.view.Vendas;

public class VendaPessoa implements Vendas<Pessoa> {
	
	private PessoaDAO dao;

	public VendaPessoa() {
		this.dao = new PessoaDAO();
	}
	
	@Override
	public Collection<Pessoa> todosNaoVendidos() {
		return dao.todos();
	}

	@Override
	public void vender(Pessoa produto, Pessoa cliente) {
		System.out.format("Vendeu a pessoa %s, para %s", produto, cliente);
	}

}
