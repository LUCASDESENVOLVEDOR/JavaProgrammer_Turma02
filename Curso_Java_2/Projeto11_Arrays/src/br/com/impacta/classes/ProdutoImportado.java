package br.com.impacta.classes;

public class ProdutoImportado extends Produto {
	
	private double taxaImportacao;
	
	
	public ProdutoImportado(String categoria,String descricao, double preco) {
		super(categoria,descricao,preco);
	}
	
	public ProdutoImportado(String categoria,String descricao, double preco, 
			double taxaimportacao) {
		this(categoria,descricao,preco);
		this.setTaxaImportacao(taxaimportacao);
	}
	

	public double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}

	@Override
	public String mostrar() {
		
		return super.mostrar() + 
				"\nTaxa de Importação: " + this.getTaxaImportacao();
	}
	
	
	
	

}
