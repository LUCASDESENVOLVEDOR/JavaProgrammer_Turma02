package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.utilitarios.Utilitarios;

public class AppUtilitarios {

	public static void main(String[] args) {
		
		
		double soma = Utilitarios.somar(12, 15.6);		
		System.out.println(soma);
		
		
		System.out.println(Utilitarios.RemoverEspacos("Hoje não está chovendo"));
		
		System.out.println(Utilitarios.gerarEmail("Lu cas", "A ragao"));

	}

}
