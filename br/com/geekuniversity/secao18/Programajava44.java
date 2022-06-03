package br.com.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

// Escrita em arquivos 2
public class Programajava44 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			// Append de um arquivo existente, CONTINUO ESCREVENDO.
			PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));
			
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
