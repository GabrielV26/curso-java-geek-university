package br.com.geekuniversity.secao18;
/*Strigns
 * 
 * Em java, Strings Sào imutáveis, ou seja, não mudam.
 */

public class Programajava41 {
	public static void main(String[] args) {
		
		String curso ="Programação em Java: Essencial";
		
		System.out.println(curso.replace("Java", "Python"));
		
		String palavras [] = {"JavaScript", "PHP", "C#", "C++", "Ruby", "TypeScript"};
		
		for(int x = 0; x < palavras.length; x++) {
			System.out.println(curso.replace("Java", palavras[x]));
		}
		// String são imutaveis, para mudar de fato devemos atribuir a modificação.
		System.out.println(curso.toLowerCase());
		System.out.println(curso.toUpperCase());
		
		System.out.println(curso.charAt(0));
	}

}
