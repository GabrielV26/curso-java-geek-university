package br.com.geekuniversity.secao16;

import java.util.Scanner;

public class Programajava38 {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Informe o primeiro numero: ");
		int num1 = teclado.nextInt();
	
		System.out.printf("Informe o primeiro numero: ");
		int num2 = teclado.nextInt();
		
		try {
			divisao(num1, num2);
		} catch (Exception e) {
			System.out.println("N�o foi poss�vel executar a divis�o.");
		}
		
		teclado.close();
	}
	
	// Estou criando uma fun��o, que avisa que tem possibilidade
	// de lan�ar uma exce��o do tipo Exception.
	
	// Quando throws � utilizado ele lan�a o problema para a linha que a fun��o foi
	// chamada (17) o erro � resolvido l� e n�o na linha (31).
	public static int divisao(int n1, int n2) throws Exception{
		return n1/n2;
	}
	
	// O professor deu uma viajada, entre as Exception existentes.

}
