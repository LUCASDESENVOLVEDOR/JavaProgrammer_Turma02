package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppExecoes01 {

	public static void main(String[] args) {
		
		
		try {
			
			String nome = JOptionPane.
					showInputDialog("Informe seu nome").toUpperCase();
			
			int idade = Integer.parseInt(
					JOptionPane.showInputDialog("Informe sua idade"));
			
			JOptionPane.showMessageDialog(null, "Nome informado:  : " + nome);
			
			JOptionPane.showMessageDialog(null, "Idade informada : " + idade);
			
			
			
		} catch (NumberFormatException | NullPointerException e) {
			
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		catch(Exception errogenerico) {
			JOptionPane.showMessageDialog(null, errogenerico.getMessage());
			
		} 
	}
}





















