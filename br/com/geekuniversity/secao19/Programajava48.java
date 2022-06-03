package br.com.geekuniversity.secao19;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Conjuntos
 * 
 * Os conjuntos são implementados com a interface Set, e uma das classes
 * que implementam esta interface é a HashSet.
 * 
 * 
 * A maioria das coleções possuem os mesmos métodos já conhecidos e utilizados com
 * as listas, mas o comportamento desses objetos é um pouco diferente.
 * 
 * A performace também é melhor em conjuntos do que em listas.
 * 
 * Caracteristicas dos conjuntos:
 * - Nào aceitam valores repetidos;
 * - A ordem de inserção mão é respeitada (COLOCA EM ORDEM DA FORMA QUE O HASHSET QUER);
 * - Não aceita ordenação;
 * - Não possui indice;
 */
public class Programajava48 {

	public static void main(String[] args) {
		// Não repete igual em lista
		/*
		 * nomes.add("Maria"); nomes.add("Felicity"); nomes.add("Angelina");
		 * nomes.add("Geek"); nomes.add("Felicity");
		 * 
		 * Collections.sort(nomes);
		 * 
		 * for (String string : nomes) { System.out.println(string); }
		 */
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("Informe o " + (i+1) + "/5 nome: ");
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			if(!res) {
				System.out.println("O nome não pode ser repetido. ");
				i--;
			}
		}
		teclado.close();
		
		System.out.println("no conjunto nomes temos " + nomes.size() + " elementos");
		
		for (String string : nomes) {
			System.out.println(string);		
		}
  
	}// TOP

}
