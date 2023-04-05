package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppArray04 {
public static void main(String[] args) {
	
	//o usuario fornece alguns nomes de pessoas para uma lista.
	 String[] nomes = new String[4];	
	 
	 for (int i = 0; i < nomes.length; i++) {		
		 nomes[i] =  JOptionPane.showInputDialog("Informe o nome " + (i+1));
     }
	 
	 for (String nome : nomes) {
		System.out.println(nome);
	}
}
}
