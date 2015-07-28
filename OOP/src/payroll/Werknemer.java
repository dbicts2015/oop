package payroll;

/**
 * Van elke werknemer worden voornaam, familienaam en social security number bijgehouden.
 * @author user104
 *
 */
public abstract class Werknemer {

	private String voornaam;
	private String familienaam;
	private String ssn;

	public Werknemer(String voornaam, String familienaam, String ssn) {
		this.voornaam = voornaam;
		this.familienaam = familienaam;
		this.ssn = ssn;
	}

	public abstract double berekenWeekloon();

	public abstract void geefPromotie(double percent);

	public abstract void geefPromotie(int hoeveelheid);

	@Override
	public String toString() {
		return String.format("%s %s %s heeft %.2f verdient deze week.", this.getClass().getSimpleName(), voornaam, familienaam, berekenWeekloon());
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getFamilienaam() {
		return familienaam;
	}

	public void setFamilienaam(String familienaam) {
		this.familienaam = familienaam;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

}