package personnages;

//import sun.security.action.GetBooleanAction;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	public Gaulois(String nom, int force) {
			this.nom = nom;
			this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
	System.out.println(prendreParole() + "� " + texte + " �");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de "
				+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force
				+ ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion( int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est "+effetPotion+" fois d�cupl�e.");
	}
	public static void main(String[] args) {
		Gaulois asterix;
		asterix= new Gaulois("Ast�rix",8);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Coucou");
		Romain minus;
		Romain maximus;
		minus= new Romain("Minus",2);
		maximus= new Romain("Maximus",8);
		asterix.frapper(minus);
		asterix.frapper(maximus);
		asterix.boirePotion(5);
	}
}
