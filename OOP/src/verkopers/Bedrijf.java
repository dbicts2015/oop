package verkopers;

public class Bedrijf extends Klant {

	private String firma;

	public Bedrijf(String naam) {
		super(naam);
	}

	public Bedrijf(String firma, String naam) {
		super(naam);
		this.firma = firma;
	}

	public String toString() {
		return String.format("%s - %s", firma, super.toString());
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

}