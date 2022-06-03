package br.com.geekuniversity.secao06;

public class Programajava13 {

	public static void main(String[] args) {
		// Tipos primitivos
		char letra1 = 'a'; // aspas simples
		char letra2 = 97;
		
		System.out.println("Letra " + letra1);
		System.out.println("Letra " + letra2);
		
		letra2 = (char) (letra2 + 1); //cast
		System.out.println("Letra " + letra2);
		
		// Tipos não primitivos
		
		Character letra3 = 'A';
		String chegou = "27042022 - Chegou o meu livro";
		
		System.out.println("Letra " + letra3);
		System.out.println(chegou);

	}

}
