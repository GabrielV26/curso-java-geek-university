package br.com.geekuniversity.secao12;

import java.io.PrintStream;

public class Programajava28 {
	
	public static void main(String[] args) {
		
		System.out.println("--------------- Herança ----------------");
		Pessoa p1 = new Pessoa("Pedro da Silva", 1987, "pedrodasilva@gmail.com");
		
		System.out.println(p1.getNome());
		
		Aluno a1 = new Aluno("Vanessa da Silva", 2001, "123546", "vanessadaSilva@hotmail.com");
		
		System.out.println(a1.getNome());
		
		Professor pro1 = new Professor("Gabriel ", "552", 1995, "gabriel@yahoo.com.br");
		
		System.out.println(pro1.getNome() + pro1.getMatricula() +" "+ pro1.getEmail());
		
		System.out.println("--------------- Polimorfismo ----------------");
		
        Pessoa p2 = new Pessoa("Pedro da Silva2", 1987, "pedrodasilva@gmail.com");
		
		Aluno a2 = new Aluno("Vanessa da Silva2", 2001, "123546", "vanessadaSilva@hotmail.com");
		
		Professor pro2 = new Professor("Gabriel 2", "552", 1995, "gabriel@yahoo.com.br");
		
		System.out.println(p2); // to String
		
		System.out.println(a2); // to String
		
		System.out.println(pro2); // to String
		
		System.out.println(a2.getNome()); // getNome
		
		// O Polimorfismo nada mais é, que fazer as coisas de varias formas.
	}

}
