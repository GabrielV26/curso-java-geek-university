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
			// o arquivo ser� recriado e toda a informa��o, se pr�-existentem
			// ser� excluida, recome�ando um arquivo zerado.
			PrintStream escrever = new PrintStream("saida.txt");
			
			for (int x = 0 ; x < 5 ; x++) {
				System.out.printf("Escreva algo: ");
				// Escrever dentro do arquivo
				String msg = teclado.nextLine();
				escrever.println(msg);
			}
			escrever.close();
		} catch (FileNotFoundException e) {
			System.out.println("N�o foi possivel criar o arquivo.");
		}
		teclado.close();

	}

}
