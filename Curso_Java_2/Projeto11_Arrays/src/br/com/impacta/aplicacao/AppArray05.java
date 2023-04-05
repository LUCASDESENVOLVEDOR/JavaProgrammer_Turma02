package br.com.impacta.aplicacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppArray05 {

	public static void main(String[] args) {
	
		
		//o usuario fornece alguns nomes de pessoas para uma lista.
		
		int quantidade = Integer.parseInt(
				JOptionPane.showInputDialog("Informe a quantidade de nomes "));
		
		if(quantidade <= 0) {
			
			JOptionPane.showMessageDialog(null,
					"A quantidade deve ser maior que zero! ",
					"Erro",
					JOptionPane.ERROR_MESSAGE);
			
			return;
			
		}
		
		
		
		 String[] nomes = new String[quantidade];	
		 
		 for (int i = 0; i < nomes.length; i++) {		
			 nomes[i] =  JOptionPane.
					 showInputDialog("Informe o nome " + (i+1)).toUpperCase();
	     }
		 
		 Arrays.sort(nomes);
		 
		 for (String nome : nomes) {
			System.out.println(nome);
		}
		
		

	}

}
