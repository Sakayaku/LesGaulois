package personnages;

public class Village {
	private Chef chef;
	private String nom;
	private String[] villageois;
	private int nbVillageois=0;
	public Village(String nom, int nbVillageoisMaximum) {
		super();
		//this.chef = chef;
		this.nom = nom;
		villageois=new String[nbVillageoisMaximum];
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
	public void ajouterHabitant(String nom) {
		villageois[nbVillageois]=nom;
		nbVillageois+=1;
	}
	public void trouverHabitant(int nmVillageois) {
	}
	public static void main() {
		Village village;
		village= new Village("Village des Irréductibles",30);
		//Gaulois gaulois= village.trouverHabitant(30);
		// L'exception du point précédent est Type mismatch:cannot convert from void to Gaulois. On obtient cette exception  
	}
}
