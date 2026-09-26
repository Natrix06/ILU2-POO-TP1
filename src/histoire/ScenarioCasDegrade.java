package histoire;

import personnages.Chef;
import personnages.Druide;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;
import villagegaulois.VillageSansChefException;

public class ScenarioCasDegrade {

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		Gaulois obelix = new Gaulois("Obélix", 10);
		Village village = new Village("le village des irréductibles", 10, 5);
		
		try {
			System.out.println(village.afficherVillageois());
		} catch (VillageSansChefException e) {
			e.printStackTrace();
		}
		
		Etal etal = new Etal();
		etal.libererEtal();

		Etal etalOccupe = new Etal();
		etalOccupe.occuperEtal(obelix, "fleurs", 10);
		try {
			etalOccupe.acheterProduit(-1, abraracourcix);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		Etal etalVierge = new Etal();
		try {
			etalVierge.acheterProduit(5, abraracourcix);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fin du test");
	}
}