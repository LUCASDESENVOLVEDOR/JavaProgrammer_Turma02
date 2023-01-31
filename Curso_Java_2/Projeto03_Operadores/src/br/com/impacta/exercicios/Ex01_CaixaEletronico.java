package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

/*
 * Um caixa eletrônico possui as cédulas:
 * 
 * 50,00
 * 20,00
 * 10,00
 * 5,00
 * 
 * Escrever o programa de forma para facilitar ao usuario
 * o valor do saque. Com base no valor, apresentar a 
 * quantidade de cada cédula dispensada, considerando
 * que as cédulas de maior valor são liberadas primeiro.
 * 
 */


public class Ex01_CaixaEletronico {
	
	public static void main(String[] args) {
		
		
		int valor = Integer.parseInt( 
				JOptionPane.showInputDialog("Qual o valor do saque?"));
		
		
		int qtde50, qtde20,qtde10, qtde5;	
				
		qtde50 = valor/50;	
		qtde20 = (valor%50)/20;
		qtde10 = (valor%20)/10;
		qtde5 = (valor%10)/5;
		
		String resposta = "Valor do Saque: " + valor + 
				          "\nNotas de 50: " + qtde50 + 
				          "\nNotas de 20: " + qtde20 + 
				          "\nNotas de 10: " + qtde10 +
				          "\nNotas de 5: " + qtde5;
		
		JOptionPane.showMessageDialog(null, resposta);	
		
		
	}
	
	

}
