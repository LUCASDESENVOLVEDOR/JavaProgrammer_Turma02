package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.DocumentoCnpj;
import br.com.impacta.classes.DocumentoCpf;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoaDocumento {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Josivaldo Mirosmar");
		funcionario.setIdade(40);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setSalario(3000);
		funcionario.setCargo("Escritor");
		//funcionario.setDocumento(new DocumentoCpf("82565639074"));
		funcionario.setDocumento(new DocumentoCnpj("22749731000177"));
		JOptionPane.showMessageDialog(null, funcionario.mostrar());
		
		

	}

}
