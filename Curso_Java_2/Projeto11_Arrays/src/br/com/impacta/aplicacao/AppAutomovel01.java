package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {

	public static void main(String[] args) {
		
		//declarar variavel.
		
		//new responsavel por criar o objeto;
		Automovel auto = new Automovel("Honda","Civic");	
		
		auto.lerDados("Honda","Civic",2020,"EBX1234");	
		
	
		//auto.setAno(1959);
		
		String texto = auto.mostrar();
		System.out.println(texto);
		
		//Automovel.paisOrigem = "Argentina";
		
		
		JOptionPane.showMessageDialog(null, auto.mostrar(),"Relátorio", JOptionPane.ERROR_MESSAGE);
		
		//int n = Integer.parseInt(
				//JOptionPane.showInputDialog("Informe um número"));
		
		
		
		//Automovel auto2 = new Automovel();
		//auto2.lerDados("Chevrolet","Corsa",2023,"AAA0000");		
		
		//texto = auto2.mostrar();
		
		//System.out.println(texto);
		//JOptionPane.showMessageDialog(null, texto);
		
		
	
		
		
		
		
		
		

	}

}























