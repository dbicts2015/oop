package personen.evenement;

public class Main {
	
	public static void main(String[] args) {
		Evenement evenement = new Evenement(7, 6, 2015, 15, 3);
//		System.out.printf("Het evenement zal plaatsnemen op %s en kost %f%n",
//				evenement.getDatum().toString(), evenement.getKostPrijs());

		Verjaardagsfeest feest = new Verjaardagsfeest(8, 6, 2015, 15, 69D, 8, 6, 2015, "Hannes Lowette");
//		System.out.printf("Het verjaardagfeest van %s is op %s. Hij word %d jaar. Het feesdt kost %f%n",
//						feest.getJarige(), feest.getDatum().toString(), feest.getLeeftijdJarige(), feest.getKostPrijs());
		
		BedrijfsFeest bf1 = new BedrijfsFeest(7, 6, 2015, 10, 5, "lolololol", "Winnipeg Jets");
		BedrijfsFeest bf2 = new BedrijfsFeest(7, 6, 2015, 60, 5, "lolololol", "New York Rangers");
		BedrijfsFeest bf3 = new BedrijfsFeest(7, 6, 2015, 110, 5, "lolololol", "Anaheim Ducks");

//		System.out.printf("Bedrijf %s geeft een feest op %s. Hier komen %d mensen op af en zal %f kosten.%n",
//				bf1.getFirma(), bf1.getDatum(), bf1.getAantalDeelnemers(), bf1.getKostPrijs());
//		System.out.printf("Bedrijf %s geeft een feest op %s. Hier komen %d mensen op af en zal %f kosten.%n",
//				bf2.getFirma(), bf2.getDatum(), bf2.getAantalDeelnemers(), bf2.getKostPrijs());
//		System.out.printf("Bedrijf %s geeft een feest op %s. Hier komen %d mensen op af en zal %f kosten.%n",
//				bf3.getFirma(), bf3.getDatum(), bf3.getAantalDeelnemers(), bf3.getKostPrijs());
		
		System.out.println(bf1);
		System.out.println(bf2);
		System.out.println(bf3);
		System.out.println(evenement);
		System.out.println(feest);
	}
	
}
