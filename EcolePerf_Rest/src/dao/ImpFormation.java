package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utilitaire.SingletonConnexion;
import metier.Formateur;
import metier.Formation;

public class ImpFormation implements IMetier {
	
	private Connection connexion=SingletonConnexion.getConnection();

	@Override
	public Formation ajouterFormation(Formation f) {
		try {
			PreparedStatement ps=connexion.prepareStatement ("insert into formation (idFormation, titreFormation, descFormation, dureeFormation)values(?,?,?,?)");
			ps.setLong(1, f.getIdFormation());
			ps.setString(2, f.getTitreFormation());
		    ps.setString(3, f.getDescFormation());
		    ps.setString(4, f.getDureeFormation());
		   
		    ps.executeUpdate();
		    ps.close();
		    
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return f;
	}

	@Override
	public List<Formation> listFormations() {
		List<Formation> lst=new ArrayList<Formation>();
		
		try { 
			PreparedStatement ps=connexion.prepareStatement("select * from formation");
	       ResultSet rs=ps.executeQuery();
	       while(rs.next())
	       { Formation f=new Formation();
	       
	       	f.setIdFormation(rs.getLong(1));
	    	f.setTitreFormation(rs.getString(2));
	    	f.setDescFormation(rs.getString(3));
	    	f.setDureeFormation(rs.getString(4));
	    	  
	    	   
	    	   lst.add(f);
	       }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
		
	}

	@Override
	public Formation updateFormation(Formation f) {
		try {
			PreparedStatement ps= connexion.prepareStatement("UPDATE formation SET titreFormation=?, descFormation=?, dureeFormation=? WHERE idFormation= ?");
			
			ps.setString(1,f.getTitreFormation());
		    ps.setString(2,f.getDescFormation());
		    ps.setString(3,f.getDureeFormation());
		    ps.setLong(4, f.getIdFormation());
		    
		    
			ps.executeUpdate();
			ps.close();
			
			
			} catch (SQLException e1) {
			e1.printStackTrace();
			}
		return f;
	}

	@Override
	public void deleteFormation(Long id) {
		try {
			PreparedStatement ps= connexion.prepareStatement("DELETE FROM formation where idFormation=?");
		
			ps.setLong(1, id);
			ps.executeUpdate();
			ps.close();
		
			} 
		
		catch (SQLException e) {
			e.printStackTrace();
			
			}
		
		
	}
	

	@Override
	public Formation getFormation(Long idf) {
		Formation f=new Formation();
			try {
				PreparedStatement ps = connexion.prepareStatement("select * from formation where idFormation=?");
			
		      ps.setLong(1, idf);  
		     
			ResultSet rs=ps.executeQuery();
		       while(rs.next())
		       { 
		    	 f.setIdFormation(rs.getLong(1));
		    	   f.setTitreFormation(rs.getString(2));
		    	   f.setDescFormation(rs.getString(3));
		    	   f.setDureeFormation(rs.getString(4));
		    	  
		    	  
		       }
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return f;
	}

	@Override
	public Formateur ajouterFormateur(Formateur f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formateur> listFormateurs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Formateur updateFormateur(Formateur f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFormateur(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Formateur getFormateur(Long idf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Formateur> FormateursParFormation(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
