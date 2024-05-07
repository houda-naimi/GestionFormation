package dao;

import java.util.ArrayList;
import java.util.List;

import metier.Formateur;
import metier.Formation;

public interface IMetier {
	
	
	
	
	public Formation  ajouterFormation(Formation f);
	public List<Formation> listFormations();
	public Formation updateFormation(Formation f);
	public void deleteFormation(Long id);
	public Formation getFormation(Long idf);
	
	
	
	public Formateur  ajouterFormateur(Formateur f);
	public List<Formateur> listFormateurs();
	public Formateur updateFormateur(Formateur f);
	public void deleteFormateur(Long id);
	public Formateur getFormateur(Long idf);
	public ArrayList<Formateur> FormateursParFormation(Long id);
	
	
	
	
	
	


	
	
	
	
	

}
