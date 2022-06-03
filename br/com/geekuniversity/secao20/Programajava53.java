package br.com.geekuniversity.secao20;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;
/*
 * Thread n�o sincronizada, n�o serve para esse tipo de resolu��o.
 * 
 * Por padr�o as Theads n�o s�o sicronizadas. Pode ocorrer problemas de uma Thead acessar o valor
 * de um objeto que ainda n�o foi atualizado ou ainda as threads executarem depois do valor j� estar
 * impresso.
 */

public class Programajava53 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(37, "Angelina Julie", "Rua 1");
		Conta conta = new Conta(1, 200, 500, cli1);
		
		FazDeposito acao = new FazDeposito(conta);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start(); // 500 + 100 ->600 - ISSO NAO OCORRE n�o � sincronizado
		t2.start(); // 600 + 100 ->700 - ISSO NAO OCORRE
		
		System.out.println(conta);

	}

}
