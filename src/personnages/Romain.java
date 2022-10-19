package personnages;

public class Romain {
	private String nom;
	private int force;
	private int test;
	private Equipement[] equipements= new Equipement[2];
	private int nbEquipement=0;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
	System.out.println(prendreParole() + "� " + texte + " �");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert force>0;
		test=force;
		force -= forceCoup;
	if (force > 0) {
		parler("Aïe");
	} else {
		parler("J'abandonne...");
	}
	assert force<test;
	}
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat "+getNom()+" est déjà bien protégé!");
			break;
		case 1:
			if (equipements[0]==equipement) {
				System.out.println("Le soldat "+getNom()+" possède déjà un "+equipement+"!");
			} else {
				equipements[1]=equipement;
				nbEquipement+=1;
				System.out.println("Le soldat "+getNom()+" s'équipe avec un "+equipement+".");
			}
			break;
		case 0:
			System.out.println("Le soldat "+getNom()+" s'équipe avec un "+equipement+".");
			equipements[0]=equipement;
			nbEquipement+=1;
		}
	}
	public static void main(String[] args) {
		Romain minus;
		Romain maximus;
		minus= new Romain("Minus",6);
		maximus= new Romain("Maximus",8); 
		System.out.println(minus);
		maximus.parler("On va y arriver");
		System.out.println(minus.prendreParole());
		minus.recevoirCoup(5);
		System.out.println("Equipement: "+Equipement.CASQUE+" "+Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
