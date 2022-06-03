package br.com.geekuniversity.secao14;

public class Ventilador implements IEletronico{
	private boolean ligado = false;
	
	@Override
	public void ligar() {
		if (!this.ligado) {
			this.ligado = true;
			System.out.println("~ ~ Ventilando ~ ~ ~ ");
		}
		
	}

	@Override
	public void desligar() {
		// Se for true, o if funciona.
		if (this.ligado) {
			this.ligado = false;
			System.out.println("- - - Não ventilado - - ");
		}
		
	}

}
