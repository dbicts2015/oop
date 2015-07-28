package interfaces;


public class Factuur implements Registreerbaar {
	
	private String factuurNummer;
	private String bediendeNaam;
	private String omschrijving;
	private String rekNummer;
	private double prijs;
	private boolean goedGekeurd;

	public Factuur() {
		setFactuurNummer(Math.random()*20 + "FN" + (Math.random()*1000 + 1000));
		setBediendeNaam("default");
		setOmschrijving("empty");
		setRekNummer("000-000000-00");
		setPrijs(0.0);
	}
	
	public String getBediendeNaam() {
		return bediendeNaam;
	}
	
	public void setBediendeNaam(String bediendeNaam) {
		this.bediendeNaam = bediendeNaam;
	}

	public String getFactuurNummer() {
		return factuurNummer;
	}
	
	public void setFactuurNummer(String factuurNummer) {
		this.factuurNummer = factuurNummer;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getRekNummer() {
		return rekNummer;
	}

	public void setRekNummer(String rekNummer) {
		this.rekNummer = rekNummer;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	public boolean isGoedGekeurd() {
		return goedGekeurd;
	}

	public void setGoedGekeurd(boolean goedGekeurd) {
		this.goedGekeurd = goedGekeurd;
	}

	@Override
	public void registreer() {
		setGoedGekeurd(true);
	}

	@Override
	public String getStringVoorConsole() {
		StringBuilder console = new StringBuilder();
		console.append("FactuurNr: ");
		console.append(getFactuurNummer());
		console.append(System.lineSeparator());
		console.append("----------------------");
		console.append(System.lineSeparator());
		console.append("Systeem bediende: ");
		console.append(getBediendeNaam());
		console.append(System.lineSeparator());
		console.append("Rekeningnummer: ");
		console.append(getRekNummer());
		console.append(System.lineSeparator());
		console.append(System.lineSeparator());
		console.append("Omschrijving: ");
		console.append(System.lineSeparator());
		console.append("     _______________________");
		console.append(System.lineSeparator());
		console.append(" O -| Luke, I am your father|");
		console.append(System.lineSeparator());
		console.append("/|\\ |___________________|");
		console.append(System.lineSeparator());
		console.append(" /\\         ______");
		console.append(System.lineSeparator());
		console.append("------_\\O _/ Noo! |");
		console.append(System.lineSeparator());
		console.append("     |_/   |_____|");
		console.append(System.lineSeparator());
		console.append("     |");
		console.append(System.lineSeparator());
		console.append(System.lineSeparator());
		console.append(System.lineSeparator());
		console.append(getBediendeNaam());
		console.append(System.lineSeparator());
		console.append("Prijs: ");
		console.append(getPrijs());
		console.append( " | Factuur Goedgekeurd? ");
		if(isGoedGekeurd()) {
			console.append( " JA ");
		}
		else {
			console.append( " NEE ");
		}
		console.append(System.lineSeparator());
		console.append("----------------------");
		
		return console.toString();
	}

	@Override
	public String getIdentificatie() {
		return getFactuurNummer();
	}

	@Override
	public boolean komtVoor(Object object) {
		return false;
	}

}
