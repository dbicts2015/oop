package payroll;

public class Verkoper extends Werknemer {

	private double verkoop;
	private double comissie;

	public Verkoper(String voornaam, String familienaam, String ssn, double comissie) {
		super(voornaam, familienaam, ssn);
		this.comissie = comissie;
	}

	public Verkoper(String voornaam, String familienaam, String ssn) {
		super(voornaam, familienaam, ssn);
	}

	@Override
	public double berekenWeekloon() {
		return verkoop * comissie;
	}

	@Override
	public void geefPromotie(double percent) {
		comissie *= percent;
	}

	@Override
	public void geefPromotie(int hoeveelheid) {
		// gaat niet
	}

	public double getVerkoop() {
		return verkoop;
	}

	public void setVerkoop(double verkoop) {
		this.verkoop = verkoop;
	}

	public double getComissie() {
		return comissie;
	}

	public void setComissie(double comissie) {
		this.comissie = comissie;
	}

}