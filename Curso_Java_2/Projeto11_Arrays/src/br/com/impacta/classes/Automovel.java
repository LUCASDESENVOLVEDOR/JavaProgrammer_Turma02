package br.com.impacta.classes;

public class Automovel implements Comparable<Automovel> {
	//Atributos.
private	String marca;
private	String modelo;
private	int ano;
private	String placa;


private static final String PAIS_ORIGEM = "Brasil";


//GETTER SETTER

//DEFAULT = Todos no pacote tem acesso.
//PUBLIC = Geral
//PRIVATE = Apenas a classe terá acesso.

//construtores
public  Automovel(String marca, String modelo) {
	this.setMarca(marca);
	this.setModelo(modelo);
	
}

public Automovel(String marca, String modelo, int ano) {
	this(marca,modelo);
	this.setAno(ano);
	
}
public Automovel(String marca, String modelo, int ano, String placa) {
	this(marca,modelo, ano);
	this.setPlaca(placa);
	
	
}




public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	
	//throw arremessar (lançar) = produzir.
	//new = novo
	///execessao de numero.
	
	if(ano < 1970) {
		throw new NumberFormatException("O ano não pode ser menor que 1970.");
	}
	
	this.ano = ano;
}

public String getPlaca() {
	return placa;
}

public void setPlaca(String placa) {
	this.placa = placa;
}

public String mostrar() {	
	
	String titulo = "\nDADOS DO AUTOMÓVEL: ";
	
	String resposta = titulo +  "\n\nMarca: " + this.getMarca() + 
			          "\nModelo: " + this.getModelo() ;
	
	               if(this.getAno() > 0) {
	            	   resposta +=   "\nAno: " + this.getAno();
	               }
	 
	               if(this.getPlaca() != null) {
	            	   //resposta = resposta + "\nPlaca: " + this.getPlaca();
	            	   resposta +=  "\nPlaca: " + this.getPlaca();
	               }
	               			         
	               resposta += "\nPaís Origem: " + PAIS_ORIGEM;

	 return resposta;	
	
}

//Objetivo da Sobrecarga é Flexibilizar um método.

public String mostrar(String titulo) {	
	
	String resposta = titulo +  "\n\nMarca: " + this.getMarca() + 
			          "\nModelo: " + this.getModelo() + 
			          "\nAno: " + this.getAno() + 
			          "\nPlaca: " + this.getPlaca();
	
	 return resposta;	
	
}




public void lerDados(String marca,String modelo,int ano, String placa) {
	
	//this - referencia a propria classe.
	//this - É uma referencia que serve para termos acesso a todos os atributos
	       // da classe.
	
	//toda classe possui um this.
	
	this.setMarca(marca);
	this.setModelo(modelo);
	this.setAno(ano);
	this.setPlaca(placa);
	
	
}

@Override
public int compareTo(Automovel auto) {
	
	if(this.getMarca().compareTo(auto.getMarca()) == 0) {
		return this.getModelo().compareTo(auto.getModelo());
	}
	
	return this.getMarca().compareTo(auto.getMarca());
	
	
}




}
