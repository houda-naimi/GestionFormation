package modele;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import dao.IMetier;

import dao.ImpFormateur;

import metier.Formateur;

@XmlRootElement
public class ModeleFormateur {
	
private Formateur form;
	
	private IMetier metierForm=new ImpFormateur();
	
	private ArrayList<Formateur> lstForm=new ArrayList<Formateur>();

	public Formateur getForm() {
		return form;
	}

	public void setForm(Formateur form) {
		this.form = form;
	}

	public IMetier getMetierprod() {
		return metierForm;
	}

	public void setMetierprod(IMetier metierprod) {
		this.metierForm = metierprod;
	}

	public ArrayList<Formateur> getLstForm() {
		return lstForm;
	}

	public void setLstForm(ArrayList<Formateur> lstForm) {
		this.lstForm = lstForm;
	}
	
	
	

	public Formateur ajouterFormateur(Formateur form)
	{
		return metierForm.ajouterFormateur(form);
	}
	
	
	public ArrayList<Formateur> listerFormateur()
	{ 
		lstForm=(ArrayList<Formateur>) metierForm.listFormateurs();
		return lstForm;
		}
	
	
	public Formateur modifierFormateur(Formateur p)
	{  
		return metierForm.updateFormateur(p);
	}

	public void supprimerFormateur(Long idP) 
	{
		metierForm.deleteFormateur(idP);
	}
	
	
	public Formateur getFormateur(Long id)
	{
		return metierForm.getFormateur(id);
	}
	
	
	
	
	public List<Formateur> FormateursParFormation(Long idC)
	{
		lstForm=metierForm.FormateursParFormation(idC);
	return lstForm;
	}
	
	
	
	
	
	
	
	
	
	

}
