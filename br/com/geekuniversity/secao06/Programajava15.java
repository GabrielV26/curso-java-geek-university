package br.com.geekuniversity.secao06;
// Opera�oes matematicas
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
		// Multiplica��o
		res = num1 * num2;
		System.out.println("A Multiplica��o de " + num1 + " * " + num2 + " = " + res );
		// Divis�o
		res2 = (float)num1 / (float)num2; // tem que fazer o cast, pra ter o resuktadi
		// em pont0o flutuante - ATEN��O ===+++ ++===
		System.out.println("A Divis�o de " + num1 + " / " + num2 + " = " + res2 );
		
		// M�dulo -
		/*
		Se o resto do m�dulo da variavel por 2 for 0
		significa que a variavel � par senao for 0 � impar.		
		*/
		res = num1 % 2;
		System.out.println("O m�dulo de " + num1 + " %  = " + res );
		
		// eu testando minha logica
		res = num2 % 3;
		System.out.println(num2 + " � divisivel por 3? " + res );
		if (res == 0) {
			System.out.println("Sim " + num2 + " � divisivel por 3");
		} else {
			System.out.println("N�o");
		}
		
	}

}
