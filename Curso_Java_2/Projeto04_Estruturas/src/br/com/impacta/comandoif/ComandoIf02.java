package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf02 {

	public static void main(String[] args) {
		
		
		/*
		 * Um funcionario terá um valor de 10% de desconto,  SE 
		 * o salário bruto for superior a 5000 reais. O desconto será 
		 * calculado sobre a diferença entre o valor do salário e o valor
		 * base de 5000
		 * 
		 */
		
		
		double salario = Double.parseDouble(
				      JOptionPane.showInputDialog("Informe o salário")
				      );
		
		double desconto = 0;
		
		if(salario > 5000) { 			
			desconto = (salario - 5000) * 10 / 100;
		}	
		
		double salarioliquido = (salario - desconto);
		
		String resposta = "Salário Bruto: " + salario +
				          "\nDesconto: " + desconto +
				          "\nSalário Liquido: " + salarioliquido;
		
		JOptionPane.showMessageDialog(null, resposta);
		
		
		
		

	}

}
