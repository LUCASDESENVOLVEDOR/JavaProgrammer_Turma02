package br.com.impacta.classes;

public class Automovel {
	//Atributos.
private	String marca;
private	String modelo;
private	int ano;
private	String placa;

//GETTER SETTER


	

//DEFAULT = Todos no pacote tem acesso.
//PUBLIC = Geral
//PRIVATE = Apenas a classe terá acesso.

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
	
	String resposta =  "Marca: " + this.getMarca() + 
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


}