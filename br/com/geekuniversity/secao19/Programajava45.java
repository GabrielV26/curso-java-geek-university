package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Arrays (Vetores / Matrizes)
 * 
 * - Um array tem tamanho fixo. Ou seja, se criarmos um arrau com 5 elementos
 * ele ter� sempre no maximo 5 elementos.
 * 
 * - Um array tem tipo de dado fixo. Ou seja, se criarmos um array de inteiros
 * ele s� poder� ter inteiros.
 * 
 * - � dificil encontrar um determinado elemento em um array, precisamos para isso
 * varrer todo o array atrav�s do seu indice, caso n�o fa�amos busca pelo �ndice.
 *  
 */

/*Collections (Cole��es)
 * 
 * - Java possui diversas classes/interfaces que facilitam muito o trabalho quando
 * se trata de cole��es de dados. Essas classes/interfaces s�o chamadas de Collections (Cole��es).
 * 
 */

/*Listas
 * - Aceitam repeti��o de valores;
 * - Possuem tamanho 'infinito' (Depende da mem�ria);
 * - Podemos adicionar valores de qualquer tipo, desde que n�o informemos na declara��o do objeto.
 * 
 */
public class Programajava45 {

	public static void main(String[] args) {
		//ArrayList nomes = new ArrayList(); // Sem definir tipo de dado.
		// definimos que nomes � do tipo lista(interface), *****List implementam a interface List.
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
		// Ordenar em ordem alfab�tica
		Collections.sort(nomes);
		//??
		for(String x : nomes) {
			System.out.println(x);
		}
		
		

	}

}
