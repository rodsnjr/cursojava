package com.bigriver.samples.view;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

public class TelaDashboard extends GridPane {

	private ToolBar toolBarNav;
	
	private ScrollPane scrollPane;
	
	/**
	 * Cria uma dashboard para o sistema
	 * @param telas As telas que irão compor o sistema, ex: consultaPessoas, consultaProdutos, ...
	 */
	public TelaDashboard(Parent... telas) {
		super();
		
		toolBarNav = new ToolBar();
		
		scrollPane = new ScrollPane(telas[0]);
		
		scrollPane.setFitToWidth(true);
		
		for (Parent parent : telas) {
			toolBarNav.getItems().add(new ButtonNav(parent));
		}
		
		add(toolBarNav, 0, 0);
		add(scrollPane, 0, 1);
		getRowConstraints().add(new RowConstraints());
		getRowConstraints().get(0).setVgrow(Priority.NEVER);
		
		getColumnConstraints().add(new ColumnConstraints());
		
		for (ColumnConstraints constraints : getColumnConstraints()) {
			constraints.setFillWidth(true);
			constraints.setHgrow(Priority.ALWAYS);
		}
		
		getStyleClass().add("root");
		
		scrollPane.getStyleClass().add("root");
		
		toolBarNav.getStyleClass().add("DashBoardNav");

		getStylesheets().add(getClass().getClassLoader().getResource("style.css").toString());
		
		
		
	}
	
	private void changeTela(Parent tela){
		scrollPane.setContent(tela);
	}
	
	private class ButtonNav extends Button{
		ButtonNav(Parent tela) {
			super();
			getStyleClass().add("ButtonNav");
			
			if (tela instanceof TelaCadastro<?>){
				setText(((TelaCadastro<?>) tela).getTitulo());
			}else if (tela instanceof TelaConsulta<?>){
				setText(((TelaConsulta<?>) tela).getTitulo());
			}else
				setText(tela.getId());
			setOnAction(evt -> changeTela(tela));
		}
	}
	
}
