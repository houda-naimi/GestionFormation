package metier;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonSetter;
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Formateur  implements Serializable {
	
	private Long idFormateur;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private String adresse;
	private String contrat;
	
	private Formation formation;
	
	private Long idFormation;
	//
	
	
	
	


	public Formateur(Long idFormateur, String nom, String prenom, String email, String tel, String adresse,
			String contrat, Formation formation) {
		super();
		this.idFormateur = idFormateur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.adresse = adresse;
		this.contrat = contrat;
		this.formation = formation;
	}


	public Formateur() {
		super();
	}


	


	public Formateur(Long idFormateur, String nom, String prenom, String email, String tel, String adresse,
			String contrat, Formation formation, Long idFormation) {
		super();
		this.idFormateur = idFormateur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.adresse = adresse;
		this.contrat = contrat;
		this.formation = formation;
		this.idFormation = idFormation;
	}


	public Long getIdFormation() {
		return idFormation;
	}


	public void setIdFormation(Long idFormation) {
		this.idFormation = idFormation;
	}


	public Long getIdFormateur() {
		return idFormateur;
	}


	public void setIdFormateur(Long idFormateur) {
		this.idFormateur = idFormateur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getContrat() {
		return contrat;
	}


	public void setContrat(String contrat) {
		this.contrat = contrat;
	}

	//@JsonIgnore
	public Formation getFormation() {
		return formation;
	}

	@JsonSetter
	public void setFormation(Formation formation) {
		this.formation = formation;
	}


	

	@Override
	public String toString() {
		return "Formateur [idFormateur=" + idFormateur + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", tel=" + tel + ", adresse=" + adresse + ", contrat=" + contrat + ", formation=" + formation
				+  "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
