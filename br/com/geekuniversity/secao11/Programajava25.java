package br.com.geekuniversity.secao11;

import java.util.Scanner;

public class Programajava25 {
	static int x;
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		//                           String nome, String endereco
		Cliente joao = new Cliente(18, "João", "Rua 1 avenida 5");
		Cliente maria = new Cliente(18, "Maria", "Rua 1 avenida 5");
		Cliente teste = new Cliente(18, "teste", "Rua 2 avenida 10");
		
        //      int numero, float saldo, float limite, Cliente cliente
		Conta conta_joao = new Conta(153, 5000, 50000, joao);
		Conta conta_maria = new Conta(152, 2500f, 10000f, maria);
		// FODA FODA FODA FODA FODA FODA
		Conta conta_teste = new Conta(25000f, 10000f, teste);
		
		System.out.printf("Cliente: " + teste.getNome() + "\nConta n°: " + conta_teste.numero + 
				"\nSaldo: " + conta_teste.getSaldo() + "\nLimite: " + conta_teste.getLimite() + "\n");
		
		//System.out.printf( "\nCliente: " + maria.nome + "\nConta n°: " + conta_maria.numero + 
			//	"\nSaldo: " + conta_maria.saldo + "\nLimite: " + conta_maria.limite);
		System.out.printf("\n\n");
		
		//
		
		// System.out.println("Saldo do(a): " + conta_joao.saldo );
		// ____________----------Em vez de acessar o atributo conta_joao.saldo, utilizamos o getter
		// __________________-------------------------------- conta_joao.getSaldo();
        
		System.out.println("Saldo da conta: " + conta_teste.getSaldo());
		
		//conta_joao.depositar(10);
		//System.out.println("Saldo do(a): " + conta_joao.getSaldo() );
		
		// Encapsulamento - MINUTAGEM 24:00 - importante
		// Capsula
		// Esse erro não pode acontecer
		// Por isso vamos usar o encapsulamento e resolver a situação
		// conta_joao.saldo = -9000; _-- --)____----opIoyuy OLHE
		// --------------------------		
		
		// conta_joao.limite = 1000000000000f;
		// System.out.println("Saldo do(a): " + conta_joao.limite );
		System.out.println("Limite da conta: " + conta_teste.getLimite());
		
		

	}

}
