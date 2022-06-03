package br.com.geekuniversity.secao18;
import java.io.FileNotFoundException;
import java.io.PrintStream;
/*
 * Escrevendo em arquivos++++++++++
 */
import java.util.Scanner;

public class Programajava42 {

	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		try {
			// Desta forma, toda vez que o programa for executado,
			// o arquivo será recriado e toda a informação, se pré-existentem
			// será excluida, recomeçando um arquivo zerado.
			PrintStream escrever = new PrintStream("saida.txt");
			
			for (int x = 0 ; x < 5 ; x++) {
				System.out.printf("Escreva algo: ");
				// Escrever dentro do arquivo
				String msg = teclado.nextLine();
				escrever.println(msg);
			}
			escrever.close();
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel criar o arquivo.");
		}
		teclado.close();

	}

}
