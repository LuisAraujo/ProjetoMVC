package Model;

public class Estudante extends Pessoa{
	
	int anoEscolar;
	Escola escola;
	
	public Estudante(String nome) {
		super(nome);
    }
	
	public Estudante(String nome, int anoEscolar, Escola escola) {
		super(nome);
		this.anoEscolar = anoEscolar;
		this.escola = escola;
    }
	
	public  void setAnoEscolar(int anoEscolar){
		this.anoEscolar = anoEscolar;
	}
	
	public  int getAnoEscolar(){
		return this.anoEscolar;
	}
	
	public void setEscola(Escola escola){
		this.escola = escola;
	}
	
	public  Escola getEscola(){
		return this.escola;
	}
	
}
