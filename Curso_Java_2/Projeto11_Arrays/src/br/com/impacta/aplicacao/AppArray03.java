package br.com.impacta.aplicacao;

public class AppArray03 {
	public static void main(String[] args) {		
		
	    int[] numeros =  {17,13,18,25,39,17};
		
		for (int elemento : numeros) {
			System.out.println(elemento);
		}
		
		//vamoes fazer o array 'numeros' referenciar outro objeto.
		System.out.println();
		
		numeros = new int[] {2,5,7,1,0};
		
		for (int elemento : numeros) {
			System.out.println(elemento);
		}
	}

}
