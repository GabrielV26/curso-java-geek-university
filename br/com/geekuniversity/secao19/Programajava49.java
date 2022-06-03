package br.com.geekuniversity.secao19;

import java.util.HashMap;
import java.util.Map;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

/*
 * HashMap
 * 
 * A Classe HashMap implementa a interface Map e trabalha com o conceito chave/valor;
 * 
 * Não aceita chaves duplicadas, mas valores sim.
 */
public class Programajava49 {

	public static void main(String[] args) {
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Cliente cli1 = new Cliente(15,"Angelina Jolie", "Rua 1");
		Cliente cli2 = new Cliente(16,"Felicity Jones", "Rua 2");
		
		Conta c1 = new Conta(1, 300, 400, cli1);
		Conta c2 = new Conta(2, 200, 7000, cli2);
		
		contas.put("Pessoa Fisica", c1);
		contas.put("Pessoa Juridica", c2);
		
		System.out.println(contas.get("Pessoa Fisica"));
		System.out.println(contas.get("Pessoa Juridica"));

	}

}
