package personen;

import java.util.Scanner;

public class Lesgever extends Personeelslid{
	private String specialisatie;
	
	public Lesgever() {
		
	}
	
	@Override
	public void vraagGegevens(Scanner scanner) {
		super.vraagGegevens(scanner);
		specialisatie = MainMetPersoonTabel2.requestInput(scanner, "Geef de rrn");
	}

	public Lesgever(String voornaam, String naam, String rijksregisterNummer,double loon,String specialisatie) {
		super(voornaam, naam, rijksregisterNummer, loon);
		setSpecialisatie(specialisatie);
	}

	public String getSpecialisatie() {
		return specialisatie;
	}

	public void setSpecialisatie(String specialisatie) {
		this.specialisatie = specialisatie;
	}

	@Override
	public double getBonus() {
		return 100.0;
	}

}
