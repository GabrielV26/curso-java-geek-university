package br.com.geekuniversity.secao07;

public class Programajava17 {

	public static void main(String[] args) {
		// ATENCAO - voc� n�o pode alterar a quantidade de posi��es do array, ap�s
		// ser definida no inicio do programa
		int numeros[]  = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3;
		}
		
		System.out.println(numeros[0]); // primeiro elemento
		System.out.println(numeros[9]); // ultimo elemento
		
		// Substituindo o valor do array
		numeros[0] = 55;
		System.out.println(numeros[0]);
		
		// Cada valor deve corresponder com o tipo de dado correspondente, no caso
		// do nosso array int, n�o � possivel preenchelo com valores diferentes de
		// inteiros.
		
		for(int i = 0 ; i < numeros.length ; i++) {
			//                   arredondar  - randomizar
			numeros[i] = (int)Math.round(Math.random() * 10);
		}
		
		System.out.println(numeros[0]); // primeiro elemento
		System.out.println(numeros[9]); // ultimo elemento
		
		// Imprimindo todos os valores
		System.out.println("Imprimindo todos os valores");
		for(int i = 0 ; i < numeros.length ; i++) {
			System.out.println(numeros[i]);
		}
		
		// Gerando numeros double(padr�o)
		//                  entre 0 e 1
		System.out.println(Math.random());

		System.out.println(Math.random() * 10);
		//                 mutiplicou e erredondo
		System.out.println(Math.round(Math.random() * 10));
		
		// Melhor que o da linha 35 foreach+++++++++++++++++++
		System.out.println("Foreach");
		// N�o existe condi��o de parada, enquanto existir elementos o for continua.
		for (int i : numeros) {
			System.out.println(i);
		}
	
	}

}
