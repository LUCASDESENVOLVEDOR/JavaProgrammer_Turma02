package br.com.impacta.classes;

public class Produto {

	private final int codigo;
	private String categoria;
	private String descricao;
	private double preco;
	
	private static int CONTADOR = 20;
	
	
	
	public Produto(String categoria, String descricao, double preco) {
		this.codigo = CONTADOR++;
		this.setCategoria(categoria);  
		this.setDescricao(descricao);
		this.setPreco(preco);
	}
	
	
	// getters e setters
	public int getCodigo() {
		return codigo;
	}
	
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	public String mostrar() {
		
		return "Código: " + this.getCodigo() + 
				          "\nDescrição: " + this.getDescricao() +
				          "\nCategoria: " + this.getCategoria() + 
				          "\nPreço: " + this.getPreco();
		
	}
	
	
	
	
	
	
	
	
}

























