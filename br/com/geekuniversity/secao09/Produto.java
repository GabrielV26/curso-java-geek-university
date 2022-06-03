package br.com.geekuniversity.secao09;
// Classes*****************
// Classes n�o tem m�todo main
/*
 * - O nome das classes inicia com letra mai�scula;
 * O nome deve contar> Acentua��o, caracteres especiais, espa�o
 * Nas classes Java, n�o existe a implementa��o da fun��o main()
 * O nome da classe Java DEVE ser o mesmo nome do arquivo java.
 * Tudo que estiver dentro das chaves, faz parte da classe
 */

// Atributos***************
/*
 * S�o as caracteristicas da classe/molde/modelo de dados;
 * Podemos entender atributos como variaveis de classe;
 * Uma outra forma de nomenclatura para os atributos s�o estados;
 * Atributos s�o nomeados em letras min�sculas, sem espa�os, sem caracteres especiais,
 * sem acentua��o.
 */

// M�todos
/* Podemos entende os m�todos como a a��o que � realizada por um objeto da classe;
 * Podemos entender tamb�m que os m�todos s�o comportamentos dos objetos da classe;
 * 
 * Mesmos requisitos para fun��es:
 * 		  a) Tipo de retorno(Tipo de dado que a fun��o vai retornar);
		  b) Nome;
		  c) Parametros/Argumentos de entrada (Opcional)
		  d) Retorno (Opcional - depende do tipe de retorno)
 */
public class Produto {
	String nome;
	float preco2, desconto;
	
	// M�todo para aumentar o pre�o do projeto em 10
	void aumentar_preco(float valor) {
		this.preco2 = this.preco2 + valor;
	}

}
