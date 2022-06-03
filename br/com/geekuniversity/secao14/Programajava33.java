package br.com.geekuniversity.secao14;

//   Interfaces - O que � e quando utilizar

/*
 * - Interfaces s�o conhecidas como "contratos".
 *  
 * - Um empresa criou um contrato "Com regras" para definir
 * a cria��o de um produto/servi�o.
 * 
 * - O jo�o, decidiu implementar um produto/servi�o baseado neste contrato.
 * - A Maria, tamb�m decidiu implementar um produto/servi�o baseado no mesmo contrato.
 * 
 * Contrato para a confec��o de um bolo.
 * 
 *     - O bolo precisa ser de chocolate;
 *     - O bolo deve ter cobertura;
 *     - O bolo deve ser recheado;
 */
public class Programajava33 {

	public static void main(String[] args) {
		Ventilador Ventilador = new Ventilador();
		
		System.out.println("A marca do ventilador � " + IEletronico.MARCA);
		
		Ventilador.desligar(); // N�o deve imprimir a mensagem
		
		Ventilador.ligar(); // Imprime a mensagem
		
		Ventilador.desligar(); // Imprime a mensagem

	}

}
