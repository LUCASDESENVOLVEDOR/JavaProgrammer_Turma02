package br.com.impacta.aplicacao;

public class AppArray03 {
	public static void main(String[] args) {		
		
		
				int[] numero = {17,13,18,25,39,17};	
				
				for (int elemento : numero) {			
				    System.out.println(elemento);
				}
		
				//vamos fazer o array "numero" referenciar outro objeto.
				
				System.out.println();
				
				numero = new int[] {2,5,7,1,0};	
				
				for (int elemento : numero) {
					System.out.println(elemento);
				}
		
	}

}
