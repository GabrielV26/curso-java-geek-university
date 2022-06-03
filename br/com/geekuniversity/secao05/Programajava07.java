package br.com.geekuniversity.secao05;
import java.util.Scanner;

//while e do while
public class Programajava07 {

	public static void main(String[] args) {
		// Receber dados via teclado
		int idade;
		String nome;
		//      variavel
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu nome");
		
		// o final do next muda, de acordo com o tipo de dado**
		nome = teclado.nextLine();
		
		System.out.println("Informe sua idade");
		idade = teclado.nextInt();
		
		// fechamento do Scanner
	    teclado.close(); 
	    
	    System.out.println("Meu nome é " + nome);
	    System.out.println("Tenho  " + idade + " anos");

	}

}
