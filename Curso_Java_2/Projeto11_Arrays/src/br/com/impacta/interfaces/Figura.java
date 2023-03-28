package br.com.impacta.interfaces;

import javax.swing.JOptionPane;

//Tudo é abstrato por definição.

public interface Figura {

	
	//todos os métodos de uma interface são 
	//são publicos e abstratos por definição.
   double calcularArea();
   
   //todos os atributos de uma interfaces são
   // publicos, estaticos e constantes (final) por
   //definição.
   String AUTOR = "EQUIPE";
   
   //this - é uma referencia da classe que vai 
   //implementar a interface.   
   
   default String apresentarFigura() {
	   
	   String resposta = "Classe: " + this.getClass().getSimpleName() +
				"\nÁrea: " + this.calcularArea();
		
		return resposta;
	   
   }
   
  
   
}
