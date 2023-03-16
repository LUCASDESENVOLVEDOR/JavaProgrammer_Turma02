package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo02 {
	public static void main(String[] args) {
		
	   Pessoa p1= new Funcionario("Joel",20,Sexo.MASCULINO,"Motoboy",3500); 
	    
	   
	   //new Curso(10,"C#",
       //40, 500)
	   Aluno p2= new Aluno("Joel",20,Sexo.MASCULINO,1234,null);
	   
	   
	   mostrarPessoa(p1);
	   mostrarPessoa(p2);
	   
		
		
	}
	
	private static void mostrarPessoa(Pessoa p) {
		
		String nomeClasse = p.getClass().getSimpleName();
		String resposta = p.mostrar();
		
		JOptionPane.showMessageDialog( null, "Classe: " + nomeClasse +
				                       "\n" + resposta);
		
	}
	
	

}
