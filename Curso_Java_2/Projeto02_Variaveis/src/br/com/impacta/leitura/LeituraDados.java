package br.com.impacta.leitura;

import javax.swing.JOptionPane;

public class LeituraDados {
	public static void main(String[] args) {
		
		//jop ctrl + espaco ENTER
		String usuario = JOptionPane.showInputDialog("Qual o seu nome?");
		
		int idade = Integer.parseInt(
				            JOptionPane.showInputDialog("Qual a sua idade?")
				            );
		
		double altura = Double.parseDouble(
				               JOptionPane.showInputDialog("Qual a sua altura?")
				               );
		
		
		String resposta = "Seu nome: " + usuario +
				          "\nSua idade: " + idade + 
				          "\nSua altura: " + altura;
		
		JOptionPane.showMessageDialog(null,resposta);
		//System.out.println("Seu nome: " + usuario);		
		//JOptionPane.showMessageDialog(null,"Seu nome: " + usuario);
		//JOptionPane.showMessageDialog(null,"Sua idade: " + idade);
		//JOptionPane.showMessageDialog(null,"Sua a altura: " + altura);
		
		
	}

}
