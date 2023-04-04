package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Circulo;

import br.com.impacta.classes.Retangulo;

public class AppFiguras {
	public static void main(String[] args) {
		
		Retangulo ret = new Retangulo();
		ret.setBase(10);
		ret.setAltura(15);
		
		Circulo circ = new Circulo();
		circ.setRaio(5);
		
		
		JOptionPane.showMessageDialog(null, circ.apresentarFigura());
		JOptionPane.showMessageDialog(null, ret.apresentarFigura());
		
	}
	


}
