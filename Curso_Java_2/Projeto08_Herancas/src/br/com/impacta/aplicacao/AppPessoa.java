package br.com.impacta.aplicacao;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {	
		
		//instancia da classe pessoa.
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Lucas");
		pessoa.setIdade(29);
		pessoa.setSexo(Sexo.MASCULINO);
		
		//instancia da classe funcionario.
		Funcionario  funcionario = new Funcionario();
		funcionario.setNome("Joel");
		funcionario.setIdade(20);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Motoboy");
		funcionario.setSalario(4000);
		
		
		//instancia da classe aluno.
		Aluno aluno = new Aluno();
		aluno.setNome("Bianca");
		aluno.setIdade(20);
		aluno.setSexo(Sexo.FEMININO);
		aluno.setMatricula(1233);
		
		//Curso cursoDoAluno = new Curso();
		//cursoDoAluno.setCodigo(222);
		//cursoDoAluno.setDescricao("Java Programmer");
		//cursoDoAluno.setCargaHoraria(100);
		//cursoDoAluno.setPreco(1000);
		
		aluno.setCurso(new Curso(222,"Java Programmer",100,1000));
		
		

	}

}
