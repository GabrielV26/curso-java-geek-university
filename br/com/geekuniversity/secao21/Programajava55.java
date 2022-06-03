package br.com.geekuniversity.secao21;

import java.util.Iterator;

/*Armazenamento sequencial
 * 
 * int numeros[] new int[5];
 * 
 * numeros[0] = 1;
 * numeros[1] = 2;
 * numeros[2] = 3;
 * numeros[3] = 4;
 */
public class Programajava55 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Angelina");
		Aluno a2 = new Aluno("Felicity");
		Aluno a3 = new Aluno("Angelin121221");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista);
		// Eu que fiiz
		System.out.println(lista.contem(a3));
		
		System.out.println(lista.tamanho());
		//????
		lista.adiciona(a3, 1);
		System.out.println(lista);
		
		// OK
		try {
			System.out.println(lista.pega(50));
		} catch (IllegalArgumentException e) {
			System.out.println("onde pensa que vai?");
			System.out.println(e.getLocalizedMessage());
		}
		

	}

}
