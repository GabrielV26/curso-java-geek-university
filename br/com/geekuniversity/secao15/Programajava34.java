package br.com.geekuniversity.secao15;
// Atributos est�ticos

/*
 * Atributos est�ticos s�o atributos, onde os valores s�o compartilhados
 * entre as inst�ncias da classe.
 * 
 * Para utilizarmos um atributo est�tico, colocamos o nome da classe junto ao atributo.
 * 
 * Exemplo:
 * 
 * NomeDaClasse.atributo;
 * 
 */
public class Programajava34 {
	public static void main(String[] args) {
		
		Conta c1 = new Conta("Angelina Jolie");
		Conta c2 = new Conta("Felicity Jones");
		
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
