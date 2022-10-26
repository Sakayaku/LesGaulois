package personnages;

public class Romain {
	private String nom;
	private int force;
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
	public int getForce() {
		return force;
	}
	public void parler(String texte) {
	System.out.println(prendreParole() + "� " + texte + " �");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
//	public void recevoirCoup(int forceCoup) {
//		assert force>0;
//		test=force;
//		force -= forceCoup;
//	if (force > 0) {
//		parler("Aïe");
//	} else {
//		parler("J'abandonne...");
//	}
//	assert force<test;
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculresistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force==0) {
			parler("Aie");
		}else{
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
			// post condition la force a diminuée
			assert force < oldForce;
			return equipementEjecte;
		}
	private int calculresistanceEquipement(int forceCoup) {
		String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup + "\nMais heureusement, grace à mon équipement sa force est diminué de ";
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			for (int i = 0; i < nbEquipement; i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					resistanceEquipement += 5;
				}
			}
		texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			equipementEjecte[nbEquipementEjecte] = equipements[i];
			nbEquipementEjecte++;
			equipements[i] = null;
		}
		return equipementEjecte;
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
