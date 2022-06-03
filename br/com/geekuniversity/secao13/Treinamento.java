package br.com.geekuniversity.secao13;

// O professor disse que não existe o objeto Treinamento, existe os objetos:
// TreinamentoInicioDaTemporada e TreinamentoFimDaTemporada, isso torna essa classe ABSTRATA.

// Templete Method
public abstract class Treinamento {
	
	// - Templete Method
	//     Final é um modificador de acesso que faz com que o elemento que esteja utilizando, não possa ser
    //     extendido/reescrito. (FINAL - NÃO PODE SER SOBRESCRITO _ _ _ - - -- 
	public final void TreinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino tático....");
	}

}
