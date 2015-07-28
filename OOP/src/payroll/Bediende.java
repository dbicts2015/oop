package payroll;

public class Bediende extends Werknemer {

	private double salaris;

	public Bediende(String voornaam, String familienaam, String ssn, double salaris) {
		super(voornaam, familienaam, ssn);
		this.salaris = salaris;
	}

	public Bediende(String voornaam, String familienaam, String ssn) {
		super(voornaam, familienaam, ssn);
	}

	@Override
	public double berekenWeekloon() {
		return salaris;
	}

	@Override
	public void geefPromotie(double percent) {
		salaris *= percent;
	}

	@Override
	public void geefPromotie(int hoeveelheid) {
		salaris += hoeveelheid;
	}

	public double getSalaris() {
		return salaris;
	}

	public void setSalaris(double salaris) {
		this.salaris = salaris;
	}

}
