package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

import metier.Formateur;
import metier.Formation;

import modele.ModeleFormateur;
import modele.ModeleFormation;



@Singleton
@Path("/ecole")
@Produces(MediaType.APPLICATION_JSON+"; charset=UTF-8")

public class EcoleRestService {
	
	
	private ModeleFormation modeleFormation;
	private ModeleFormateur modeleFormateur;
	
	

		public EcoleRestService() {
	
			modeleFormation = new ModeleFormation();
			modeleFormateur = new ModeleFormateur();
			
		}

		
		@GET
		@Path("/formations")
		//@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
		public List<Formation> consulterFormations()
		{
			return modeleFormation.listerFormation();
	
		}
		
		
		
		
		

		@POST
		@Path("/formations")
		@Consumes(MediaType.APPLICATION_JSON)
		public Formation saveFormation(Formation f)
		{
			return modeleFormation.ajouterFormation(f);
			
		}

		
		
	
		
		
		@GET
		@Path("/formations/{idf}")
		//@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
		public Formation getFormation(@PathParam(value="idf")Long idf) {
			return modeleFormation.getFormation(idf);
		}
		
		
///////////////////
		@PUT
		@Path("/formations")
		public void updateFormation(Formation f)
		{
		 modeleFormation.modifierFormation(f);
		}
		
	/////////////////////////////////////////////
		@PUT
		@Path("/formations/{idf}")
		public void updateFormationTest(@PathParam(value="idf")Long idf, Formation f)
		{
		 modeleFormation.modifierFormation(f);
		}
		
		
		////////////////////////////////////////////
		@DELETE
		@Path("/formations")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		public void deleteFormation(@FormParam(value="idf") Long idf)
		{
			 modeleFormation.supprimerFormation(idf);
		}
		
		//
		
		@DELETE
		@Path("/formations/{idf}")
		//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		public void deleteFormation2(@PathParam(value="idf") Long idf)
		{
			 modeleFormation.supprimerFormation(idf);
		}
	
	
////////////////////////////////FORMATEUR//////////////////////////////////////////////////////
		
		
		
		
			@GET
			@Path("/allformateurs")
			//@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
			public List<Formateur> Formateurs()
			{
				return modeleFormateur.listerFormateur();
		
			}
			
			
			
			@GET
			@Path("/formateurs/{idf}")
			//@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
			public Formateur getProduit(@PathParam(value="idf")Long idf) {
				return modeleFormateur.getFormateur(idf);
			}
			
			
			@GET
			@Path("/formations/{idf}/formateurs")
			//@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
			public List<Formateur> FormateursParFormation(@PathParam(value="idf")Long idf)
			{
				return modeleFormateur.FormateursParFormation(idf);
		
			}	
			
			
			
			
			@PUT
			@Path("/formateurs")
			public Formateur updateFormateur(Formateur p)
			{
				return modeleFormateur.modifierFormateur(p);
			}
			
			
			@DELETE
			@Path("/formateurs")
			@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
			public void deleteFormateur(@FormParam(value="idProd") Long idProd)
			{
				modeleFormateur.supprimerFormateur(idProd);
			}
			
			
			@POST
			@Path("/formateurs")
			//@Consumes(MediaType.APPLICATION_JSON)
			public Formateur saveProduit(Formateur p)
			{
				return modeleFormateur.ajouterFormateur(p);
				
			}
			
			
			@DELETE
			@Path("/formateurs/{idprod}")
			//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
			public void deleteFormateur2(@PathParam(value="idprod") Long idprod)
			{
				modeleFormateur.supprimerFormateur(idprod);
			}
			
	
///////////////////////
			@PUT
			@Path("/formateurs/{idf}")
			public void updateFormateurTest(@PathParam(value="idf")Long idf, Formateur f)
			{
				modeleFormateur.modifierFormateur(f);
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
