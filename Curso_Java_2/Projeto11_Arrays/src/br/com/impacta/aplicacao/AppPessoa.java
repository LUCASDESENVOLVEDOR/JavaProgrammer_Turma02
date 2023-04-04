package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		
		//instancia da classe Pessoa
		//Pessoa pessoa = new Pessoa();
		
		//pessoa.setNome("Lucas");
		//pessoa.setIdade(29);
		//pessoa.setSexo(Sexo.MASCULINO);
		//JOptionPane.showMessageDialog(null, pessoa.mostrar());			
		
		//instancia da classe Funcionario.
		Pessoa  funcionario = new Funcionario();
		funcionario.setNome("Joel");
		funcionario.setIdade(29);
		funcionario.setSexo(Sexo.MASCULINO);
		((Funcionario)funcionario).setCargo("Motoboy");
		((Funcionario)funcionario).setSalario(3500);
		JOptionPane.showMessageDialog(null, funcionario.mostrar());
		
		
		//instancia da classe Aluno.
		Pessoa aluno = new Aluno();
		aluno.setNome("Amanda");
		aluno.setIdade(20);
		aluno.setSexo(Sexo.FEMININO);
		((Aluno)aluno).setMatricula(12345);
		
		//Curso cursoDoAluno = new Curso();
		//cursoDoAluno.setCodigo(222);
		//cursoDoAluno.setDescricao("Java Programmer");
		//cursoDoAluno.setCargaHoraria(100);
		//cursoDoAluno.setPreco(1000);
		
		//comentar aqui.
		
		//Aluno aluno1 = (Aluno)aluno;
		
		((Aluno)aluno).setCurso(new Curso(222,"Java Programmer",100,1000));
		
		JOptionPane.showMessageDialog(null, aluno.mostrar());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
