package br.com.geekuniversity.secao08;

import br.com.geekuniversity.secao08.Programajava21;

public class Programajava21 {

	public static void main(String[] args) {
		int valor1 = 6, valor2 = 4, res;
		
		//res = soma(valor1, valor2);
		//System.out.println("O resultado �: " + res);
		// da pra fazer direto no print
		
		System.out.println("O resultado �: " + (soma(valor1, valor2, "Ol�")));
		System.out.println(mensagem());
		
	}// Fim do m�todo main
	
	// Funcao soma com retorn
	static int soma(int v1, int v2, String msg) {
		System.out.println(msg);
		return v1 + v2;
	} // Fim da fun��o soma
	
	// Fun��o mensagem
	static String mensagem() {
		return "Parab�ns";
	}// Fim da fun��o mensagem

}// Fim da classe Programajava21
