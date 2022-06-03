package br.com.geekuniversity.secao12;

/*
 * - Overloading -
 * 
 * - Ocorre quando, sobrescrevemos um método na mesma classe de declaração.
 * 
 * - Olha o exemplo na classe Pessoa, linha 18
 * 
 */
public class Programajava29 extends Pessoa{

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.mensagem();
		
		p1.mensagem("Esta é minha outra mensagem");
		
		p1.mensagem(5);
	}


}
