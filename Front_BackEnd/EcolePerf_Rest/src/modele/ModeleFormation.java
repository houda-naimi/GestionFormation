package modele;

import java.util.ArrayList;
import java.util.List;

import dao.IMetier;


import dao.ImpFormation;

import metier.Formation;

public class ModeleFormation {
	
	
	
	private Formation formation;
	private IMetier metierFormation = new ImpFormation();
	private List<Formation> lstFormation=new ArrayList<Formation>();
	
	
	
	public Formation getFormation() {
		return formation;
	}


	public void setFormation(Formation formation) {
		this.formation = formation;
	}


	public IMetier getMetierFormation() {
		return metierFormation;
	}


	public void setMetierFormation(IMetier metierFormation) {
		this.metierFormation = metierFormation;
	}


	public List<Formation> getLstFormation() {
		return lstFormation;
	}


	public void setLstFormation(List<Formation> lstFormation) {
		this.lstFormation = lstFormation;
	}


	public Formation ajouterFormation( Formation f)
	{
		return metierFormation.ajouterFormation(f);
	}
	
	
	public List<Formation> listerFormation()
	{ 
		lstFormation=metierFormation.listFormations();
		return lstFormation;
		}
	
	///////Categorie////
	public void modifierFormation(Formation f)
	{  
		metierFormation.updateFormation(f);
	}
	
	/////////

	public void supprimerFormation(Long idF) 
	{
		metierFormation.deleteFormation(idF);
	
	}
	
	
	public Formation getFormation(Long id)
	{
		return metierFormation.getFormation(id);
	}
	

}
