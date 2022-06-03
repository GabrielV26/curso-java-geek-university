package br.com.geekuniversity.secao05;

import java.util.Scanner;

public class Programajava08 {
	
	public static void main(String[] args) {
		
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		// só entra no loop se for verdade, a variavel idade deve ter um valor
		// antes de iniciar o bloco,.
		do {
			
		    System.out.println("Informe sua idade");

		    idade = teclado.nextInt();
		    
		    if (idade > 0) {
		    	System.out.println("idade: " + idade);
		    	
		    }
		} while (idade > 0);
		
		teclado.close();
	}
}
