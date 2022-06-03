package br.com.geekuniversity.secao12;
/*
 * - Classe Base, M�e, pai, super classe e ---Generica ---.
 */
//_____________________________________________________________________
// Com Classe abstrata
/*
 * Desta forma, impossibilitamos a cria��o de objetos desta classe
 * 
 * Uma classe abstrata pode ter:
 *     - atributos;
 *     - M�todos;
 *     - M�todos abstratos;
 * 
 * M�todos abstratos:
 *     - S�o m�todos, que n�o possuem implementa��o, possuem apenas
 *     declara��o, e, obrigatoriamente, as classes que herdarem desta
 *     classe com m�todos abstratos, precisa implementar estes m�todos.
 */
public class Pessoa {
	
	private String nome;
	private int ano_nascimento;
	private String email;

	public Pessoa(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}
	
	public Pessoa() {}
	
	public String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno_nascimento() {
		return ano_nascimento;
	}
	private void setAno_nascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	public String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
    
	// Parte do Polimorfismo e tamb�m um Overriding
	// Na cria��o da classe � possivel observar a existencia da Super classe: java.lang.Object
	// M�todo toString herdado de Object (passar o mause para ver)
	public String toString() {
		return "Nome: " + this.nome + "\nAno Nascimento: " + this.ano_nascimento;
	}
	
	// Parte do Overloading 1 / Ou Sobrecarga de m�todo
	// Os metodos s� podem ter o mesmo nome se houver parametros distindos.
	public void mensagem() {
		System.out.println("Esta � a minha mensagem");
	}
	// Parte do Overloading 2 / Ou Sobrecarga de m�todo
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	// Parte do Overloading 3 / Ou Sobrecarga de m�todo
	public void mensagem(String msg, int num) {
		System.out.println(msg + num);
	}
	// Parte do Overloading / Ou Sobrecarga de m�todo
	public void mensagem(int zz) {
		System.out.println(zz);
		this.mensagem();//1
		this.mensagem("mensagem 2");
		this.mensagem("Mensagem 3", zz);
	}
	
	// Declara��o de um m�todo abstrato
	// public abstract void outra_mensagem(String texto);
	// Tive que comentar, quando um m�todo abstrata � declarada, ele for�a a classe virar uma classe abstrata.
}
