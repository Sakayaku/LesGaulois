package personnages;

public class Village {
	private Chef chef;
	private String nom;
	public Village(Chef chef, String nom) {
		super();
		this.chef = chef;
		this.nom = nom;
	}
	public Chef getChef() {
		return chef;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
