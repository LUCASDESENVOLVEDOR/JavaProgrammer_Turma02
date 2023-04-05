package br.com.impacta.aplicacao;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.Arrays;

import br.com.impacta.classes.Curso;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;


public class AppArray08 {
	public static void main(String[] args) {
		
		//solicitando a quantidade de cursos
		 int quantidade =  parseInt(showInputDialog
				                       ("Informe a quantidade de cursos: "));		 
		 //Definindo um array de Cursos
		 Curso[] cursos = new Curso[quantidade];
		 
		 //solicitando os dados do curso para o usuario
		 for (int i = 0; i < cursos.length; i++) {
			 
			 //criar a variaveis que representam as propriedades do curso.
			 
			 int codigo = parseInt(showInputDialog("Código do curso " + (i+1)));
		     String descricao = showInputDialog("Descrição do curso "+ (i+1));
		     int ch = parseInt(showInputDialog("Carga Horária do curso " + (i+1)));
		     double preco = parseDouble(showInputDialog("Preço do curso " + (i+1)));
			 
			 //instanciar um objeto curso e atribuir no index do array
		     cursos[i] = new Curso(codigo, descricao, ch, preco);
			
		}
		 
		 Arrays.sort(cursos);
	
		//apresentando os dados para o usuario
		 for (Curso curso : cursos) {
			System.out.println(curso.mostrar());
			System.out.println();
		}
	}

}
