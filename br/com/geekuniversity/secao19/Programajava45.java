package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Arrays (Vetores / Matrizes)
 * 
 * - Um array tem tamanho fixo. Ou seja, se criarmos um arrau com 5 elementos
 * ele terá sempre no maximo 5 elementos.
 * 
 * - Um array tem tipo de dado fixo. Ou seja, se criarmos um array de inteiros
 * ele só poderá ter inteiros.
 * 
 * - É dificil encontrar um determinado elemento em um array, precisamos para isso
 * varrer todo o array através do seu indice, caso não façamos busca pelo índice.
 *  
 */

/*Collections (Coleções)
 * 
 * - Java possui diversas classes/interfaces que facilitam muito o trabalho quando
 * se trata de coleções de dados. Essas classes/interfaces são chamadas de Collections (Coleções).
 * 
 */

/*Listas
 * - Aceitam repetição de valores;
 * - Possuem tamanho 'infinito' (Depende da memória);
 * - Podemos adicionar valores de qualquer tipo, desde que não informemos na declaração do objeto.
 * 
 */
public class Programajava45 {

	public static void main(String[] args) {
		//ArrayList nomes = new ArrayList(); // Sem definir tipo de dado.
		// definimos que nomes é do tipo lista(interface), *****List implementam a interface List.
		//NOME DA INTERFACE(LIST) NOME DA CLASSE(ARRYLIST).
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Mari");
		nomes.add("Felicity");
		nomes.add("Angelina");
		nomes.add("Geek");
		nomes.add("Maria");
		nomes.add("Angelina");
		
		//System.out.println(nomes.get(0));
		//System.out.println(nomes.get(1));
		
		/*
		for(int i = 0; i < nomes.size(); i++ ){
			System.out.println(nomes.get(i));
		}
		*/ 
		// Ordenar em ordem alfabética
		Collections.sort(nomes);
		//??
		for(String x : nomes) {
			System.out.println(x);
		}
		
		

	}

}
