package Controller;

import Model.Escola;
import View.EscolaView;

public class EscolaController {
   
	private Escola escolaModel;
	private EscolaView escolaView;
	
	public EscolaController(Escola escolaModel, EscolaView escolaView){
		this.escolaModel = escolaModel;
		this.escolaView = escolaView;
	}
	
	public String getNome() {
		return escolaModel.getNome();
	}

	public void setNome(String nome) {
		escolaModel.setNome(nome);
	}
	
	public void printEscolaDetalhe(){
		escolaView.printEscolaDetalhe(this.getNome());
	}
	
	
	
}
