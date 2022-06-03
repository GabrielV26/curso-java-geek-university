package br.com.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Mapas / Map
 * 
 * Os mapas são representados em Java pela interface Map
 * e mapeia seus elementos utilizando o conceito de chave/valor.
 * 
 * Mapas são conhecidos como se fossem 3 COLEÇÕES.
 * - Coleção de chaves; 
 * - Coleção de valores;
 * - Coleção de associações;
 */
public class Programajava50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21, "Felicity Jones");
		pessoas.put(31, "Maria Antonieta");
		pessoas.put(51, "Angelina Julie");
		
		System.out.printf("----------------------\n");
		
		//Coleção de chaves
		System.out.println("CHAVES "+pessoas.keySet());
		//Coleção de valores
		System.out.println("VALORES "+pessoas.values());
		//Coleção de associação
		System.out.println("ASSOCIÇÃO "+pessoas.entrySet());
		
		System.out.printf("----------keySet-forEach-----------\n");
	    pessoas.keySet().forEach(idade -> {
	    	System.out.println(pessoas.get(idade));
	    });
	    
	    //          OU
	    // tive que importar o SET para funcionar, não gostei.
	    Set<Integer> chaves = pessoas.keySet();
	    for(Integer idade: chaves) {
	    	System.out.println(pessoas.get(idade));
	    }
	   
	    System.out.printf("--------Map.Entry-entrySet---------\n");
		for (Map.Entry<Integer, String> pessoa : pessoas.entrySet()) {
			Integer key = pessoa.getKey();
			String val = pessoa.getValue();
			System.out.println(key + " and " + val);
		}
		
		System.out.printf("----Com a interface Collection----\n");
		// Iterar na coleção de valores
		// Forma1
		Collection<String> valores = pessoas.values();
		for(String nome : valores) {
			System.out.println(nome);
		}
		
//		Forma 2
		pessoas.values().forEach(nome ->{
			System.out.println(nome);
		});
		
		// Iterar a coleção de associações
		// Forma 1
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao: associacoes) {
			System.out.println(associacao.getKey() + "  " + associacao.getValue());
		}
		
		// Forma 2
		pessoas.entrySet().forEach(var ->{
			System.out.println(var.getKey() + " " + var.getValue());
		});

	}

}
