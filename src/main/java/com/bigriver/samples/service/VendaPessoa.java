package com.bigriver.samples.service;

import java.util.Collection;

import com.bigriver.samples.dao.PessoaDAO;
import com.bigriver.samples.model.Pessoa;

/**
 * Classe de Exemplo para a criação de vendas de produtos
 * @author Rodney
 *
 */
public class VendaPessoa implements Vendas<Pessoa> {
	
	//Um atributo primário para busca de pessoas
	private PessoaDAO dao;

	public VendaPessoa() {
		this.dao = new PessoaDAO();
	}
	
	@Override
	public Collection<Pessoa> todosNaoVendidos() {
		//Consultar todas as pessoas do banco de dados.
		//Alterar para uma busca de produtos/itens não vendidos.
		return dao.todos();
	}

	@Override
	public void vender(Pessoa produto, Pessoa cliente) {
		//Implementar uma lógica para a venda de um produto
		System.out.format("Vendeu a pessoa %s, para %s", produto, cliente);
	}

}
