package br.com.geekuniversity.secao20;
// Simula��o com a utiliza��o de Theads
public class Programajava52 {

	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		t1.run();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		Thread t2 = new Thread(relatorio);
		t2.run();

	}

}
