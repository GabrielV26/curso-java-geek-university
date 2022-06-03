package br.com.geekuniversity.secao18;
// Math
/*
 * A biblioteca Math possui vários métodos e constantes estáticas
 * para que possamos utilizar nos nosso programas.
 */
public class Programajava40 {
	
	public static void main(String[] args) {
		int x = 5;
		
		System.out.println(Math.E); // constante
		System.out.println(Math.PI); // constante
		
		// seno cosseno e tangente
		System.out.println(Math.sin(45));
		System.out.println(Math.cos(45));
		System.out.println(Math.tan(45));
		
		// Arredondamentos
		System.out.println(Math.round(Math.PI));
		System.out.println(Math.ceil(Math.PI));
		System.out.println(Math.floor(Math.PI));
		
		// Elevando numeros e arredondando
		System.out.println(Math.pow(3, 2));
		System.out.println(Math.round(Math.pow(3, 2)));
		System.out.println(Math.floor(Math.pow(3, 2)));
		System.out.println(Math.sqrt(9));
	}

}
