package com.bigriver.samples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.dooapp.fxform.annotation.NonVisual;

/**
 * Classe da tabela Endereço do Banco de Dados
 * @author Rodney
 *
 */
@Entity
public class Endereco {
	/**
	 * Enumeração para determinar os Estados Disponíveis
	 * @author Rodney
	 *
	 */
	public enum Estado {
		RS,
		SC,
		PR;
	}
	//Não exibir em formulários
	@NonVisual
	private int id;
	
	private String rua;
	private String cidade;
	private Estado estado;
	private int numero;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return rua + " " + estado;
	}
	
	
}
