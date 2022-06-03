package br.com.geekuniversity.secao06;
// Tipos de dados
// Numéricos (Inteiros e Reais)

public class Programajava12 {

	public static void main(String[] args) {
		// tipos primários/primitivos
		// Por padrão, os números reais em java são considerados double
		
		float preco1= 23.4f;
		double preco2 = 23.45555235658845; // double ocupa mais memoria e suporta um valor superior ao float.
		
		// Tipos não primarios/primitivos
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float - > Num1: " +  preco1);
		System.out.println("double - > Num2: " + preco2);
		System.out.println("Float - > Num3: " + preco3);
		System.out.println("Double - > Num4: " + preco4);
		// Tamanho em bits
		System.out.println("float/Float " + Float.SIZE + " bits");
		System.out.println("double/Double " + Double.SIZE + " bits");
		// Valores possíveis
		// Float
		System.out.println("Valor minimo do float/Float " + Float.MIN_VALUE);
		System.out.println("Valor máximo do float/Float " + Float.MAX_VALUE);
		// Double
		System.out.println("Valor minimo do double/Double " + Double.MIN_VALUE);
		System.out.println("Valor máximo do double/Double " + Double.MAX_VALUE);

	}

}
