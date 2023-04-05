package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Circulo;
import br.com.impacta.classes.Retangulo;
import br.com.impacta.interfaces.Figura;

public class AppArray07 {
	public static void main(String[] args) {
		
		//definindo um array de "Figuras"
		Figura[] arrayFiguras = new Figura[3];
		
		arrayFiguras[0] = new Retangulo(12,14);
		arrayFiguras[1] = new Circulo(20);
		arrayFiguras[2] = new Retangulo(1,1);
		
		// apresentando as figuras
		
		//foreach
		for (Figura figura : arrayFiguras) {
			JOptionPane.showMessageDialog(null, figura.apresentarFigura());
		}
		
		
	}

}
