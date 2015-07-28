package payroll;

public class Arbeider extends Werknemer {

	private double loon;
	
	private int uren;
	private int overuren;

	public Arbeider(String voornaam, String familienaam, String ssn, double loon) {
		super(voornaam, familienaam, ssn);
		this.loon = loon;
	}

	public Arbeider(String voornaam, String familienaam, String ssn) {
		super(voornaam, familienaam, ssn);
	}

	@Override
	public double berekenWeekloon() {
		return uren * loon + overuren * loon * 1.50;
	}

	@Override
	public void geefPromotie(double percent) {
		loon *= percent;
	}

	@Override
	public void geefPromotie(int hoeveelheid) {
		loon += hoeveelheid;
	}

	public double getLoon() {
		return loon;
	}

	public void setLoon(double loon) {
		this.loon = loon;
	}

	public int getUren() {
		return uren;
	}

	public void setUren(int uren) {
		this.uren = uren;
	}

	public int getOveruren() {
		return overuren;
	}

	public void setOveruren(int overuren) {
		this.overuren = overuren;
	}

}