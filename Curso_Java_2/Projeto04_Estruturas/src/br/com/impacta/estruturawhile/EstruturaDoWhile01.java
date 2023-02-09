package br.com.impacta.estruturawhile;

public class EstruturaDoWhile01 {
	public static void main(String[] args) {
		

		 int numero = (int) (Math.random() * 20);
		 
		 do {
			 System.out.println(numero++);
		 }
		 
		 while(numero < 10); 
		
		 System.out.println("---FIM DO PROGRAMA");
		
		
	}

}
