package br.com.geekuniversity.secao06;
// Operaçoes matematicas
public class Programajava15 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 9, res;
		float res2;
		
		// Soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " = " + res );
		// Subtracao
		res = num1 - num2;
		System.out.println("A Subtracao de " + num1 + " - " + num2 + " = " + res );
		// Multiplicação
		res = num1 * num2;
		System.out.println("A Multiplicação de " + num1 + " * " + num2 + " = " + res );
		// Divisão
		res2 = (float)num1 / (float)num2; // tem que fazer o cast, pra ter o resuktadi
		// em pont0o flutuante - ATENÇÃO ===+++ ++===
		System.out.println("A Divisão de " + num1 + " / " + num2 + " = " + res2 );
		
		// Módulo -
		/*
		Se o resto do módulo da variavel por 2 for 0
		significa que a variavel é par senao for 0 é impar.		
		*/
		res = num1 % 2;
		System.out.println("O módulo de " + num1 + " %  = " + res );
		
		// eu testando minha logica
		res = num2 % 3;
		System.out.println(num2 + " é divisivel por 3? " + res );
		if (res == 0) {
			System.out.println("Sim " + num2 + " é divisivel por 3");
		} else {
			System.out.println("Não");
		}
		
	}

}
