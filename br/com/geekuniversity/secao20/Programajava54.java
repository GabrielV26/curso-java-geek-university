package br.com.geekuniversity.secao20;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;
/*.Thread estavel.
 * 
 * - O sincronismo ocorre pois durante a execução do método a thread executa um "LOCK"(bloqueio)
 * da função para que outra thread só possa executa-la após a finalização da thread inicial.
 * 
 */

public class Programajava54 {

	public static void main(String[] args) throws InterruptedException {
		Cliente cli1 = new Cliente(37, "Angelina Julie", "Rua 1");
		Conta conta = new Conta(1, 200, 500, cli1);
		
		FazDeposito acao = new FazDeposito(conta);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start(); 
		t2.start(); 
		
		// ADICIONAMOS UM throws: InterruptedException +++++++++++++++++++++++++
		t1.join(); //Avisando que a thread t1 deve 'se juntar' a um sicronizador
		t2.join(); //Avisando que a thread t1 deve 'se juntar' a um sicronizador
		
		// Resumo: enquanto estiver executando uma Thread, espere terminar.
		
		System.out.println(conta);

	}

}

