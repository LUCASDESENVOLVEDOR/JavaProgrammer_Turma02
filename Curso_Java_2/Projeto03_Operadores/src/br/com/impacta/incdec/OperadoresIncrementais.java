package br.com.impacta.incdec;

public class OperadoresIncrementais {
	public static void main(String[] args) {
		
		int numero = 10;
		
		System.out.println("numero: " + numero);
		
		numero++;
		System.out.println("numero++: " + numero);
		
		++numero;
		System.out.println("++numero: " + numero);
		
		int x = numero++;
		System.out.println();
		System.out.println("x: " + x);
		System.out.println("numero: " + numero);
		
		x = ++numero;
		System.out.println("x: " + x);
	}

}
