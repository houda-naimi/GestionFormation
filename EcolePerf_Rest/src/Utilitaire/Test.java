package Utilitaire;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.Formateur;
import metier.Formation;

import modele.ModeleFormateur;
import modele.ModeleFormation;


//FORMATION
public class Test {

	public static void main(String[] args) {
		
		/*
		try (Connection con = SingletonConnexion.getConnection()) {
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		*/
			
		ModeleFormation modeleFormation = new ModeleFormation();
		
			
			
			Formation A = new Formation(1L,"CatA","a.png","3 mois");
			Formation B = new Formation(2L,"BBB","BBB","4BBB");
			Formation C = new Formation(3L,"CCCC","CCC","5CCC");
		
		
		/*
			 modeleFormation.ajouterFormation(A);
				modeleFormation.ajouterFormation(C);
				modeleFormation.ajouterFormation(B);
			*/
	
				
			/*	
				System.out.println("********LIST FORMATIONS**********");
				
				 List<Formation> lstFormation=new ArrayList<Formation>();
			        lstFormation= modeleFormation.listerFormation();
			        for(Formation formation:lstFormation)
			        {
			        	System.out.println(formation.getIdFormation());
			        	System.out.println(formation.getTitreFormation());
			        	System.out.println(formation.getDescFormation());
			        	System.out.println(formation.getDureeFormation());
			        	System.out.println("------");
			        }	
				
				*/
				
			
			//modeleFormation.supprimerFormation(1L); 
			

		
		
			
		//	System.out.println(modeleFormation.getFormation(3L).toString());
			
		/*	
			B.setTitreFormation("WEB");
			B.setDureeFormation("4 semaines");
			B.setDescFormation("WEBwebwebweb");
			modeleFormation.modifierFormation(B);
			
			System.out.println(B.toString());
		*/
			
			
		/*	
			System.out.println("********List des Formations**********");
			
			 List<Formation> lstFormation2=new ArrayList<Formation>();
		        lstFormation2= modeleFormation.listerFormation();
		        for(Formation formation:lstFormation2)
		        {
		        	System.out.println(formation.getIdFormation());
		        	System.out.println(formation.getTitreFormation());
		        	System.out.println(formation.getDescFormation());
		        	System.out.println(formation.getDureeFormation());
		        	System.out.println("------");
		        } 
			
			*/
			
			////////////////////////////////FORMATEUR///////////////////////////////////////////////
			
			
			
			ModeleFormateur modeleFormateur = new ModeleFormateur();
		        
		        Formateur form1=new Formateur(8L,"prod8","foulen","prod8.png","25414","mourouj","civp",B);
		        //Formateur form2=new Formateur(6L,"prod8","foulen","prod8.png","25414","mourouj","civp",B);
		        Formateur form3=new Formateur(7L,"prod8","foulen","prod8.png","25414","mourouj","civp",B);
				
				/*
				modeleFormateur.ajouterFormateur(form1);
				//modeleFormateur.ajouterFormateur(form2);
				modeleFormateur.ajouterFormateur(form3);
				*/
				
		        //form1.setFormation(B);
				
				
				
				
				form1.setContrat("CDI");
				
				
				modeleFormateur.modifierFormateur(form1);
				//modeleFormateur.modifierFormateur(prod2);
				
				
				modeleFormateur.supprimerFormateur(7L);
				
				System.out.println(modeleFormateur.getFormateur(8L));
				
				System.out.println("******List Formateur par formation************");
				
				List<Formateur> lstform=new ArrayList<Formateur>();
				 lstform= modeleFormateur.FormateursParFormation(2L);
			        for(Formateur prod:lstform)
			        {
			        	System.out.println(prod.getIdFormateur());
			        	System.out.println(prod.getNom());
			        	System.out.println(prod.getPrenom());
			        	System.out.println(prod.getTel());
			        	System.out.println(prod.getEmail());
			        	System.out.println(prod.getAdresse());
			        	System.out.println(prod.getContrat());
			        	System.out.println(prod.getFormation().getIdFormation());
			        	System.out.println("------");
			        }
			        
			        
			       
			        
			        
			        
				
				System.out.println("********List Formateur **********");
			
		
				List<Formateur> lstformList=new ArrayList<Formateur>();
				lstformList= modeleFormateur.listerFormateur();
			        for(Formateur prod:lstformList)
			        {
			        	System.out.println(prod.getIdFormateur());
			        	System.out.println(prod.getNom());
			        	System.out.println(prod.getPrenom());
			        	System.out.println(prod.getTel());
			        	System.out.println(prod.getEmail());
			        	System.out.println(prod.getAdresse());
			        	System.out.println(prod.getContrat());
			        	System.out.println(prod.getFormation().getIdFormation());
			        	System.out.println("------");
			        } 
		        
		      
			
			
		
			
		

		}
	

	}


