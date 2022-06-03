package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

import br.com.geekuniversity.secao11.Cliente;

// Listas
public class Programajava47 {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente(50,"Angelina Jolie", "Rua 1");
		Cliente cli2 = new Cliente(35,"Felicity Jones", "Rua 25");
		Cliente cli3 = new Cliente(45,"Barbara Oliveira", "Rua 26");
		
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		
		@SuppressWarnings("unchecked")
		ArrayList<Cliente> teste = (ArrayList<Cliente>) clientes.clone();
		
		Collections.sort(clientes);
		
		for(Cliente cliente: clientes) {
			System.out.println(cliente);
		}
		
		System.out.println("-------------------");
		for(Cliente cliente: teste) {
			System.out.println(cliente);
		}
	}

}
