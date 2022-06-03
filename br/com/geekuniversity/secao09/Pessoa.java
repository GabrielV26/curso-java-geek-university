package br.com.geekuniversity.secao09;

// Classes

// Atributos

public class Pessoa {

	String nome, email;
	int ano_nascimento;
	
	// Construtor vazio - padrao invisivel
	public Pessoa() {}
	
	// Construtor com parâmetros
	public Pessoa(String nome, String email, int ano_nasciment) {
		// this(pegue esse objeto) . nome =(adicione o valor do) parametro nome;
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nasciment;
	}
	void imprime() {
		System.out.println("+++++++++Pessoa++++++++++");
		System.out.println("Nome: "+ this.nome);
		System.out.println("Email: "+ this.email);
		System.out.println("Ano de nascimento: " + this.ano_nascimento);
	}
	
}
