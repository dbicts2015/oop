package payroll;

public class VerkoperComissie extends Verkoper {

	private double salaris;

	public VerkoperComissie(String voornaam, String familienaam, String ssn) {
		super(voornaam, familienaam, ssn);
	}

	public VerkoperComissie(String voornaam, String familienaam, String ssn, double comissie) {
		super(voornaam, familienaam, ssn, comissie);
	}

	public VerkoperComissie(String voornaam, String familienaam, String ssn, double comissie, int salaris) {
		super(voornaam, familienaam, ssn, comissie);
		this.salaris = salaris;
	}
	
	@Override
	public void geefPromotie(double percent) {
		salaris *= percent;
	}
	
	@Override
	public void geefPromotie(int hoeveelheid) {
		salaris += hoeveelheid;
	}

	@Override
	public double berekenWeekloon() {
		return super.berekenWeekloon() + salaris;
	}
	
	public double getSalaris() {
		return salaris;
	}

	public void setSalaris(double salaris) {
		this.salaris = salaris;
	}

	

}