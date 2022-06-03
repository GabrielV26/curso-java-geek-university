package br.com.geekuniversity.secao07;
import java.util.Scanner;
/*
 * int numeros[5]
 * 
 * vetor[indice]
 * 
 * numeros[0] = 1; // priveiro elemento
 * numeros[1] = 2; // segundo elemento
 * numeros[2] = 3; // terceiro elemento
 * 
 */
public class Programajava16 {
	public static void main(String[] args) {
		// Declarando vetor
		int vetor[];
		// Declarando vetor e especificando o tamanho vetor
		int numeros[] = new int[5];
		// Declarar, especificar o tamanho e inicializar
		int outros_numeros[] = {1, 3, 5, 7, 9};
		
		String nomes[] = {"Gabriel", "Joel", "Natanael"};
		String adicionarnomes[] = new String[5];
		
		// Minha ganbiarra
		/*
		for(int x = outros_numeros.length ; 0 < x; x--) {
			System.out.println("teste" + x);
		}
		*/
		// itera sobre o array de 5 elementos
		for(int x = 0 ; x < adicionarnomes.length; x++) {
		    
			System.out.println("Informe o nome: ");
			// Recebe dados do usuario
			Scanner teclado = new Scanner(System.in);
			// Armazena os dados no array da posicao 0 a 4
			adicionarnomes[x] = teclado.nextLine();
			
			//finaliza a captura de dados via teclado, se for verdade
			if ( x == adicionarnomes.length - 1 ) {
				teclado.close();
			}
		}
		
		for(int x = 0 ; x < adicionarnomes.length; x++) {
			System.out.println(adicionarnomes[x]);
		}
	}
}
