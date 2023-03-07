package br.com.impacta.classes;

public class Funcionario extends Pessoa {
 // extends = (Herança) - Subclasse de Pessoa.
	
	private String cargo;
	private double salario;
	
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
	
	
	
	
	
}
