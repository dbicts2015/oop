package personen;

import interfaces.Registreerbaar;

import java.util.Scanner;

public class Cursist extends Persoon implements Registreerbaar {
	private String opleiding;

	public Cursist() {
	}

	public void vraagGegevens(Scanner scanner) {
		super.vraagGegevens(scanner);
		opleiding = MainMetPersoonTabel2.requestInput(scanner, "Geef de opleiding");
	}

	public Cursist(String voornaam, String naam, String rijksregisterNummer,
			String opleiding) {
		super(voornaam, naam, rijksregisterNummer);
		setOpleiding(opleiding);
	}

	public String getOpleiding() {
		return opleiding;
	}

	public void setOpleiding(String opleiding) {
		this.opleiding = opleiding;
	}
	
	public String getGegevens(){
		return String.format("Deze cursist volgt de opleiding %s heet %s %s en heeft rijksregisternr %s%n", 
				getOpleiding(), getVoornaam(), getNaam(), getRijksregisterNummer());
	}
	
	@Override
	public String ontvangGeschenk(){
		return "koekjes";
	}

	@Override
	public String toString() {
		return String.format("%s volgt de opleiding %s",  
				super.toString(), getOpleiding());
	}

	@Override
	public void registreer() {
		System.out.printf("Cursist %s wordt geregistreerd.%n", getVolledigeNaam());
	}

	@Override
	public String getStringVoorConsole() {
		return toString();
	}

	@Override
	public String getIdentificatie() {
		return super.getRijksregisterNummer();
	}

	@Override
	public boolean komtVoor(Object object) {
		if (object == null) {
			return false;
		}
		if (object instanceof Cursist) {
			return this.getRijksregisterNummer().compareTo(((Cursist) object).getRijksregisterNummer()) < 0;
		}
		return false;
	}
	
}
