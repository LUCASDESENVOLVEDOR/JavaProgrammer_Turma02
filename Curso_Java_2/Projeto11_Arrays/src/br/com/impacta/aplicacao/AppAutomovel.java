package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel {

	public static void main(String[] args) {
		
		Automovel auto = new Automovel("Honda","Civic");
		
		JOptionPane.showMessageDialog(null, auto.mostrar());		
		
		Automovel auto2 = new Automovel("Ford","GT", 2017);
		JOptionPane.showMessageDialog(null, auto2.mostrar());
		
		Automovel auto3 = new Automovel("VW", "Fusca",1987,"BCB3214");
		JOptionPane.showMessageDialog(null, auto3.mostrar());
		
		
	}
}
