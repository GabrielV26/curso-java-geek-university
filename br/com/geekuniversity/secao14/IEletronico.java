package br.com.geekuniversity.secao14;
/*
 *   Um interface pode conter:
 * 
 * - Constantes;
 * - Métodos bstratos;
 * 
 * 
 * - Interface para servir de contrato para produtos eletronicos. Todo produto eletronico que 
 * implementrar esta interface OBRIGATORIAMENTE deverão implementar os métodos abstratos.
 */

public interface IEletronico {
	
	//            CONSTANTES SEMPRE MAIUSCOLO
	public String MARCA = "Geek";
	
	public void ligar();
	
	public void desligar();

}
