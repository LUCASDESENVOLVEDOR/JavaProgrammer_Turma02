package br.com.impacta.utilitarios;

public class Utilitarios {
	
	String curso = "Java";
	

public static double somar(double x, double y) {
	 
	return x + y;
}



public static String RemoverEspacos(String texto) {
	
	return texto.replace(" ","");
	
}

//Escrever um método que receba como parametro um nome e um sobrenome
// e retorno um email no formato: nome.sobrenome@impacta.com.br

public static String gerarEmail(String nome, String sobrenome) {
	
	String email = nome.toLowerCase() + "." 
	                     + sobrenome.toLowerCase() + "@impacta.com.br";
	  
	//return RemoverEspacos(nome.toLowerCase() + "." 
	                   //  + sobrenome.toLowerCase() + "@impacta.com.br");
	
	
	return RemoverEspacos(email);
}



}
