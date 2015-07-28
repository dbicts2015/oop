package personen;

public class Ontwikkelaar extends Personeelslid {

	private boolean heeftCertificaat;

	public Ontwikkelaar(boolean heeftCertificaat) {
		this.setHeeftCertificaat(heeftCertificaat);
	}

	public Ontwikkelaar(String voornaam, String naam, String rijksregisterNummer, double loon, boolean heeftCertificaat) {
		super(voornaam, naam, rijksregisterNummer, loon);
		this.setHeeftCertificaat(heeftCertificaat);
	}

	@Override
	public double getBonus() {
		return super.getLoon() * 0.10;
	}

	public boolean isHeeftCertificaat() {
		return heeftCertificaat;
	}

	public void setHeeftCertificaat(boolean heeftCertificaat) {
		this.heeftCertificaat = heeftCertificaat;
	}

}