package br.com.geekuniversity.secao07;
// Matrizes parte 2

public class Programajava19 {

	public static void main(String[] args) {
		
		int numeros[][] = new int[3][3];
		
		numeros[0][0] = 1;
		numeros[0][1] = 3;
		numeros[0][2] = 5;
		numeros[1][0] = 7;
		numeros[1][1] = 9;
		numeros[1][2] = 11;
		numeros[2][0] = 13;
		numeros[2][1] = 15;
		numeros[2][2] = 17;
		
		// [linha] [coluna]
		for( int i = 0; i < numeros.length ; i ++) {
			// ATENCAO                   *
			for (int j = 0 ; j < numeros[i].length ; j++ ) {
				System.out.println( 
						"linha: " + i +" coluna: " + j + " = " + numeros[i][j]);
			}
		}
		
		// Meu testes
		System.out.println("------------------------");
		for( int i = 0; i < numeros.length ; i ++) {
			// ATENCAO                   *
			for (int j = 0 ; j < numeros[i].length ; j++ ) {
				// Atribuir valor
				numeros[i][j] = i + j * 2;
			}
		}
		for( int i = 0; i < numeros.length ; i ++) {
			// ATENCAO               * eu posso utilizar mais colunas
			for (int j = 0 ; j < numeros[i].length ; j++ ) {
				System.out.println("linha: " + i +" coluna: " + j + " = " + numeros[i][j]);
			}
		}
		
	}

}
