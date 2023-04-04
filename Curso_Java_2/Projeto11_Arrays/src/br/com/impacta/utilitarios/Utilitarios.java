package br.com.impacta.utilitarios;

public class Utilitarios {
		
	
	public static  double somar (double x, double y) {
		return x + y;
	}
	
	//escrever um metodo que receba como parametro um texto e retorno
	//este texto sem espacos.	
	public static String removerEspacos(String texto) {
		
		return texto.replace(" ", "");
		
		
	}
	
	//escrever um metodo que receba como parametro um nome e um sobrenome
	// e retorne um email no formato:  nome.sobrenome@impacta.com.br
	
	public static String gerarEmail(String nome, String sobrenome) {
		
		String email = nome.toLowerCase() + "." + 
		               sobrenome.toLowerCase() + "@impacta.com.br";
		
		return removerEspacos(email);
		
		
	}
	
	

}
