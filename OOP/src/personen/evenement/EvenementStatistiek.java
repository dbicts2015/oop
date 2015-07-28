package personen.evenement;

public class EvenementStatistiek {

	private final Evenement[] evenementen;

	public EvenementStatistiek(Evenement[] evenementen) {
		this.evenementen = evenementen;
	}

	public double getTotaleKostPrijs() {
		double totaal = 0;
		for (Evenement evenement : evenementen) {
			if (evenement != null) {
				totaal += evenement.getKostPrijs();
			}
		}
		return totaal;
	}

	public int getAantalVerjaardagsFeesten() {
		int aantal = 0;
		for (Evenement evenement : evenementen) {
			aantal += evenement != null && evenement instanceof Verjaardagsfeest ? 1 : 0;
		}
		return aantal;
	}

	public int getAantalBedrijfsFeesten() {
		int aantal = 0;
		for (Evenement evenement : evenementen) {
			aantal += evenement != null && evenement instanceof BedrijfsFeest ? 1 : 0;
		}
		return aantal;
	}

	public int getAantalEvenementen() {
		int aantal = 0;
		for (Evenement evenement : evenementen) {
			aantal += evenement != null && (evenement instanceof BedrijfsFeest || evenement instanceof Verjaardagsfeest) ? 0 : 1;
		}
		return aantal;
	}

}