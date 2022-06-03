package br.com.geekuniversity.secao20;

public class BarraDeProgresso implements Runnable{
	
	// sem Thead
	public void executa() {
		for(int x = 0 ; x < 1000 ; x++) {
			System.out.println("Barra de progresso... Aguarde");
		}
	}

	@Override
	public void run() {
		for(int x = 0 ; x < 10000000; x++) {
		System.out.println(x +" Barra de progresso... Aguarde");
		}
	}
	
	

}
