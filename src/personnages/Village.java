package personnages;

public class Village {
	private Chef chef;
	private String nom;
	private Gaulois[] villageois;
	private int nbVillageois=0;
	public Village(String nom, int nbVillageoisMaximum) {
		super();
		//this.chef = chef;
		this.nom = nom;
		villageois=new Gaulois[nbVillageoisMaximum];
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
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois+=1;
	}
	public Gaulois trouverHabitant(int nmVillageois) {
		return villageois[nmVillageois];
	}
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+chef.getNom()+" vivent les légendaires gaulois:");
		for (int i=0; i<villageois.length; ++i){
			if (villageois[i]!=null)
			{System.out.println("-"+villageois[i].getNom());}
			}
	}
	public static void main(String[] args) {
		Village village;
		village= new Village("Village des Irréductibles",30);
		//Gaulois gaulois= village.trouverHabitant(30);
		// L'exception du point précédent est obtenue parce que le tableau est vide.
		Chef abraracourcix;
		abraracourcix= new Chef("Abraracourcix", 6, 1, village);
		Gaulois asterix;
		asterix= new Gaulois("Astérix",8);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		// on obtient null car on n'a pas mis Asterix dans le village. 
		Gaulois obelix;
		obelix= new Gaulois("Obélix",25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
