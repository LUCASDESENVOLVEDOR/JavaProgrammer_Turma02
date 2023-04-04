package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.DocumentoCNPJ;
import br.com.impacta.classes.DocumentoCpf;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoaDocumento {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Josivaldo Mirosmar");
		funcionario.setIdade(40);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Estagiario");
		funcionario.setSalario(3000);
		//funcionario.setDocumento(new DocumentoCpf("32949800009"));
		funcionario.setDocumento(new DocumentoCNPJ("27844537000194"));
		
		JOptionPane.showMessageDialog(null, funcionario.mostrar());
	}

}
