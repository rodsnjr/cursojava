package com.bigriver.samples;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe que Controla as Aberturas de conexão com o BD
 * @author Rodney
 *
 */
public class BancoDeDados {
	
	/** Construtor de Entity Managers único **/
	private static EntityManagerFactory construtorEntityManagers;
	
	static {
		construtorEntityManagers = Persistence.createEntityManagerFactory("samples");
	}
	/**
	 * Cria um Entity Manager
	 * @return Um gerente de Entidades
	 */
	public static final EntityManager abreEntityManager(){
		return construtorEntityManagers.createEntityManager();
	}
	
	/**
	 * Fecha a Factory, e as conexões com o BD
	 */
	public static final void closeFactory() {
		//construtorEntityManagers.close();
		System.exit(0);
	}
	
}
