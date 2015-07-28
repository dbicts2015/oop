package verkopers;

public abstract class Klant {

	private String naam;

	public Klant(String naam) {
		this.naam = naam;
	}

	@Override
	public String toString() {
		return naam;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

}