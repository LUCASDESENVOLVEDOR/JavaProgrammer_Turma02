package br.com.impacta.estruturawhile;

public class EstruturaWhile01 {
	
	public static void main(String[] args) {
		
		 int numero = (int) (Math.random() * 20);
		 
		 while(numero < 10) {
			 System.out.println(numero++);
		 }
 		
		 System.out.println("---FIM DO PROGRAMA");
		
	}

}
