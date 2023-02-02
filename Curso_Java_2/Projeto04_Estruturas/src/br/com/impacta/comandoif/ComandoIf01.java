package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {

	public static void main(String[] args) {
		
		int idade = Integer.parseInt(
	             JOptionPane.showInputDialog("Informe a idade")
	             );
		
		//se condicao for TRUE
		if(idade < 18) 	{		
			System.out.println("Menor de Idade");
		}
		// senao (condicao FALSE)
		else {
			System.out.println("Maior de Idade");
			System.out.println("Idade fornecida: " + idade);			
		}
		
		

	}

}
