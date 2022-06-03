package br.com.geekuniversity.secao15;
/*
 * Um m�todo est�tico, n�o depende de uma inst�ncia da classe
 * para ser utilizada.
 * 
 * Pode-se utilizar conforme:
 * 
 * NomeDaClasse.metodo();
 */
public class Programajava35 {
	
	public static void main(String[] args) {
		Conta c1 = new Conta("Angelina J ly");
		Conta c2 = new Conta("Felicity J Jones");
		
		System.out.println(c1);
		System.out.println(c2);
		
		// M�todos est�ticos, N�o dependemos de instancia para utiliza-lo, apenas do nome da classe.
		System.out.println(Conta.proximaConta());

	}

}
