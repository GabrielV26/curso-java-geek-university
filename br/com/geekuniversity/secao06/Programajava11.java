package br.com.geekuniversity.secao06;
// Tipos de dados Numéricos(inteiros e reais)
public class Programajava11 {
	
	public static void main(String[] args) {
		// Tipos primários/primitivos
		
		long num0 = 999999999; // valor do long em bits é 64, superior ao int de 32.
		int num1 =  999999999; // Inteiro - padrão.
		short num2 = 4561; // Inteiro menor - usa menos memoria, pois acumula até 4 digitos..
		byte num3 = 5; // menor que o short
		char num8 = 66;
		
		// Tipos não primarios/primitivos
		Long num7 = (long) 999999999; // tive que fazer um CAST
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = -8; // menor que o short
		Character num9 = 5; // quando colocamos um valor numérico em variaveis desse tipo,
		// retorna a tabela ASCCI
		
		System.out.println("long - > Num0: " + num0);
		System.out.println("int - > Num1: " + num1);
		System.out.println("short - > Num2: " + num2);
		System.out.println("byte - > Num3: " + num3);
		System.out.println("Integer - > Num4: " + num4);
		System.out.println("Short - > Num5: " + num5);
		System.out.println("Byte - > Num6: " + num6);
		System.out.println("Long - > Num7: " + num7);
		System.out.println("char - > Num7: " + num8);
		System.out.println("Character - > Num7: " + num9);
		
		// Verificar o tamanho em bits
		System.out.println("long/Long " + Long.SIZE + " bits");
		System.out.println("int/Integer " + Integer.SIZE + " bits");
		System.out.println("shor/Short " + Short.SIZE + " bits");
		System.out.println("byte/Byte " + Byte.SIZE + " bits");
		System.out.println("char/Character " + Character.SIZE + " bits");
		
		// Valores possíveis Int/Integer
		System.out.println("Valor minimo do int/Integer " + Integer.MIN_VALUE);
		System.out.println("Valor máximo do int/Integer " + Integer.MAX_VALUE);
		// byte/Byte
		System.out.println("Valor minimo do byte/Byte " + Byte.MIN_VALUE);
		System.out.println("Valor máximo do byte/Byte " + Byte.MAX_VALUE);
		// short/Short
		System.out.println("Valor minimo do short/Short " + Short.MIN_VALUE);
		System.out.println("Valor máximo do short/Short " + Short.MAX_VALUE);
		// long/Long
		System.out.println("Valor minimo do long/Long " + Long.MIN_VALUE);
		System.out.println("Valor máximo do long/Long " + Long.MAX_VALUE);
		// char/Character / 
		System.out.println("Valor minimo do char/Character " + Character.MIN_VALUE); // 0
		System.out.println("Valor máximo do char/Character " + Character.MAX_VALUE); // 255
		
	}

}
