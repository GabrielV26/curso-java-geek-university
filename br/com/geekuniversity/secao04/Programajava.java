package br.com.geekuniversity.secao04;

public class Programajava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 8;
		
		if (number > 8) {
			System.out.println("O " + number + " � maior que 8");
		} else if( number == 8 ){
			System.out.println("O nemoro " + number + " � o 8");
		// Se eu utilizar else if logo abaixo, mesmo sendo verdadeira as condi��es
		// n�o existe duas saidas possoveis, ele usa apenas o primeira a ser encontrada.
		} if( number % 2 == 0){
			System.out.println("O nemoro " + number + " � par");
		} else {
			System.out.println("O nemoro " + number + " � menor que 8");
		}
		
	}

}
