package br.com.impacta.relacionais_logicos;

public class OperadoresRelacionais01 {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		boolean b1 = (a > 0);
		boolean b2 = (b > a);
		boolean b3 = (b++ == 20);		
		boolean b4 = (--a == 10);
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		System.out.println("b3: " + b3);
		System.out.println("b4: " + b4);
		
	}
}
