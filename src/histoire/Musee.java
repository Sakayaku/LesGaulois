package histoire;

import personnages.Equipement;
import personnages.Gaulois;
import histoire.Trophee;

public class Musee {
	private Equipement[] tableauTrophee =new Equipement[200];  
	private int nbTrophees = 0;
	public void donnerTrophees(Gaulois gaulois, Equipement trophee) {
		for (int i = 0; i < tableauTrophee.length; i++){
			if (tableauTrophee[i]==null) {
				tableauTrophee[i]=trophee;
			}
		}
	}
//	public void extraireInstructionsCaml(Equipement trophee) {
//		
//	}
}
