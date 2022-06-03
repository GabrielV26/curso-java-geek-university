package br.com.geekuniversity.secao13;
//   Templete method
/*
 * - O padr�o Templete Method define o esqueleto de um algoritmo dentro de um m�todo
 * transferindo alguns de seus passos para as subclasses. O Template Method permite
 * que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura
 * do pr�prio algoritmo.
 * 
 * Algoritmos s�o "receitas" passo-a-passo para resolver algum problemas.
 * 
 * receber numero:
 * retornar numero * numero;
 * 
 * metodo_principal(){
 *     passo1();
 *     passo2();
 *     passo3();
 * }
 */
public class Programajava32 {

	public static void main(String[] args) {
		
		TreinamentoInicioDaTemporada timeA = new TreinamentoInicioDaTemporada();
		TreinamentoFimDaTemporada timeB = new TreinamentoFimDaTemporada();
	
		timeA.TreinoDiario();
		
	}

}
