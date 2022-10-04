import java.util.Date;

public class Concepteur extends Salarie{
	int nbAnneDev;
	public Concepteur(String code, String nom, String prenom, Date dateentre,int nbAnneDev) {
		super(code, nom, prenom, dateentre);
		this.nbAnneDev=nbAnneDev;
		// TODO Auto-generated constructor stub
	}
	public int getNbAnneDev() {
		return nbAnneDev;
	}
	public void setNbAnneDev(int nbAnneDev) {
		this.nbAnneDev = nbAnneDev;
	}
	
	public String toString() {
		return "CONCEPTEUR || Code: " + this.getCode() +"Nom: " + this.getNom() +"Prénom: " + this.getPrenom() +"DateEntrée " + this.getDateentre();
	}
}
