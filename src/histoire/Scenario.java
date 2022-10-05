package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix;
		Gaulois obelix;
		Romain minus;
		Druide panoramix;
		panoramix= new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
		asterix= new Gaulois("Astérix",8);
		obelix= new Gaulois("Obélix",8);
		minus= new Romain("Minus",6);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
