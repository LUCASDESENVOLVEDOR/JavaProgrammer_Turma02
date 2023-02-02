package br.com.impacta.relacionais_logicos;

public class OperadoresRelacionais02 {

	public static void main(String[] args) {
		
		int a =10, b= 20;
		
		
		//&& espera que todas as codições sejam verdadeiras (TRUE)
		
		
		boolean b1 = (--a< 10) && (b% 2 == 0);
		
		boolean b2 = (a == 10) && (a == b) || (b > 20);
		
		boolean b3 = (a == 10) && ((a == b) || (b > 20));
		
		System.out.println(b3);

	}

}
