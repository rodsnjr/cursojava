package com.bigriver.samples.listener;

import java.time.Instant;
import java.util.Date;

import javax.persistence.PrePersist;

import com.bigriver.samples.model.Pessoa;

/**
 * Classe que escutará os eventos dos objetos Pessoa
 * @author Rodney
 *
 */
public class PessoaListener {
	
	/**
	 * Antes de Salvar uma Pessoa, garantir que a "timestamps" tenha a data / hora atual.
	 * @param pessoa Pessoa que está sendo salva
	 */
	@PrePersist
	public void salvandoPessoa(Pessoa pessoa){
		//Atualiza Timestamps para o momento atual
		pessoa.setTimestamps(Date.from(Instant.now()));
		
	}
	
}
