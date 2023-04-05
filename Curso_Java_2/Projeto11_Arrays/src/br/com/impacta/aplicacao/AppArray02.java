package br.com.impacta.aplicacao;

public class AppArray02 {
	public static void main(String[] args) {
		
		//definindo um array de inteiros implicitamente.
		int[] numeros = {17,13,18,25,39,17};
		
		//apresentando os dado array usando a estrutura for aprimorada(Java 5.0)
		
		for (int elemento : numeros) {
			System.out.println(elemento);
		}
		
	}

}
