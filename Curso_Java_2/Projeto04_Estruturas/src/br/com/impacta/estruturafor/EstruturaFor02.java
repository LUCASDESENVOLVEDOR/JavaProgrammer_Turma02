package br.com.impacta.estruturafor;
import javax.swing.JOptionPane;

public class EstruturaFor02 {
	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(
				  JOptionPane.showInputDialog("Quantas pessoas estão na sala?"));		

		
		
		int maior= 0;
		int contador = 0;
		
		
		
		
		for (int i = 1; i <= quantidade; i++) {			
			String pergunta = "Pessoa " + i +
					          "\nQual a idade da pessoa: " + i + "?";
			
			int idade = Integer.parseInt( JOptionPane.showInputDialog(pergunta));
			  
			if(idade > maior) {			
				 
				maior = idade;
				contador = i;
			}
			     
			
		}
		
		 String resposta = "Maior idade: " + maior +
				 "\nPessoa: " + contador;
		 
		 JOptionPane.showMessageDialog(null, resposta);
		
		
		
		
		
	}

}

