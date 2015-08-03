package Controller;

import Model.Escola;
import Model.Professor;
import View.ProfessorView;

public class ProfessorController {

	
	private Professor professorModel;
	private ProfessorView professorView;
	
	public ProfessorController(Professor professorModel, ProfessorView professorView){
		this.professorModel = professorModel;
		this.professorView = professorView;	
	}
	
	public void setEscola(Escola escola) {
		professorModel.setEscola(escola);
	}

	public String getEscola() {
		return professorModel.getEscola().getNome();
	}
	
	public String getNome(){
		return professorModel.getNome();
	}
	
	public String getDisciplina(){
		return professorModel.getDisciplina();
	}
	
	
	public void printProfessorDetalhe(){
		professorView.printProfessorDetalhe(this.getNome(), this.getEscola(), this.getDisciplina());	
	}
}
