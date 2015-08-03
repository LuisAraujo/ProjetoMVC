package Model;

public class Professor extends Pessoa implements TrabalhaEscola {

	Escola escola;
	String disciplina;


	public Professor(String nome) {
		super(nome);
	}
	
	public Professor(String nome, Escola escola, String disciplina) {
		super(nome);
		this.escola = escola;
		this.disciplina = disciplina;
	}
	
	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	
	public Escola getEscola() {
		return this.escola;
	}
	
	public void setDisciplina(String disciplina){
		this.disciplina = disciplina;
	}
	
	public String getDisciplina(){
		return disciplina;
	}
	
}
