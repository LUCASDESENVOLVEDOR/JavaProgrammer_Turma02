package br.com.impacta.interfaces;


public interface Figura {
		
	  //todos os métodos de uma interface são
	  //publicos e abstratos por definição.
	 double calcularArea();
	 
	 //todos os atributos de uma interface são
	 //publicos,estaticos e constantes (final) por 
	 //definicao	 
	 String AUTOR = "EQUIPE";
	 
	 //método default = método definido na interface,
	 //acessível por todos os objetos de todas as classes
	 //que implementarem.
	 
	 
	 //THIS = é uma referencia ao objeto da classe que vai implementar!
	 
	 default String apresentarFigura() {		 
		 String resposta = "Classe: " + this.getClass().getName() +
		          "\nÁrea: " + this.calcularArea();              
		 return resposta;		 
	 }

}
