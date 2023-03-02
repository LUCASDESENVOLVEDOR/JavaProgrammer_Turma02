package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel02 {

	public static void main(String[] args) {
		
		Automovel auto = new Automovel();		
		auto.lerDados("Honda", "Civic", 2021, "EBX1234");
		
		Automovel auto2 = auto;
		auto2.setAno(2022);
		
		//auto = null;
		//auto2 = null;
		
		JOptionPane.showMessageDialog(null, auto.mostrar());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
