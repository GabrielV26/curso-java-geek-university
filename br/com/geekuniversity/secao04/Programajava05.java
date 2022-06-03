package br.com.geekuniversity.secao04;

public class Programajava05 {
	
	public static void main(String[] args) {
		int valor = 1, number;
		
		if(valor > 0) {
			number = valor;
		} else {
			number = 7;
		}
		System.out.println("O resultado é " + number);
	// Operador ternário é um if else simples verdadeiro ou falso
		valor = -5000;
		
		number = (valor > 0) ? valor : 7; 
		
		System.out.println("O resultado é " + number);
	}
	
}
