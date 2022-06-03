package br.com.geekuniversity.secao09;

//import OrientacaoaObjetos.Pessoa;
//import OrientacaoaObjetos.Produto;
import java.util.Scanner;
// Objetos são produtos/Instancias da classe;

public class Programajava22 {
	
	static Scanner teclado = new Scanner(System.in);
	private static String decisao;

	public static void main(String[] args) {
		
		// Declaração de um objeto/ Nãp estanciado.
		Produto p0;
		
		// Declaração e instanciação/inicialização de Objeto
		// Não preciso importar, está dentro do pacote
		//   objeto       Construtor
		Produto p1 = new Produto(); 
		
		p1.nome = "Notebook";
		p1.preco2 = 2.326f;
		p1.desconto = 1.5f;
		
		System.out.println("+++++++++Produtos++++++++++");
		System.out.println(p1.nome);
		System.out.println(p1.preco2);
		System.out.println(p1.desconto);
		
		p0 = new Produto();
		p0.nome = "Caneta Bic";
		p0.preco2 = 2.45f;
		p0.desconto = 1.30f;
		
		System.out.println(p1.nome);
		System.out.println(p1.preco2);
		System.out.println(p1.desconto);
		
		// Construtor com parametros 
		Pessoa pessoa1 = new Pessoa("Angelina Jolie", "jolie@gmail.com", 1976);
		
		// Construtor sem parametros
		/*
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Angelina Jolie";
		pessoa1.email = "jolie@gmail.com";
		pessoa1.ano_nascimento = 1976;
		 */
		
		/* Antigo Print = = = = O Novo está dentro da classe
		 *  
		System.out.println("+++++++++Pessoa++++++++++");
		System.out.println("Nome: "+ pessoa1.nome);
		System.out.println("Email: "+ pessoa1.email);
		System.out.println("Ano de nascimento: " + pessoa1.ano_nascimento);
		 * 
		 * 
		 */
	     pessoa1.imprime();
		/*
		 * 
		 * 
		 */
		// Não funciona esse merda
		if (decisao == "y") {
			System.out.println("Nao funciona essa merda");
		}

	}

}
