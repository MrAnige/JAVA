import java.util.Date;

public class Analyste extends Salarie {
	int depclient;
	public Analyste(String code, String nom, String prenom, Date dateentre,int depclient) {
		super(code, nom, prenom, dateentre);
		this.depclient= depclient;
		// TODO Auto-generated constructor stub
	}
	public int getDepclient() {
		return depclient;
	}
	public void setDepclient(int depclient) {
		this.depclient = depclient;
	}
	public String toString() {
		return "ANALYSTE || Code: " + this.getCode() +"Nom: " + this.getNom() +"Prénom: " + this.getPrenom() +"DateEntrée " + this.getDateentre();
	}
}
