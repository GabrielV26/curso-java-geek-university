package br.com.geekuniversity.secao06;
// tipos booleanos
public class Programajava14 {

	public static void main(String[] args) {
		
		// Tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
		// Tipos não primitivos
		Boolean V = true;
		Boolean F = false;
		
		System.out.println("Verdadeiro " + verdadeiro);
		System.out.println("Falso " + falso);

		System.out.println("Verdadeiro " + V);
		System.out.println("Falso " + F);
		
		// não preciso fazer isso verdadeiro = true, o proprio if já esta testando isso
		if(verdadeiro) {
			System.out.println("É verdaeiro");
		} else {
			System.out.println("É falso");
		}
		
		if(1 == 3) {
			System.out.println("...É verdaeiro");
		} else {
			System.out.println(" .. . É falso");
		}
		
	}
}
