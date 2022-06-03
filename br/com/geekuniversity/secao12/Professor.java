package br.com.geekuniversity.secao12;

public class Professor extends Pessoa{
	private  String matricula;
	
	Professor(String nome, String matricula, int ano_nascimento, String email){
		super(nome, ano_nascimento,email);
		this.setMatricula(matricula);
	
	}

	public String getMatricula() {
		return matricula;
	}

	private void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	// Parte do Polimorfismo + Overriding
    // Na criação da classe é possivel observar a existencia da Super classe: java.lang.Object
	public String toString() {
		return super.toString() + "\nMatricula: " + getMatricula();
	}
	// Overriding
	// <<<<<<<---------------- A SETA verde dentro da IDE indicando que é overriding.
	// Overriding / Sobrescrita de método
	public String getNome() {
		return "Professor " + super.getNome(); 
	}
	// ABSTRACT ***
//	@Override
//	public void outra_mensagem(String texto) {
//		System.out.println(texto);
//		
//	}
}
