package verkopers;

public abstract class Verkoper {

	private String naam;
	
	private Klant[] klanten;
	private int klantIndex = 0;

	public Verkoper(String naam) {
		this.naam = naam;
		this.klanten = new Klant[10];
	}

	public String toString() {
		StringBuilder builder = new StringBuilder("Dit zijn de klanten van ")
				.append(naam).append(" de ").append(this.getClass().getSimpleName());
		for (Klant klant : klanten) {
			if (klant != null) {
				builder.append("\n").append(klant.toString());
			}
		}
		return builder.toString();
	}

	public String doeVerkoopspraatje() {
		return String.format("%s de %s zegt: ", naam, this.getClass().getSimpleName());
	}

	public abstract String getIndividueelVerkoopsPraatje();

	public void voegKlantToe(Klant klant) {
		if (klantIndex < klanten.length) {
			klanten[klantIndex++] = klant;			
		}
	}

	public int getKlantIndex() {
		return klantIndex;
	}

	public void setKlantIndex(int klantIndex) {
		this.klantIndex = klantIndex;
	}

	public String getNaam() {
		return naam;
	}

	public Klant[] getKlanten() {
		return klanten;
	}

}
