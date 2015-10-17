package com.bigriver.samples.view;

import com.bigriver.samples.dao.PessoaDAO;
import com.bigriver.samples.model.Pessoa;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TelaVendas<T> extends GridPane{
	
	private Vendas<?> vendas;
	
	private PessoaDAO pessoaDAO;
		
	private ListView<T> listViewProduto;
	
	private ListView<Pessoa> listViewPessoas;
	
	public TelaVendas(Vendas<T> vendas){
		pessoaDAO = new PessoaDAO();
		
		getColumnConstraints().add(new ColumnConstraints());
		getColumnConstraints().add(new ColumnConstraints());
		getColumnConstraints().add(new ColumnConstraints());
		
		getColumnConstraints().get(1).setMaxWidth(50);
		
		getRowConstraints().add(new RowConstraints());
		getRowConstraints().add(new RowConstraints());
		getRowConstraints().get(1).setPrefHeight(50);
		
		listViewPessoas = new ListView<>();
		listViewProduto = new ListView<>();
		
	}
	
	@SuppressWarnings("unchecked")
	private void fillData(){
		listViewPessoas.setItems(FXCollections.observableArrayList(pessoaDAO.todos()));
		
		listViewProduto.setItems((ObservableList<T>) FXCollections
				.observableArrayList(vendas.todosNaoVendidos()));
	}
	
	private void fillPane(){
		add(listViewPessoas, 2, 0);
		add(listViewProduto, 0, 0);
		
		add(new Label("Para ->"), 1, 0);
		
		Button buttonVender = new Button();
		buttonVender.getStyleClass().add("ButtonVender");
		
		add(buttonVender, 2, 1);
	}
	
}
