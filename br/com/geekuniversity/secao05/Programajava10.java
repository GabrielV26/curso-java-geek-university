package br.com.geekuniversity.secao05;

// Foreach - Para cada
public class Programajava10 {

	public static void main(String[] args) {
		String letras = "Geek University";
		
		// Para cada um dos caracteres da string, imprima o caractere.
		for (char letra : letras.toCharArray()) {
			// o println é para mudar de linha.
			System.out.println(letra);
		}

	}

}
