package br.com.geekuniversity.secao12;
/*
 *            Beneficios da herança
 * 
 * - Evita a repetição de codigo
 * - Facilita a manutenção do programa
 */            
/*               
 * - Quando uma classe herda de outra classe ela ganha:
 *    + Todos os atributis e métodos da classe herdada.
 *
 * _____----- Essa classe é uma sub classe de Pessoa------_____
 */

                  //Herança - pessoa vira uma super classe de aluno
public class Aluno extends Pessoa{
	private String ra;
	
	public Aluno(String nome, int ano_nascimento, String ra, String email) {
		// Herança
		super(nome, ano_nascimento,email);
		this.setRa(ra);
		
	}
	
	public String getRa() {
		return ra;
	}
	private void setRa(String ra) {
		this.ra = ra;
	}
	// Parte do Polimorfismo
    // Na criação da classe é possivel observar a existencia da Super classe: java.lang.Object
	// public String toString() {
	//	return super.toString() + "\nR.A: " + this.getRa();
	//}
	// Gerado pela IDE
	@Override
	public String toString() {
		return "\nAluno: "+ ra  +"\n"+ super.toString();
	}
	// Overriding / Sobrescrita de método
	public String getNome() {
		return "Aluno: " + super.getNome(); 
	}

	// ABSTRACT ***
//	@Override
//	public void outra_mensagem(String texto) {
//		// doidera
//		System.out.println(texto);
//		
//	}
	

}