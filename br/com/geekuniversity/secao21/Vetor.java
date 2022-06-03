package br.com.geekuniversity.secao21;

import java.util.Arrays;
import java.util.Iterator;

public class Vetor {
	private static int i;
	
	private Aluno alunos[] = new Aluno[100];
	
	public void adiciona(Aluno aluno) {
		alunos[i] = aluno;
		i++;
//		for(int i = 0; i < alunos.length; i++) {
//			if(alunos[i] == null) {
//				alunos[i] = aluno;
//				break;
//			}
//		}
	}
	public void adiciona(Aluno aluno, int posicao) {
		System.out.println("volume: " + Vetor.i);
		if(posicao == 0) {
			for (int i = Vetor.i -1 ; i >= posicao; i--) {
				alunos[i+1] = alunos[i];
		    }
			alunos[posicao] = aluno;
		}
		if (posicao >= 1 && posicao <=100) {
			for (int i = Vetor.i - 1 ; i >= posicao; i--) {
				alunos[i+1] = alunos[i];
			}
			alunos[posicao] = aluno;
		}
		
	}
	
	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao inválida");
		}
		return this.alunos[posicao];
	}
	
	public void remove(int posicao) {
		this.alunos[posicao] = null;
	}
	// eu que fiz + + Funcionou
	public boolean contem(Aluno aluno) {
		for(int i = 0; i < Vetor.i; i++) {
			// Feito pelo professor.
			if(aluno.equals(alunos[i])) {
				return true;
			}
            // Aqui eu comparo de uma forma mais FODA(eu fiz). Se e somente se o valor existir na posicao que esta,
			// retorna-ra true. Mesmo que o conteudo seja dentro seja o mesmo, porém em posicões distintas.
			//			int x = i;
//			if (pega(x) == aluno){
//				return true;
//			} 
		}
		return false;
	}
	
	public int tamanho() {
		return i;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.alunos);
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < Vetor.i;
	}

}
