package interfaces;

public class Werknemer implements Registreerbaar {
	private String naam, voornaam, SocSecNr;
	private double loon;

	public Werknemer() {
		setNaam("Deborah","Brouwers");
		setSocSecNr("830507 222-46");
		setLoon(2500);
	}

	
	
	public String getNaam() {
		return voornaam+" "+naam;
	}



	public void setNaam(String voornaam,String naam) {
		this.naam = naam;
		this.voornaam = voornaam;
	}



	public String getSocSecNr() {
		return SocSecNr;
	}



	public void setSocSecNr(String socSecNr) {
		SocSecNr = socSecNr;
	}



	public double getLoon() {
		return loon;
	}



	public void setLoon(double loon) {
		this.loon = loon;
	}



	@Override
	public void registreer() {
		System.out.printf("De werknemer %s wordt geregistreerd en zijn/haar loon verhoogd met 10%%%n",getNaam());
		setLoon(getLoon()*1.1);
		System.out.printf("Loon van %s na loonsverhoging: %.2f%n",getNaam(),getLoon());

	}

	@Override
	public String getStringVoorConsole() {
		return String.format("Werknemer %s heeft Rijksregisternummer %s en verdient %.2f EURO per maand", getNaam(),getSocSecNr(),getLoon());
	}

	@Override
	public String getIdentificatie() {
		StringBuilder initialen = new StringBuilder();
		initialen.append(voornaam.toUpperCase().charAt(0));
		initialen.append(naam.toUpperCase().charAt(0));
		initialen.append(naam.toUpperCase().charAt(1));
		return String.format("ID %s %s",initialen.toString(),getSocSecNr());
	}

	@Override
	public boolean komtVoor(Object object) {
		boolean komtVoor=false;
		String klasse = getClass().getSimpleName();
		if (klasse.compareTo(object.getClass().getSimpleName())<0) komtVoor=true;
		return komtVoor;
	}

}
