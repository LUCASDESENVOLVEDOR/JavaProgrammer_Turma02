package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public class Funcionario extends Pessoa {

	//extends - Herança - (Subclasse de pessoa)
	
	private String cargo;
	private double salario;
	
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, int idade, Sexo sexo,Documento documento, String cargo, double salario) {
		super(nome, idade,sexo,documento);
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String mostrar() {
		return super.mostrar() + 
				"\nCargo: " + this.getCargo() + 
				"\nSalário: " + this.getSalario();
	}
	
	
	
	
}
