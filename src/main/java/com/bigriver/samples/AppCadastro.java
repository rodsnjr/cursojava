package com.bigriver.samples;

import com.bigriver.samples.dao.PessoaDAO;
import com.bigriver.samples.model.Endereco;
import com.bigriver.samples.model.Pessoa;
import com.bigriver.samples.view.TelaCadastro;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Janela de Cadastro de Pessoas da Aplicação
 * @author Rodney
 *
 */
public class AppCadastro extends Application 
{
    public static void main( String[] args ){
    	//Inicializa a aplicação JavaFX
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
		TelaCadastro<Pessoa> cadastro = new TelaCadastro<>(pessoa, dao, endereco);
		
		//Cria a Scene (JavaFX) com a tela de Cadastro
		Scene scene = new Scene(cadastro);
		//Cria a Tela
		primaryStage.setScene(scene);
		//Mostra a Tela
		primaryStage.show();
		
		//Quando fechar a aplicação, garante que
		primaryStage.setOnCloseRequest(evt -> {
			//Fecha todas as conexões com a base de dados
			BancoDeDados.closeFactory();
		});
	}
}
