package verkopers;

public class Main {

	public static void main(String[] args) {
		Verkoper[] verkopers = maakVerkopers();
		for (Verkoper verkoper : verkopers) {
			if (verkoper != null) {
				System.out.println(verkoper.doeVerkoopspraatje());
			}
		}
		Klant particulier = new Particulier("Jos");
		Klant bedrijf = new Bedrijf("CanDoIt", "Marie");
		verkopers[0].voegKlantToe(particulier);
		verkopers[0].voegKlantToe(bedrijf);
		System.out.println(verkopers[0]);
	}

	private static Verkoper[] maakVerkopers() {
		Verkoper[] verkopers = new Verkoper[4];
		verkopers[0] = new MerkartikelenVertegenwoordiger("Jan", "X");
		verkopers[1] = new RouteVerkoper("Piet", "de straten van de stad");
		verkopers[2] = new SalesEngineer("Joris", "iets");
		verkopers[3] = new MerkartikelenVertegenwoordiger("Korneel", "Y");
		return verkopers;
	}

}
