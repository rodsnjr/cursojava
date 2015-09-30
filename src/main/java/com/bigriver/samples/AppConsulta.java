package com.bigriver.samples;

import com.bigriver.samples.dao.PessoaDAO;
import com.bigriver.samples.model.Pessoa;
import com.bigriver.samples.view.TelaConsulta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Janela de Consulta de Pessoas da Aplicação
 * @author Rodney
 *
 */
public class AppConsulta extends Application {
	
	public static void main(String[] args) {
		//Inicializa a aplicação JavaFX
		launch();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Cria um DAO para as Pessoas
		PessoaDAO pessoaDao = new PessoaDAO();
		//Cria uma Tela de Consulta de Pessoas
		TelaConsulta<Pessoa> consulta = new TelaConsulta<>("Pessoas", pessoaDao);
		//Cria uma Scene (JavaFX) com a tela de consulta
		Scene scene = new Scene(consulta);
		
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
