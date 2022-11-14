package histoire;

import personnages.Equipement;
import personnages.Gaulois;
import histoire.Trophee;

public class Musee {
	private Equipement[] tableauTrophee =new Equipement[200];  
	private int nbTrophee = 0;
	public void donnerTrophees(Gaulois gaulois, Equipement[] trophee) {
		for (int i = 0; i < tableauTrophee.length; i++){
			if (tableauTrophee[i]==null) {
				tableauTrophee[i]=trophee;
			}
		}
	}
	public Musee() {
		// TODO Auto-generated constructor stub
	}

}
