package metier;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Formation implements Serializable  {
	
	private Long idFormation;
	private String titreFormation ;
	private String descFormation;
	private String dureeFormation;
	
	
	
	public Formation(Long idFormation, String titreFormation, String descFormation, String dureeFormation) {
		super();
		this.idFormation = idFormation;
		this.titreFormation = titreFormation;
		this.descFormation = descFormation;
		this.dureeFormation = dureeFormation;
	}



	public Formation() {
		// TODO Auto-generated constructor stub
	}



	public Long getIdFormation() {
		return idFormation;
	}



	


	public void setIdFormation(Long idFormation) {
		this.idFormation = idFormation;
	}



	public String getTitreFormation() {
		return titreFormation;
	}



	public void setTitreFormation(String titreFormation) {
		this.titreFormation = titreFormation;
	}



	public String getDescFormation() {
		return descFormation;
	}



	public void setDescFormation(String descFormation) {
		this.descFormation = descFormation;
	}



	public String getDureeFormation() {
		return dureeFormation;
	}



	public void setDureeFormation(String dureeFormation) {
		this.dureeFormation = dureeFormation;
	}



	@Override
	public String toString() {
		return "Formation [idFormation=" + idFormation + ", titreFormation=" + titreFormation + ", descFormation="
				+ descFormation + ", dureeFormation=" + dureeFormation + "]";
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
