package br.com.geekuniversity.secao09;

/*
 * - O construtor de uma classe SEMPRE tem o mesmo nome da classe;
 * - Por padr�o, a JVM - Java Virtual Machine, cria em tmepo de execu��o, um construtor padr�o - um construtor vazio;
 * - Podemos ter mais de um construtor na classe;
 * 
 */

public class Programajava24 {
	public static void main(String[] args) {
		// Pessoa pessoa1 = new Pessoa(); // (m�todo) Construtor
		// Est� tudo na classe
		Pessoa pessoa1 = new Pessoa("Felicity Jones", "felicityjones@gmail.com", 1986);
		pessoa1.imprime();
	    
	}

}
