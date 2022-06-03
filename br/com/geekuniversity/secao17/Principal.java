package br.com.geekuniversity.secao17;
/*
 * Gerando executáveis jar
 * 
 * JAR - Java Archive
 * 
 * Archive - Arquivo Compactado Java
 */

import java.util.Scanner;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Principal {
	
	static Cliente cliente = new Cliente(18, "Angelina Jolie", "Rua da paz 45");
	static Conta conta = new Conta(1, 200, 300, cliente);
	static Scanner teclado = new Scanner(System.in);
	
    /**
     * Método para realizar deposito
     * 
     * @param valor a ser depositado.
     */
	public static void depositar() {
		System.out.println("============= Depósito =============");
		System.out.println("Informe o valor para depósito: ");
		float valor = teclado.nextFloat();
		if (valor > 0) {
			conta.depositar(valor);
			System.out.println("Depósito efetuado com sucesso.");
		} else {
			System.out.println("O valor precisa ser positivo.");
		}
	}
	public static void sacar() {
		System.out.println("============= Saque =============");
		System.out.println("Informe o valor para saque: ");
		float valor = teclado.nextFloat();
		
		if (valor > conta.getSaldo() && valor < conta.getLimite()) {
		    System.out.printf("Valor superior ao inexistente em conta, Se continuar entrará no cheque especial com o "
				+ "saldo disponivel de + R$ " + conta.getLimite() + "\n Digite [1] para continuar ou [0] para sair: ");
		    int x = teclado.nextInt();
		    
		    if (x == 1 ) {
		    	System.out.println("passou");
		    	conta.sacar(x, valor);
		    	} 
		} else if(valor > 0) {
			conta.sacar(0, valor);
		}

	}
	public static void consultar() {
		System.out.println("Seu saldo é " + conta.getSaldo() + "\ne Limite do cheque especial é " + conta.getLimite());
	}
	
	public static void main(String[] args) {
		
		int opcao = 0;
		
		do {
			System.out.println("Selecione uma opção abaixo: ");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Consultar Saldo");
			System.out.println("0 - Sair");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1: 
				depositar();
				break;
			case 2: 
				sacar();
				break;
			case 3: 
				consultar();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção inválida. ");
				break;
			}
		} while (opcao > 0);
		teclado.close();
	
	}
}
