package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex01_DiasRestantes {
	
	public static void main(String[] args) {
		
		/*
		 * Neste exercicio o usuario deve informar 
		 * dia
		 * mes
		 * ano
		 * 
		 * Como base nestas informaçoes, determinar quantos dias restam
		 * para o ano informado terminar.
		 * 
		 */
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
		
		int[] meses = {31,ano % 4 == 0 ? 29 : 28 ,31,30,31,30,31,31,30,31,30,31};
		
		if(dia < 1 || dia > meses[mes-1]) {
			JOptionPane.showMessageDialog(null,
					"Dia inválido para o mês selecionado");			
		}
		
		//calculo do numeros de dias restantes.
		int diasRestantes = meses[mes-1] - dia; 
		
		for (int i = mes; i < meses.length; i++) {
			diasRestantes += meses[i];
		}
		
		String resposta = "Faltam " + diasRestantes  + " dias para terminar o ano";
		JOptionPane.showMessageDialog(null, resposta);
	}

}










