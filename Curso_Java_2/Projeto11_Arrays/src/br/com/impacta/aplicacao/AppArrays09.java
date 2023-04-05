package br.com.impacta.aplicacao;

public class AppArrays09 {

	public static void main(String[] args) {

		// array multidimensional
		int[][] numPessoas = new int[3][4];
		
		numPessoas[0][0] = 3;
		numPessoas[0][1] = 5;
		numPessoas[0][2] = 9;
		numPessoas[0][3] = 7;
		
		numPessoas[1][0] = 4;
		numPessoas[1][1] = 6;
		numPessoas[1][2] = 1;
		numPessoas[1][3] = 8;		
		
		numPessoas[2][0] = 11;
		numPessoas[2][1] = 25;
		numPessoas[2][2] = 16;
		numPessoas[2][3] = 47;
		
		
		for (int linha = 0; linha < numPessoas.length; linha++) {
			
			for (int coluna = 0; coluna < numPessoas[linha].length; coluna++) {				
				System.out.print(numPessoas[linha][coluna]  + "\t");			
				
			}
			System.out.println();
			
		}
	
		

	}

}
