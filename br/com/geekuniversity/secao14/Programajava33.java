package br.com.geekuniversity.secao14;

//   Interfaces - O que é e quando utilizar

/*
 * - Interfaces são conhecidas como "contratos".
 *  
 * - Um empresa criou um contrato "Com regras" para definir
 * a criação de um produto/serviço.
 * 
 * - O joão, decidiu implementar um produto/serviço baseado neste contrato.
 * - A Maria, também decidiu implementar um produto/serviço baseado no mesmo contrato.
 * 
 * Contrato para a confecção de um bolo.
 * 
 *     - O bolo precisa ser de chocolate;
 *     - O bolo deve ter cobertura;
 *     - O bolo deve ser recheado;
 */
public class Programajava33 {

	public static void main(String[] args) {
		Ventilador Ventilador = new Ventilador();
		
		System.out.println("A marca do ventilador é " + IEletronico.MARCA);
		
		Ventilador.desligar(); // Não deve imprimir a mensagem
		
		Ventilador.ligar(); // Imprime a mensagem
		
		Ventilador.desligar(); // Imprime a mensagem

	}

}
