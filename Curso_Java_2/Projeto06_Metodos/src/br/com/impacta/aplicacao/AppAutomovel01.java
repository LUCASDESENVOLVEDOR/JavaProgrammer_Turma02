package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	public static void main(String[] args) {
					
					//declarando variaveis.		
		Automovel auto = new Automovel();
		auto.lerDados("Honda","Civic",2000,"EBX1234");
		
		//auto.setAno(1959);
		
		
		String texto = auto.mostrar();
		System.out.println(texto);		
		
		Automovel auto2 = new Automovel();
		
		auto2.lerDados("Chevrolet","Corsa",2014,"AAA000");
		texto = auto2.mostrar();
		System.out.println(texto);
		
		JOptionPane.showMessageDialog(null, auto2.mostrar(),"Relatório", JOptionPane.QUESTION_MESSAGE);
		
		
		
		
		//int n = Integer.parseInt(
			//	JOptionPane.showInputDialog("Informe um número"));
		
		
		
		
		
		
	}

}





















