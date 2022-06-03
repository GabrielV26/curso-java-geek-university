package br.com.geekuniversity.secao16;

import java.util.Scanner;

public class Programajava37 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Informe o primeiro numero: ");
		int num1 = teclado.nextInt();
	
		System.out.printf("Informe o primeiro numero: ");
		int num2 = teclado.nextInt();
		
		try {
	        System.out.println("A divisão de "+ num1 +" por "+ num2 + " = " + (num1/num2));
		} catch (ArithmeticException e) {
			System.out.println("Não é possível dividir " + num1 + " por " + num2); 
		}
		
		teclado.close();

	}

}
