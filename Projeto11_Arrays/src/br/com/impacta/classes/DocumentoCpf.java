package br.com.impacta.classes;

import br.com.impacta.interfaces.Documento;

public class DocumentoCpf implements Documento {

	private String cpf;
	
	public DocumentoCpf(String cpf) {
		this.SetNumero(cpf);
	}
	
	
	@Override
	public void SetNumero(String numero) {
		
		  if(!numero.matches("[0-9]{11}")) {
			  throw new  NumberFormatException("O CPF deve ter 11 dígitos.");
		  }	
		  
		  this.cpf = numero;
		
	}

	@Override
	public String getNumero() {
		
		return this.cpf;
	}

}
