package br.com.geekuniversity.secao11;

public class Cliente implements Comparable<Cliente>{
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + " idade="+ idade +"]";
	}
	private int idade;
	private String nome;
	private String endereco;
	
	public Cliente(int idade, String nome, String endereco) {
		// Antes //// 
		// this.nome = nomes;
		// this.enderaco = endereco;
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
		
		//this.dizer_oi();// Programajava27
	}
	// Programajava27
	private void dizer_oi() {
		System.out.println(getNome() +" está dizendo Oi. . . . .");
	}

	public String getNome() {
		return nome;
	}
    // linha 11
	private void setNome(String nome) {
		this.nome = nome;
	}
	
    // Mesmo que eu importe a classe, só é possivel utilizar esse método, dentro do proprio pacote aonde foi criado.
	protected String getEndereco() {
		return endereco;
	}
    // linha 12
	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public int compareTo(Cliente outro) {
		Cliente aux = outro;
		if(this.idade < aux.idade) {
			return -1;
		}else if(this.idade > aux.idade) {
			return 1;
		}else {
			return 0;
		}
	}


}
