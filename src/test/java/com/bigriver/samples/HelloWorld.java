package com.bigriver.samples;

import java.io.PrintStream;

/**
 * Classe Simples de Olá Mundo!
 * @author Rodney
 *
 */
public class HelloWorld {
	
	public static void main(String[] args) {
		//Mostra no Console, Hello World!
		System.out.println("Hello World!");
		
		//Desmantelando
		//pega o objeo de Saida do Console do Sistema
		PrintStream saidaConsole = System.out;
		
		//Cria uma variável de Olá
		String hello = "Olá Mundo!";
		
		//Chama o método de print nova linha do console!
		saidaConsole.println(hello);
	}
	
}
