package br.com.geekuniversity.secao13;

import br.com.geekuniversity.secao12.Aluno;
import br.com.geekuniversity.secao12.Pessoa; // Mudei para ABSTRACT, não consigo usar.

// Classes abstratas (classe Pessoa), a declaração muda para: public abstract class Pessoa{ ...}

/*
 * - É um recurso que proporciona um bloqueio na criação de objetos;
 * - Não conseguimos instanciar objetos de uma classe abstrata;
 * 
 */
public class Programajava31 {

	public static void main(String[] args) {
		Aluno maria = new Aluno("Maria da Silva", 1999, "1555", "maria@gmail.com");
		
		System.out.println(maria.toString());

	}

}
