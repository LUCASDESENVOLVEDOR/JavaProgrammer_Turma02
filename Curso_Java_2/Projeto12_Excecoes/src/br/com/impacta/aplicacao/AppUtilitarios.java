package br.com.impacta.aplicacao;

import br.com.impacta.utilitarios.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		
		//executando o método calcular médiaarray()
		
		double[] lista = {2.3, 4.5, 9.1,10,8};
		double media = Utilitarios.
				calcularMediaArray(lista);
		System.out.println
		("Média dos elementos do array: " + media);
		
	}

}
