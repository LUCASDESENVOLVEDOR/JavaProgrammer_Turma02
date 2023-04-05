package br.com.impacta.aplicacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppArray06 {
public static void main(String[] args) {
	
	//criando uma coleção de objetos automovel
	Automovel[] automoveis = new Automovel[3];
	
	//instanciando a classe automovel para cada posicao
	automoveis[0] = new Automovel("VW", "Fusca",1972,"BBC1984");
	automoveis[1] = new Automovel("VW", "A-Kombi",1980,"CDV8874");
	automoveis[2] = new Automovel("Hyundai", "Creta",2022,"FFG1963");
	
	Arrays.sort(automoveis);
	
	for (Automovel automovel : automoveis) {
		JOptionPane.showMessageDialog(null, automovel.mostrar());
	}
	
}
}
