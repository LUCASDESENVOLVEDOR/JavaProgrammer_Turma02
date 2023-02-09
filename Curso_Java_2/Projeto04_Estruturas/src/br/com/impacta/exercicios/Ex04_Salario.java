package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex04_Salario {
	public static void main(String[] args) {
		
		        //Perguntar para o usuario quantos numeros
				// ele deseja.
				//Esta quantidade deverá ser armazenada em uma
				//variavel.
		
		
		         int numero = Integer.parseInt( JOptionPane.
		        		 showInputDialog("Informe quantidade de numeros"));

			

				//perguntar para o usuario quantos irmaos ele possui,
				//armazenar esse valor em uma variavel chamada irmaos
			

		         int irmaos = Integer.parseInt( JOptionPane.
		        		 showInputDialog("Informe quantos irmãos você possui"));

		         
				//perguntar em qual cidade ele mora e armazenar em
				//uma variavel chamada cidade	
				
		         String cidade = JOptionPane.
		        		 showInputDialog("Informe em qual cidade você mora");

				
				//Perguntar qual é o salário, incluindo os centavos.
				//armazenarla em uma variavel chamada sario
		         		         
		         double salario = Double.parseDouble( JOptionPane.
		        		 showInputDialog("Informe seu salario"));

		         
				
				//Declarar um variavel do tipo String chamada Status.
				//Se o salario informado for maior que R$6.000,00 , 
				//esta variavel deve aramazenar: "Você está acima da media."
				//Caso contrario, a variavel deve armazenar:
				 // Você está dentro da média.

		         
		         String status;
		         
		         if(salario > 6000) {
		        	 status = "Você está acima da media.";
		         }
		         else {
		        	 status = "Você está dentro da média.";
		         }	         
		         
				
				//Criar uma variavel do tipo String chamada resposta.
				//Esta variavel deve aramazenar os dados das variaveis descritas
				//neste exercicio, gerando um conteudo semelhante ao mostrado abaixo:

				// Numero informado:  <numero>
				// Quant. de irmaos  <irmaos>
				// Cidade onde mora:  <cidade>
				//  Salário:  <salario>
				//  Status    <status>

		         String resposta = "Numero informado: " + numero +
		        		           "\nQuantidade de irmaos: " + irmaos +
		        		           "\nCidade onde mora:" + cidade + 
		        		           "\nSalário:" + salario + 
		        		           "\nStatus: " + status;
		         
		         JOptionPane.showMessageDialog(null, resposta);
		        		         
		         

				//Em seguida, apresentar esta variavel na tela usando o método
				//showMessageDialog

		
		
	}

}
