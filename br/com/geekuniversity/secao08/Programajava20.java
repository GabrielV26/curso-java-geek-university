package br.com.geekuniversity.secao08;
import java.util.Scanner;
// Funções em java - Criado nossas próprias funcões
/*
 * Faça um programa, que receba diversos nomes de frutas do usuario e
 * no final imprima essas furtas em ordem contrária. O programa deve solicitar
 * ao usuario quantas frutas ele quer informar.
 */
public class Programajava20 
{
    // Declarção do vetor dentro da casse \ escopo de variavel
    static String nomes_de_frutas[];
    // Declaraçào da var teclado foda do mais, dentrro da classe	
    static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.printf("%s%n%s%n%s%n%s","Informe", "a quantidade", "de frutas", "para cadastrar: ");
		int x = teclado.nextInt();
		
		// Função, recebendo x como dado
		cadastrar_dados(x);
		mostrar_dados();
		
		/*
		 * Declaração de funções
		 * 
		 * Uma funcão deve ter o seguinte:
		 * a) Tipo de retorno(Tipo de dado que a função vai retornar);
		 * b) Nome;
		 * c) Parametros/Argumentos de entrada (Opcional)
		 * d) Retorno (Opcional - depende do tipe de retorno)
		 *
		 */
	}
	
	static void cadastrar_dados(int quantidade) {
		
		nomes_de_frutas = new String[quantidade];
		
		for(int i = 0; i < nomes_de_frutas.length ; i++) {
			
			System.out.printf("Preencha o nome da " + (i+1) + ".º fruta : ");
			Scanner teclado = new Scanner(System.in); 
			
			nomes_de_frutas[i] = teclado.nextLine();

			if(i == nomes_de_frutas.length) {
				teclado.close();
			}
		}
	}
	
	static void mostrar_dados() {
		for(int i = nomes_de_frutas.length-1; i >= 0 ; i--) {
			System.out.println("Na posição "+ (i+1) + " está a fruta: " + nomes_de_frutas[i]);
			}
	}
	
	
}
