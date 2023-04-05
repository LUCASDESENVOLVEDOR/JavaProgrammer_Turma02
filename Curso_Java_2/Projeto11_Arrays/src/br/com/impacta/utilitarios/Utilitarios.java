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


//escrever um método que recebe como parametro um array de numeros reais,
// e retornar a média dos elementos do array.

//percorrer cada item do array, somar cada item e dividir pela quantidade
// de itens.

public static double calcularMediaArray(double[] numeros) {
	
	double soma = 0;
	
	for (int i = 0; i < numeros.length; i++)
	{
		soma += numeros[i];
	}
	
	return soma / numeros.length;
	
	
}





}
