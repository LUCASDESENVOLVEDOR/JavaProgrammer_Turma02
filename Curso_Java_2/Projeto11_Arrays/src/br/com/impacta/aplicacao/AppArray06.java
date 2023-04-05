package br.com.impacta.aplicacao;

import java.util.Arrays;

import br.com.impacta.classes.Automovel;

public class AppArray06 {

	public static void main(String[] args) {
		
		//criando uma coleção  de objetos Automovel
		Automovel[] automoveis = new Automovel[3];
		
		//instanciando a classe Automovel para cada posicao.
		automoveis[0] = new Automovel("VW", "Kombi",1972,"BBC1984");
		automoveis[1] = new Automovel("VW", "Fusca",1980,"CDV8874");
		automoveis[2] = new 
				Automovel("Hyundai", "Creta",2022,"FFJ1963");
		
		
		Arrays.sort(automoveis);
		
		//foreach
		for (Automovel automovel : automoveis) {
			System.out.println(automovel.mostrar());
		}

	}

}
