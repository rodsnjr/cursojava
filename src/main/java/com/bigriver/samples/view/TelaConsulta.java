package com.bigriver.samples.view;

import com.bigriver.samples.dao.DAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
/**
 * Tela de Consulta Básica
 * Declaração e Uso:
 * (Criar uma tela de Consulta de Pessoas)
 * TelaConsulta consulta = new TelaConsulta("Pessoas", pessoaDao);
 * @author Rodney
 *
 * @param <T> Entidade / Model / que mapeia a Tabela do Banco de Dados
 */
public class TelaConsulta<T> extends VBox {
	
	private DAO<T> dao;
	
	private ListView<T> listaItens;
	
	private Label labelTitulo;
	
	private Button buttonMostrar;
	
	public TelaConsulta(String titulo, DAO<T> dao){
		super();
		this.dao = dao;
		this.labelTitulo = new Label(titulo);
		this.listaItens = new ListView<>();
		this.buttonMostrar = new Button("Mostrar");
		
		buttonMostrar.setOnAction(evt -> {
			ObservableList<T> listaTodos = FXCollections.observableArrayList(this.dao.todos());
			listaItens.setItems(listaTodos);
		});
		
		this.getChildren().addAll(labelTitulo, buttonMostrar, listaItens);
		
	}
	
}