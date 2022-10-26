package personnages;


public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees=0;
	private int effetPotion = 1;
	private Equipement[] mesTrophees= new Equipement[100];
	public Gaulois(String nom, int force) {
			this.nom = nom;
			this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + " »");
	}
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mÃ¢choire de "
//				+ romain.getNom());
//		romain.recevoirCoup(force / 3);
//	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		 Equipement[] trophees = romain.recevoirCoup((force / 3) *effetPotion);
		 for (int i = 0; trophees != null && i < trophees.length; i+=1,nbTrophees+=1) {
			 mesTrophees[nbTrophees] = trophees[i];
		}
	}
	public void boirePotion( int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est "+effetPotion+" fois décuplée.");
	}
	public static void main(String[] args) {
		Gaulois asterix;
		asterix= new Gaulois("AstÃ©rix",8);
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
