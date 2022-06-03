package br.com.geekuniversity.secao18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Lendo arquivos
 */
public class Programajava43 {

	public static void main(String[] args) {
		try {
			//                            Arquivo de entrada
			Scanner ler = new Scanner(new FileInputStream("entrada.txt"));
			//  enquanto tiver uma linha
			while(ler.hasNextLine()) {
				String linha = ler.nextLine();
				System.out.println(linha);
			}
			ler.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}
		
	}

}
