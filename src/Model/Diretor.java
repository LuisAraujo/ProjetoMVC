package Model;

public class Diretor extends Pessoa implements TrabalhaEscola {

	Escola escola;

	public Diretor(String nome, Escola escola) {
		super(nome);
		this.escola = escola;
	}

	public Diretor(String nome) {
		super(nome);
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public Escola getEscola() {
		return this.escola;
	}
}
