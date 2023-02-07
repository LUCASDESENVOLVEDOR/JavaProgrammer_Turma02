package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex03_SenhaAlfanumerica {

	public static void main(String[] args) {
		/* Este programa deve gerar uma senha com 6 digitos
		 * onde cada digito é um numero entre 0 e 9. A senha final é
		 * uma String.
		 */
		
		String senha = "";
		
		for (int i = 0; i < 6; i++) {			
			senha += (int) (Math.random() * 10);			
		}
		
		JOptionPane.showMessageDialog(null, senha);
		

	}
	
	
	
	
	

}
