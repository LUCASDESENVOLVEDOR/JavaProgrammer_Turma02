package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex05_AdivinhaNumero {
	public static void main(String[] args) {
		
		
		/*O programa produz um número entre 0 e 100.
		O programa pede para usuário digitar um número.

		Enquanto o usuário não acertar o numero, o programa registra a tentativa.

		No final, o programa deve apresentar a mensagem:
		"Você acertou em ? tentativas"

		Exemplo:

		O programa gerou o número 59.

		1 - "Forneça um numero entre 0 e 100"
		    40

		2 - "Forneça um numero entre 41 e 100"
		     65

		3 - "Forneça um numero entre 41 e 64"
		    59

		4 - "Você acertou em 3 tentativas"
		 
		 
		 */
			//70
		 int numero = (int)(Math.random()*100) + 1;
	     int min = 0, max = 100;
	     int tentativas = 0;
	     
	     while(true) {
	    	 
	    	
	    	 int valor  = Integer.parseInt(JOptionPane.showInputDialog
	    			 ("Informe um número entre " + min + " e " + max ));
	    	 
	    	 
	    	 if(valor < min || valor > max)
	    		 continue;
	    	 
	    	 tentativas++;
	    	 
	    	 if(valor < numero) {	    		 
	    		 min = valor + 1;	    		 
	    	 }
	    	 else if(valor > numero) {
	    		 max = valor -1;
	    	 }
	    	 else {
	    		 break;
	    	 } 	    	 
	     }
	     
		 
		String resposta = "Você acertou em " + tentativas + " tentativas";
		JOptionPane.showMessageDialog(null, resposta);
		
		
	}

}
