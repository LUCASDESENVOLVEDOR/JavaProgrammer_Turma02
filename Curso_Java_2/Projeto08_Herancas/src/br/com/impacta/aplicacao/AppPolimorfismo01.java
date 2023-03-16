package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo01 {
	public static void main(String[] args) {
		
		//Quem executa método é sempre o objeto. nunca a variavel.
		
		Pessoa p1= new Funcionario("Joel",20,Sexo.MASCULINO,"Motoboy",3500);
	    JOptionPane.showMessageDialog(null, p1.mostrar());
	    
	    
	    p1= new Aluno("Joel",20,Sexo.MASCULINO,1234,
	    		new Curso(10,"C#", 40, 500));
	    JOptionPane.showMessageDialog(null, p1.mostrar());
		
	}

}










