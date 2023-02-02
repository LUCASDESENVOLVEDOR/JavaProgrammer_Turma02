package br.com.impacta.relacionais_logicos;

public class OperadoresLogicos02 {
	public static void main(String[] args) {
		
		int a= 10, b = 20;
		
		
		//|| espera que uma condicao seja TRUE.
		
		//neste caso a primeira condição é TRUE, então o codigo
		// nao vai analisar outras.
		
		
		boolean b1 = (a>=10) || (--b > 0) ;
		
		//nesse caso b= 19 porquem o && vai analisar todas as condicoes.
		boolean b2 = (a>=10) && (--b > 0) ;
		
		System.out.println("b: " + b);
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		
		
		
	}

}
