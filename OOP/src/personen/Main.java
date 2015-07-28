package personen;

public class Main {

	public static void main(String[] args) {
//		Persoon persoon = new Persoon();
//		persoon.setNaam("Janssen");
//		persoon.setVoornaam("Jan");
//		persoon.setRijksregisterNummer("rrn van Jan");
//		System.out.printf("Persoon %s %s heeft rijksregisternr %s%n",
//				persoon.getVoornaam(), persoon.getNaam(),
//				persoon.getRijksregisterNummer());
//
//		Cursist cursist = new Cursist();
//		cursist.setNaam("Peeters");
//		cursist.setVoornaam("Peter");
//		cursist.setRijksregisterNummer("rrn van Peter");
//		System.out.printf("Cursist %s %s heeft rijksregisternr %s%n",
//				cursist.getVoornaam(), cursist.getNaam(),
//				cursist.getRijksregisterNummer());
//		cursist.setOpleiding("Java");
//		System.out.printf("de cursist volgt de opleiding %s%n",
//				cursist.getOpleiding());

//		Personeelslid personeelslid = new Personeelslid();
//		personeelslid.setNaam("Jorissen");
//		personeelslid.setVoornaam("Joris");
//		personeelslid.setRijksregisterNummer("rrn van Joris");
//		personeelslid.setLoon(1234);
//		System.out
//				.printf("Personeelslid %s %s heeft rijksregisternr %s en zijn loon bedraagt %f%n",
//						personeelslid.getVoornaam(), personeelslid.getNaam(),
//						personeelslid.getRijksregisterNummer(),
//						personeelslid.getLoon());

//		String tmp = persoon.getVolledigeNaam(); // ok;
		// want persoon is gedeclareerd als Persoon
		// en in klasse Persoon is een methode getVolledigeNaam()

//		tmp = cursist.getVolledigeNaam(); // ok;
		// want cursist is gedeclareerd als Cursist
		// en die klasse erft methode getVolledigeNaam() van de basisklasse
		// Persoon

		// personeelslid.setOpleiding("communicatietraining"); // compileerfout;
		// want personeelslid is gedeclareerd als Personeelslid
		// en in klasse Personeelslid of een van de basisklassen is geen methode
		// setOpleiding()

//		Cursist cursist2;
//		cursist2 = cursist; // ok; 2 objecten van dezelfde klasse mag je aan
							// elkaar toekennen

		// POLYMORFISME
		// een object van een subklasse kan steeds gebruikt worden
		// ipv een object van een basisklasse
//		persoon = cursist;
//		tmp = persoon.getVolledigeNaam(); // ok;
		// want persoon is gedeclareerd als Persoon
		// en in klasse Persoon is een methode getVolledigeNaam()
//		System.out.println(tmp);
//		System.out.println(persoon.ontvangGeschenk()); // koekjes
		// ok;
		// want persoon is gedeclareerd als Persoon
		// en in klasse Persoon is een methode ontvangGeschenk()
		// versie uit Cursist wordt uitgevoerd
		// want bij method overriding bepaalt het runtime type
		// (welk soort object is toegekend) welke versie van de methode
		// uitgevoerd wordt

		// persoon.setOpleiding("java"); // compileerfout;
		// want persoon is gedeclareerd als Persoon
		// en in klasse Persoon of een van de basisklassen is geen methode
		// setOpleiding()

//		Lesgever lesgever = new Lesgever("Jos", "Vermeulen", "rrn van Jos",
//				1234, "potten bakken");
//		lesgever.setSpecialisatie("potten bakken in klei"); // ok;
		// want lesgever is gedeclareerd als Lesgever
		// en in klasse Lesgever is een methode setSpecialisatie()

//		lesgever.setRijksregisterNummer("nieuw rrn"); // ok;
		// want lesgever is gedeclareerd als Lesgever
		// en in een van de superklassen is een methode setRijksregisterNummer()
		
//		System.out.println(lesgever.ontvangGeschenk());  // versie uit Personeelslid
//		
//		persoon = lesgever;  // ok
//		System.out.println(persoon.ontvangGeschenk());  // versie uit Personeelslid
		
		// tmp = persoon.getSpecialisatie();  // compileerfout;
		// want persoon is gedeclareerd als Persoon 
		// en in klasse Persoon is geen methode getSpecialisatie()

	}

}
