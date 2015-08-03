package Controller;

import Model.*;
import View.DiretorView;
import View.EscolaView;
import View.EstudanteView;
import View.ProfessorView;

public class ProjetoMVC {

	public static void main(String[] args) {
		
		Escola escolaModel = new Escola("Anisio Teixeira");
		EscolaView escolaView = new EscolaView();
		EscolaController escolaController = new EscolaController(escolaModel, escolaView);
		
		escolaController.printEscolaDetalhe();
		
		Diretor diretorModel = new Diretor("Alberto", escolaModel);	
		DiretorView diretorView = new DiretorView();
		DiretorController diretorController = new DiretorController(diretorModel, diretorView);
		
		diretorController.printDiretorDetalhe();
		
		Professor professorModel = new Professor("Ana Carla", escolaModel, "Geografia");	
		ProfessorView professorView = new ProfessorView();
		ProfessorController professorController = new ProfessorController(professorModel, professorView);
		
		professorController.printProfessorDetalhe();
		
		
		Estudante estudanteModel = new Estudante("Luis Araujo",5,escolaModel);	
		EstudanteView estudanteView = new EstudanteView();
		EstudanteController estudanteController = new EstudanteController(estudanteModel, estudanteView);
		
		estudanteController.printEstudanteDetalhe();
		
		
		
		
		

	}

}
