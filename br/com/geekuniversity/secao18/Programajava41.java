package br.com.geekuniversity.secao18;
/*Strigns
 * 
 * Em java, Strings S�o imut�veis, ou seja, n�o mudam.
 */

public class Programajava41 {
	public static void main(String[] args) {
		
		String curso ="Programa��o em Java: Essencial";
		
		System.out.println(curso.replace("Java", "Python"));
		
		String palavras [] = {"JavaScript", "PHP", "C#", "C++", "Ruby", "TypeScript"};
		
		for(int x = 0; x < palavras.length; x++) {
			System.out.println(curso.replace("Java", palavras[x]));
		}
		// String s�o imutaveis, para mudar de fato devemos atribuir a modifica��o.
		System.out.println(curso.toLowerCase());
		System.out.println(curso.toUpperCase());
		
		System.out.println(curso.charAt(0));
	}

}
