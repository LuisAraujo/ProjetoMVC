package Model;

public abstract class Pessoa {

	private String nome;
	private int idade;
	
	
	protected Pessoa(String nome){
		this.nome = nome;
	}
	
	//sobrecarga
	protected Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	//Gets and Sets.	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
}
