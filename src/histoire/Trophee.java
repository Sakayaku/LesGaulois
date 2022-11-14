package histoire;

import personnages.Equipement;
import personnages.Gaulois;

public class Trophee {
	private Gaulois gaulois;
	private Equipement[] equipement;
	

	public Trophee(Gaulois gaulois, Equipement[] equipement) {
		super();
		this.gaulois = gaulois;
		this.equipement = equipement;
	}


	public Gaulois getGaulois() {
		return gaulois;
	}


	public void setGaulois(Gaulois gaulois) {
		this.gaulois = gaulois;
	}


	public Equipement[] getEquipement() {
		return equipement;
	}


	public void setEquipement(Equipement[] equipement) {
		this.equipement = equipement;
	}


	public Trophee() {
		// TODO Auto-generated constructor stub
	}
	private String donnerNom(Gaulois gaulois) {
		return gaulois.getNom();
	}
}
