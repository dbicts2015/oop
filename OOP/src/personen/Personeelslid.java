package personen;

import interfaces.Age;
import interfaces.Registreerbaar;

import java.util.Scanner;

public abstract class Personeelslid extends Persoon implements Registreerbaar, Age {
	private double loon;

	public Personeelslid() {
	}

	public Personeelslid(String voornaam, String naam,
			String rijksregisterNummer, double loon) {
		super(voornaam, naam, rijksregisterNummer);
		setLoon(loon);
	}

	public abstract double getBonus();

	@Override
	public void vraagGegevens(Scanner scanner) {
		super.vraagGegevens(scanner);
		loon = Double.parseDouble(MainMetPersoonTabel2.requestInput(scanner, "Geef het loon"));
	}

	public double getLoon() {
		return loon;
	}

	public void setLoon(double loon) {
		this.loon = loon;
	}
	
	@Override
	public String ontvangGeschenk(){
		double tmp = loon * .1;
		return String.format("%s plus euro %s", super.ontvangGeschenk(), tmp);
	}
	
	@Override 
	public String toString() {
		return String.format("%s heeft loon %s met als bonus %.2f",  
				super.toString(), getLoon(), getBonus());
	}

	@Override
	public int getAge() {
		return 24;
	}

	@Override
	public String getName() {
		return super.getVolledigeNaam();
	}

	@Override
	public void registreer() {
		System.out.println("YEA BRO REGISTER THIS SHIZZ");
	}

	@Override
	public String getStringVoorConsole() {
		return "Voor Console";
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
		if (object instanceof Personeelslid) {
			return this.getRijksregisterNummer().compareTo(((Personeelslid) object).getRijksregisterNummer()) < 0;
		}
		return false;
	}

}
