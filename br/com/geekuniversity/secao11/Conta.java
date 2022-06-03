package br.com.geekuniversity.secao11;
/*
 * Para utilizar o conteudo private, temos que utilizar Getters e Setters

 * 
 * Getter
 *  - é um método público, que serve para consultar dados;
 *  - A nomeclatura desses métodos é getNome_do_atributo()
 *  
 *  Public 
 *  É um modificador de acesso
 *  As classes são sempre public, agora os atributos podem ter qualquer tipo de modificador de acesso.
 *  Para poder acessaro os dados da classe Conta em outro programa fora do pacote, devemos importar e deixar
 *  as variaveis public
 *  
 *  Private
 *  
 *  privado a propria classe
 */
import java.util.Scanner;

public class Conta {
	int numero;
	private float saldo;
	private float limite;
	private float gambi;

	// Chama a classe Cliente e atribuia a variavel com o nome cliente para ser usado nessa classe Conta.
	Cliente cliente;
	
	static Scanner teclado = new Scanner(System.in);
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
		//System.out.println("chamei o construtor com 3 parametros");
	}

	public Conta(float saldo, float limite, Cliente cliente) {
		this(3203, saldo, limite, cliente);
		//System.out.println("chamei o construtor com 2 parametros");
	}
	
	public void sacar(int validar, float valor) {
		if (validar == 1 ) {
			this.saldo = (this.saldo + this.limite) - valor;
			this.gambi = this.saldo;
			this.saldo = this.saldo - this.saldo;
			this.limite = this.gambi;
			System.out.println("Saque realizado com sucesso");
		}
		if (valor <= this.saldo && valor > 0) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado com sucesso.");
		}
		
	}
	// FORMA 1 
	public void depositar(float valor) {
		// Theads sincronizadas
		synchronized (this) {
			this.saldo = this.saldo + valor;
		}
	}
	// FOMRA 2
	public synchronized void depositarr(float valor) {
		this.saldo = this.saldo + valor;
	}
	/**
	 *  Método getter do atributo saldo.
	 * @return o valor do saldo.
	 */
	public float getSaldo() {
		return this.saldo;
	}
	/**
	 * Método getter do atributo limite.
	 * @return o valor do limite.
	 */
	public float getLimite() {
		return this.limite;
	}

	@Override
	public String toString() {
		return "O saldo da conta é " + getSaldo(); 
	}
	
	@Override
	public boolean equals(Object obj) {
		// O objeto é do tipo Conta?
		if (!(obj instanceof Conta)) {
			return false;
		} else {
		// Explicação: Considera esse cara aqui (obj) como uma Conta(objeto Conta) e armazena em verificar. 
		Conta verificar = (Conta) obj; // WTF?
		return verificar.getSaldo() == this.getSaldo();
		}
	}

}
