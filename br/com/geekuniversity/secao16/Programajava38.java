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
			System.out.println("Não foi possível executar a divisão.");
		}
		
		teclado.close();
	}
	
	// Estou criando uma função, que avisa que tem possibilidade
	// de lançar uma exceção do tipo Exception.
	
	// Quando throws é utilizado ele lança o problema para a linha que a função foi
	// chamada (17) o erro é resolvido lá e não na linha (31).
	public static int divisao(int n1, int n2) throws Exception{
		return n1/n2;
	}
	
	// O professor deu uma viajada, entre as Exception existentes.

}
