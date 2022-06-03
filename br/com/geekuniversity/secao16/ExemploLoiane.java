package br.com.geekuniversity.secao16;
/*
 * Super classe de todos os erros no java: Throwable.
 * existe uma diferença entre ERRO e EXCEPTION.
 */
public class ExemploLoiane {

	public static void main(String[] args) {
		int numeros[] = {4, 8, 16, 32, 64, 128};
		int denominador[] = {2, 2, 0, 8, 0};
		
		for (int i = 0; i<numeros.length; i++ ) {
			try {
				System.out.println(numeros[i] + "/" + denominador[i] + "= " + (numeros[i]/denominador[i]));
			}
			// Multi-catch de exceptions similares (mesma familia).
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro ao dividir por zero ou Arrays de tamanhos distintos");
				// pegadinha de entrevista
				System.exit(0);
			}
			// Exception generica.
			catch (Throwable e) {
				System.out.println("aconteceu um erro");
				// pegadinha de entrevista
				System.exit(0);
			}
			finally {
				System.out.println("sempre executado?");
			}
		}

	}

}
