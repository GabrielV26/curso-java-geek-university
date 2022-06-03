package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

public class Programajava46 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(45);
		numeros.add(46);
		numeros.add(47);
		numeros.add(48);
		numeros.add(150);
		
		Collections.sort(numeros);
		
		// foreach - singular depois plural.
		for(int numero : numeros) {
			System.out.println(numero);
		}

	}

}
