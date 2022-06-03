package br.com.geekuniversity.secao09;
// Classes*****************
// Classes não tem método main
/*
 * - O nome das classes inicia com letra maiúscula;
 * O nome deve contar> Acentuação, caracteres especiais, espaço
 * Nas classes Java, não existe a implementação da função main()
 * O nome da classe Java DEVE ser o mesmo nome do arquivo java.
 * Tudo que estiver dentro das chaves, faz parte da classe
 */

// Atributos***************
/*
 * São as caracteristicas da classe/molde/modelo de dados;
 * Podemos entender atributos como variaveis de classe;
 * Uma outra forma de nomenclatura para os atributos são estados;
 * Atributos são nomeados em letras minúsculas, sem espaços, sem caracteres especiais,
 * sem acentuação.
 */

// Métodos
/* Podemos entende os métodos como a ação que é realizada por um objeto da classe;
 * Podemos entender também que os métodos são comportamentos dos objetos da classe;
 * 
 * Mesmos requisitos para funções:
 * 		  a) Tipo de retorno(Tipo de dado que a função vai retornar);
		  b) Nome;
		  c) Parametros/Argumentos de entrada (Opcional)
		  d) Retorno (Opcional - depende do tipe de retorno)
 */
public class Produto {
	String nome;
	float preco2, desconto;
	
	// Método para aumentar o preço do projeto em 10
	void aumentar_preco(float valor) {
		this.preco2 = this.preco2 + valor;
	}

}
