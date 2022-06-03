package br.com.geekuniversity.secao16;
// Tratando exceções com try/catch
/*
 * Utilizamos o catch para capturar o erro e com isso oferecer ao usuario do sistema
 * uma mensagem adequada sem que o sistema quebre.
 * 
 */
public class Programajava36 {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3*2;
		}
		for(int i = 0; i <= numeros.length; i++) {
			try {
			    System.out.println(numeros[i]);
			} catch (java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println("Você está tentando acessar uma posição do array que não existe.");
			} finally { // FINALLY é SEMPRE EXECUTADO.
				System.out.println("Continua o processo...");
			}
		}		

	}

}
