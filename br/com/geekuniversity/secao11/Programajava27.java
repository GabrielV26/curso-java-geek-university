package br.com.geekuniversity.secao11;
/*
 *  = = = = = = Private -- - - - - - -
 * 
 * Praviado a própria classe
 *
 * 
 * - - - - --  - Proteceted - - - - - - - -
 * - Por padrão se não definirmos public ou private, o protected é definido. 
 * - Ele é o modificador de acesso, Default.
 * 
 * - Protected só é permitido utilizar dentro do pacote.++++++++++++++++++++
 * 
 * - O Modificador de acesso Protected faz com que
 * o elemento seja visivel somente dentro do mesmo
 * pacote onde o elemento foi declarado.
 * 
 */
public class Programajava27 {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente(18,"Felicity Jones", "Rua 1 avenita 3");
		Cliente cli2 = new Cliente(18,"Angelina jolie", "Rua 11 avenita 33");
		
		System.out.println("Nome " + cli.getNome());
		System.out.println("Endereço " + cli.getEndereco());
		
		System.out.println("Nome " + cli2.getNome());
		System.out.println("Endereço " + cli2.getEndereco());
		
		
	}

}
