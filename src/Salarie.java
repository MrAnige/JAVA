import java.util.Date;

public class Salarie {
	private String code;
	private String nom;
	private String prenom;
	private Date dateentre = new Date();
	
	public Salarie(String code, String nom, String prenom, Date dateentre) {
		this.code=code;
		this.nom=nom;
		this.prenom=prenom;
		this.dateentre=dateentre;
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Date getDateentre() {
		return dateentre;
	}

	public void setDateentre(Date dateentre) {
		this.dateentre = dateentre;
	}
	

	
}
