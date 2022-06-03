package br.com.geekuniversity.secao12;
/*
 * - Classe Base, Mãe, pai, super classe e ---Generica ---.
 */
//_____________________________________________________________________
// Com Classe abstrata
/*
 * Desta forma, impossibilitamos a criação de objetos desta classe
 * 
 * Uma classe abstrata pode ter:
 *     - atributos;
 *     - Métodos;
 *     - Métodos abstratos;
 * 
 * Métodos abstratos:
 *     - Sào métodos, que não possuem implementação, possuem apenas
 *     declaração, e, obrigatoriamente, as classes que herdarem desta
 *     classe com métodos abstratos, precisa implementar estes métodos.
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
    
	// Parte do Polimorfismo e também um Overriding
	// Na criação da classe é possivel observar a existencia da Super classe: java.lang.Object
	// Método toString herdado de Object (passar o mause para ver)
	public String toString() {
		return "Nome: " + this.nome + "\nAno Nascimento: " + this.ano_nascimento;
	}
	
	// Parte do Overloading 1 / Ou Sobrecarga de método
	// Os metodos só podem ter o mesmo nome se houver parametros distindos.
	public void mensagem() {
		System.out.println("Esta é a minha mensagem");
	}
	// Parte do Overloading 2 / Ou Sobrecarga de método
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	// Parte do Overloading 3 / Ou Sobrecarga de método
	public void mensagem(String msg, int num) {
		System.out.println(msg + num);
	}
	// Parte do Overloading / Ou Sobrecarga de método
	public void mensagem(int zz) {
		System.out.println(zz);
		this.mensagem();//1
		this.mensagem("mensagem 2");
		this.mensagem("Mensagem 3", zz);
	}
	
	// Declaração de um método abstrato
	// public abstract void outra_mensagem(String texto);
	// Tive que comentar, quando um método abstrata é declarada, ele força a classe virar uma classe abstrata.
}
