package br.com.geekuniversity.secao06;
// tipos booleanos
public class Programajava14 {

	public static void main(String[] args) {
		
		// Tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
		// Tipos n�o primitivos
		Boolean V = true;
		Boolean F = false;
		
		System.out.println("Verdadeiro " + verdadeiro);
		System.out.println("Falso " + falso);

		System.out.println("Verdadeiro " + V);
		System.out.println("Falso " + F);
		
		// n�o preciso fazer isso verdadeiro = true, o proprio if j� esta testando isso
		if(verdadeiro) {
			System.out.println("� verdaeiro");
		} else {
			System.out.println("� falso");
		}
		
		if(1 == 3) {
			System.out.println("...� verdaeiro");
		} else {
			System.out.println(" .. . � falso");
		}
		
	}
}
