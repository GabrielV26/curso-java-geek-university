package br.com.geekuniversity.secao18;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

// Object: A mãe de todas as classes
/*
 * A classe Object, faz parte do pacote java.lang
 */

public class Programajava39 {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente(18,"Angelina Jolie", "Rua 1, 234");
		Cliente cliente2 = new Cliente(19,"Felicuty Jones", "Rua 1, 234");
		
		Conta c1 = new Conta(1, 200, 300, cliente);
		Conta c2 = new Conta(2, 250, 300, cliente2);
		
		Caixa prateleira = new Caixa();
		
		//System.out.println(c1);
		//System.out.println(c2);
		
		/*
		 * EQUALS: Verifica se são o mesmo objeto.
		 */
		if (c1.equals(c2)) {
			System.out.println("São a mesma conta");
		} else {
			System.out.println("São contas diferentes");
		}
		
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		//OU Conta conta = prateleira.pegar(1);
		//                         Tem que fazer um cast pra puxa o saldo
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo());
		System.out.println(prateleira.pegar(1));
		
		// mudamos Conta por Object, agora conseguimos adicionar cliente na Caixa.
		
		prateleira.adicionar(cliente);
		prateleira.adicionar(cliente2);
		//                 
		System.out.println(((Cliente)prateleira.pegar(2)).getNome());
		//sempre retorna toString, quando chamamos a posicao do objeto, foi definido na classe Cliente.
		System.out.println(prateleira.pegar(3).toString());
		
		// O Objeto é do tipo Conta? instance of
		if ((Object)c1 instanceof Conta) {
			System.out.println("O objeto é do tipo Conta");
		} else {
			System.out.println("O objeto não é do tipo Conta");
		}
	
	}

}
