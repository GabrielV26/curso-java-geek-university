package br.com.geekuniversity.secao20;

public class GeraRelatorio implements Runnable{

	//	 sem Thead
	public void executa() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("Gerando relat�rio... Aguarde");
		}
	}

	@Override
	public void run() {
		for(int i = 0; i < 10000000; i++) {
		System.out.println(i+" Gerando relat�rio... Aguarde");
		}
	}

}
