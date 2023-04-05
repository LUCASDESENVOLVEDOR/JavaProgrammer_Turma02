package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public abstract class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private int idade;
	private Sexo sexo;
	private Documento documento;
	
	
	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome,int idade, Sexo sexo, Documento docpessoa) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setDocumento(docpessoa);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	
	public String mostrar() {
		
		return "Nome: " + this.getNome() + 
				"\nIdade: " + this.getIdade() + 
				"\nSexo: " + this.getSexo() +
				(this.getDocumento() instanceof 
						DocumentoCpf ? "\nCPF: ": "\nCNPJ: ") +      
				
				 this.getDocumento().getNumero();
		
		
	}

	@Override
	public int compareTo(Pessoa pessoa) {
	
		return  this.getNome().compareTo(pessoa.getNome());
	}
	
	
	

}
