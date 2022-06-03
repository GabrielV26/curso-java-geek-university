package br.com.geekuniversity.secao15;

public class Conta {
	private int numero;
	private String cliente;
	
	public static int contador = 1;
	
	public Conta(String cliente ) {
		this.numero = contador;
		this.cliente = cliente;
		Conta.contador = Conta.contador + 1;
	}

	public int getNumero() {
		return numero;
	}

	public String getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", cliente=" + cliente + "]";
	}
	// métodos estáticos
	public static int proximaConta() {
		return contador;
	}
	
}
