package personnages;

public class Romain {
	private String nom;
	private int force;
	private int test;
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
	public static void main(String[] args) {
		Romain minus;
		Romain maximus;
		minus= new Romain("Minus",6);
		maximus= new Romain("Maximus",8); 
		System.out.println(minus);
		maximus.parler("On va y arriver");
		System.out.println(minus.prendreParole());
		minus.recevoirCoup(5);

	}
}
