package br.com.geekuniversity.secao09;

/*
 * - O construtor de uma classe SEMPRE tem o mesmo nome da classe;
 * - Por padrão, a JVM - Java Virtual Machine, cria em tmepo de execução, um construtor padrão - um construtor vazio;
 * - Podemos ter mais de um construtor na classe;
 * 
 */

public class Programajava24 {
	public static void main(String[] args) {
		// Pessoa pessoa1 = new Pessoa(); // (método) Construtor
		// Está tudo na classe
		Pessoa pessoa1 = new Pessoa("Felicity Jones", "felicityjones@gmail.com", 1986);
		pessoa1.imprime();
	    
	}

}
