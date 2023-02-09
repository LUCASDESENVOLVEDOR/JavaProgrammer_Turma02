package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile02 {

	public static void main(String[] args) {
		
		/* Neste programa o usuario fornece uma certa quantidade de 
		 * numeros . A entrada de dados termina quando o usuario
		 * digitar o numero 0.
		 * 
		 * No final, o programa deve mostrar a soma e a quantidade de
		 * numeros informados.
		 */
		
	
		
		int quantidade = 0;
		int soma = 0;
		
		while(true) {
			
			int numero = Integer.parseInt(
					JOptionPane.showInputDialog("Informe um número"));		
			
			
			//return -> sai da funcao. 
			
			if(numero == 0) {
				break; //interrompe a estrutura de repetição.
			}
			
			//soma = soma + numero;
			soma += numero;			
			quantidade++;
			
		}
		
		System.out.println("Soma dos dados informados: " + soma);
		System.out.println("Quantidade de números informados: " + quantidade);

	}

}
