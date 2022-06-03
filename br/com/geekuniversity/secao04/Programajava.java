package br.com.geekuniversity.secao04;

public class Programajava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 8;
		
		if (number > 8) {
			System.out.println("O " + number + " é maior que 8");
		} else if( number == 8 ){
			System.out.println("O nemoro " + number + " é o 8");
		// Se eu utilizar else if logo abaixo, mesmo sendo verdadeira as condições
		// não existe duas saidas possoveis, ele usa apenas o primeira a ser encontrada.
		} if( number % 2 == 0){
			System.out.println("O nemoro " + number + " é par");
		} else {
			System.out.println("O nemoro " + number + " é menor que 8");
		}
		
	}

}
