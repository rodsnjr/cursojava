package com.bigriver.samples;

import com.bigriver.samples.dao.PessoaDAO;
import com.bigriver.samples.model.Endereco;
import com.bigriver.samples.model.Pessoa;
import com.bigriver.samples.view.TelaCadastro;
import com.bigriver.samples.view.TelaConsulta;
import com.bigriver.samples.view.TelaDashboard;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DashBoard extends Application {
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Carrega um objeto Pessoa e Endereço
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		pessoa.setEndereco(endereco);
		//Carrega um DAO de Pessoas
		PessoaDAO dao = new PessoaDAO();
		//Cria uma tela de cadastro de Pessoas
		TelaCadastro<Pessoa> cadastro = new TelaCadastro<>("Cadastro Pessoa", pessoa, dao, endereco);
	
		//Cria um DAO para as Pessoas
		PessoaDAO pessoaDao = new PessoaDAO();
		//Cria uma Tela de Consulta de Pessoas
		TelaConsulta<Pessoa> consulta = new TelaConsulta<>("Pessoas", pessoaDao);
		
		TelaDashboard telaDashboard = new TelaDashboard(consulta, cadastro);
		
		//Cria uma Scene (JavaFX) com a tela de consulta
		Scene scene = new Scene(telaDashboard);
		
		//Cria uma Janela de Consulta
		primaryStage.setScene(scene);
		//Abre a Janela
		primaryStage.show();
		//Quando fechar a aplicação, garante que
		primaryStage.setOnCloseRequest(evt -> {
			//Fecha todas as conexões com a base de dados
			BancoDeDados.closeFactory();
		});
	}

}
