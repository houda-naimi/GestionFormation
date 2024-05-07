package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utilitaire.SingletonConnexion;

import metier.Formateur;
import metier.Formation;




public class ImpFormateur implements IMetier {
	
	private Connection connexion=SingletonConnexion.getConnection();



	@Override
	public Formateur ajouterFormateur(Formateur f) {
		try {
			
			
			PreparedStatement ps=connexion.prepareStatement ("insert into formateur (idFormateur,nom,prenom,tel,email,adresse,contrat,idFormation )values(?,?,?,?,?,?,?,?)");
			ps.setLong(1,f.getIdFormateur());
			ps.setString(2, f.getNom());
			ps.setString(3, f.getPrenom());
			ps.setString(4,f.getTel());
		    ps.setString(5,f.getEmail());
		    ps.setString(6,f.getAdresse());
		    ps.setString(7,f.getContrat());
		    
		   // ps.setLong(8,Long.valueOf(f.getFormation().getIdFormation()));
		    ps.setLong(8,f.getIdFormation());
		   
		    ps.executeUpdate();
		    ps.close();
		    
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return f;
	}
	
	
	
	
	
	
	
	

	@Override
	public List<Formateur> listFormateurs() {
			ArrayList<Formateur> lst=new ArrayList<Formateur>();
		
		
		try { 
			PreparedStatement ps=connexion.prepareStatement("select * from formateur");
	       ResultSet rs=ps.executeQuery();
	       while(rs.next())
	       { Formateur p=new Formateur();
	       Formation c = new Formation();
	      
	       
	    	   p.setIdFormateur(rs.getLong(1));
	    		p.setNom(rs.getString(2));
	    		p.setPrenom(rs.getString(3));
	    		
	    	   p.setTel(rs.getString(4));
	    	   p.setEmail(rs.getString(5));
	    	   p.setAdresse(rs.getString(6));
	    	   p.setContrat(rs.getString(7));
	    	   
	    	   c.setIdFormation(rs.getLong(8));
	    	  p.setFormation(c);
	    	   
	    	   
	    	   lst.add(p);
	       }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
	}

	@Override
	public Formateur updateFormateur(Formateur f) {
		
		try {
			PreparedStatement ps= connexion.prepareStatement("UPDATE formateur SET nom=?,prenom=?,tel=?,email=?,adresse=?,contrat=?,idFormation=? WHERE idFormateur=?");
			
			ps.setString(1,f.getNom());
		    ps.setString(2,f.getPrenom());
		    ps.setString(3,f.getTel());
		    ps.setString(4,f.getEmail());
		    ps.setString(5,f.getAdresse());
		    ps.setString(6,f.getContrat());
		    
		    ps.setLong(7,f.getFormation().getIdFormation());
		    ps.setLong(8,f.getIdFormateur());
		    
			ps.executeUpdate();
			ps.close();
			
			
			} catch (SQLException e1) {
			e1.printStackTrace();
			}
		return f;
	}

	@Override
	public void deleteFormateur(Long id) {
		
		try {
			PreparedStatement ps= connexion.prepareStatement("DELETE FROM formateur where idFormateur=?");
			
			ps.setLong(1, id);
			ps.executeUpdate();
			ps.close();
		
			} 
		
		catch (SQLException e) {
			e.printStackTrace();
			
				}}
		
	

	@Override
	public Formateur getFormateur(Long idf) {
		
		Formateur p=new Formateur();
		Formation c = new Formation();
	try {
		PreparedStatement ps = connexion.prepareStatement("select * from Formateur where idFormateur=?");
	
      ps.setLong(1, idf);  
     
	ResultSet rs=ps.executeQuery();
       while(rs.next())
       { 
    	   p.setIdFormateur(rs.getLong(1));
    	   p.setNom(rs.getString(2));
    	  
    	   p.setPrenom(rs.getString(3));
    	   p.setTel(rs.getString(4));
    	   p.setEmail(rs.getString(5));
    	   p.setAdresse(rs.getString(6));
    	   p.setContrat(rs.getString(7));
    	   
    	   c.setIdFormation(rs.getLong(8));
    	   p.setFormation(c);
    	   

       }
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	return p;
	}

	@Override
	public ArrayList<Formateur> FormateursParFormation(Long id) {
		
ArrayList<Formateur> lst=new ArrayList<Formateur>();
		
		
		try { 
			PreparedStatement ps=connexion.prepareStatement("select * from formateur where idFormation=? ");
			 ps.setLong(1, id); 
			 
	       ResultSet rs=ps.executeQuery();
	       while(rs.next())
	       { Formateur p=new Formateur();
	       Formation c = new Formation();
	      
	         
	    	   p.setIdFormateur(rs.getLong(1));
	    	   p.setNom(rs.getString(2));
	    	  
	    	   p.setPrenom(rs.getString(3));
	    	   p.setTel(rs.getString(4));
	    	   p.setEmail(rs.getString(5));
	    	   p.setAdresse(rs.getString(6));
	    	   p.setContrat(rs.getString(7));
	    	   
	    	   c.setIdFormation(rs.getLong(8));
	    	   p.setFormation(c);
	    	   
	    	   
	    	   lst.add(p);
	       }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
	}

	
	@Override
	public Formation ajouterFormation(Formation f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> listFormations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Formation updateFormation(Formation f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFormation(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Formation getFormation(Long idf) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
