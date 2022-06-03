package br.com.geekuniversity.secao07;

// Matrizes - array multi-dimensional
/*
 * [linhas] [colunas]
 * 
 * int numeros[3][3]
 * 
 * numeros[0][0] = 1;
 * numeros[0][1] = 2;
 * numeros[0][2] = 5;
 * numeros[1][0] = 7;
 * numeros[1][1] = 4;
 * numeros[1][2] = 9;
 * numeros[2][0] = 3;
 * numeros[2][1] = 6;
 * numeros[2][2] = 32;
 * 
 */
public class Programajava18 {

	public static void main(String[] args) {
		// Declaração
		int outros_numeros[][];
	
		// Declaração e definição de tamanho
		int numeros[][]  = new int[3][3];
		
		// Declaração, definir o tamanho e inicializar
		int mais_numeros[][] = { 
				{1, 2, 3 } , 
				{4, 5, 6 }, 
				{7, 8, 6}
				};
		
		// Declarar uma matriz informando somente as linhas
		//                    [linha][coluna]
		int matriz[][] = new int[2][];
		
		// Adicionar arrays nas linhas mencionadas
		matriz[0] = new int[5];
		matriz[1] = new int[3];
		
		// É o mesmo que fazer isso abaixo
		int nova_matriz [][] = {
				{1, 2}, 
				{1, 2, 3, 4, 5}, 
				{1, 2, 3}
				}; 
		
		System.out.println(nova_matriz[2][2]);
	}

}
