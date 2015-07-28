package personen;

import java.util.Scanner;

public abstract class Persoon{ 	
	
	private String voornaam;
	private String naam;
	private String rijksregisterNummer;
	
	public Persoon(){
	}
	
	public Persoon(String voornaam, String naam, String rijksregisterNummer) {
		setVoornaam(voornaam);
		setNaam(naam);
		setRijksregisterNummer(rijksregisterNummer);
	}

	public void vraagGegevens(Scanner scanner) {
		voornaam = MainMetPersoonTabel2.requestInput(scanner, "Geef de voornaam");
		naam = MainMetPersoonTabel2.requestInput(scanner,"Geef de achternaam");
		rijksregisterNummer = MainMetPersoonTabel2.requestInput(scanner,"Geef de rrn");
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getRijksregisterNummer() {
		return rijksregisterNummer;
	}

	public void setRijksregisterNummer(String rijksregisterNummer) {
		this.rijksregisterNummer = rijksregisterNummer;
	}
	
	public String getVolledigeNaam(){
		return String.format("%s %s", getVoornaam(), getNaam().toUpperCase());
	}
	
	public String ontvangGeschenk(){
		return "een USB-stick";
	}

	@Override
	public String toString(){
		return String.format("%s heeft rijksregisternr %s", 
				getVolledigeNaam(), getRijksregisterNummer());
	}
}
