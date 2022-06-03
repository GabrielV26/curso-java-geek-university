package br.com.geekuniversity.secao05;
import java.util.Scanner;

//while e do while
public class Programajava07p1 {

	public static void main(String[] args) {
		
		int idade = 1;
		
		Scanner teclado = new Scanner(System.in);
		// só entra no loop se for verdade, a variavel idade deve ter um valor
		// antes de iniciar o bloco,.
		while (idade > 0) {
			
		    System.out.println("Informe sua idade");

		    idade = teclado.nextInt();
		    
		    if (idade > 0) {
		    	System.out.println("idade: " + idade);
		    }  
		   
		}
		teclado.close();
	}

}
