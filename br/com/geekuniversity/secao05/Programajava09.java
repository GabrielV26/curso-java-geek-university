package br.com.geekuniversity.secao05;

import java.util.Scanner;

public class Programajava09 {

	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		// igual a do C++, porém existem outros fors
		// controle + condição de parada + incremento.
		for (int i = 0; i < 3; i++) {
		
		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Informe a idade: ");
		idade = Integer.parseInt(teclado.nextLine());
		
		System.out.println("posição: " + i);
		}
		teclado.close();
		
	}

}
