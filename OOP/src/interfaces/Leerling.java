package interfaces;

public class Leerling implements Registreerbaar {
	private String klas;
	private String naam;
	private String voornaam;

	public Leerling() {
		setKlas("1");
		setNaam("Doe");
		setVoornaam("Jane");
	}

	@Override
	public void registreer() {
		// output om didactische reden ;-)
		System.out
				.printf("registratie van leerling %s", getStringVoorConsole());
	}

	@Override
	public String getStringVoorConsole() {
		return String.format("%s %S uit klas %s%n", getVoornaam(), getNaam(),
				getKlas());
	}

	@Override
	public String getIdentificatie() {
		return (getKlas() + getNaam() + getVoornaam()).toUpperCase();
	}

	@Override
	public boolean komtVoor(Object object) {
		if (object == null || !(object instanceof Leerling))
			return false; // eigenlijk zouden we een fout moeten 'opwerpen'
		// omdat we "appelen met citroenen" vergelijken
		else {
			Leerling tmp = (Leerling) object;
			return getIdentificatie().compareTo(tmp.getIdentificatie()) < 0 ? true
					: false;
		}
	}

	public String getKlas() {
		return klas;
	}

	public void setKlas(String klas) {
		this.klas = klas;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

}
