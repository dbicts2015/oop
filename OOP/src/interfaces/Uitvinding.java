package interfaces;

public class Uitvinding implements Registreerbaar {

	private static String naam = "gloeilamp";
	private String uitvinder = "Thomas Edison";
	private String patent;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getUitvinder() {
		return uitvinder;
	}

	public void setUitvinder(String uitvinder) {
		this.uitvinder = uitvinder;
	}

	public String getPatent() {
		return patent;
	}

	public void setPatent(String patent) {
		this.patent = patent;
	}

	@Override
	public void registreer() {
		this.patent = "P-" + (int) (Math.random() * 100000);
		System.out
				.printf(
						"Er werd een octrooi toegekend aan %s, voor de uitvindinge van de %s met als patentnummer: %s%n",
						getUitvinder(), getNaam(), getPatent());
	}

	@Override
	public String getStringVoorConsole() {
		return String.format("%s is de uitvinder van de %s.", uitvinder, naam);
	}

	@Override
	public String getIdentificatie() {
		return patent;
	}

	@Override
	public boolean komtVoor(Object object) {
		return false;
	}

}
