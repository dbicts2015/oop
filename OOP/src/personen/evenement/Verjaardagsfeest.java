package personen.evenement;

import java.time.LocalDate;
import java.util.Scanner;

public class Verjaardagsfeest extends Evenement {

	private LocalDate geboorteDatum = LocalDate.now();
	private String jarige = "";

	public Verjaardagsfeest() {
		
	}

	public Verjaardagsfeest(int dag, int maand, int jaar, int aantalDeelnemers,
			double kostPerDeelnemer, int d_geboorte, int m_geboorte, int j_geboorte, String jarige) {
		super(dag, maand, jaar, aantalDeelnemers, kostPerDeelnemer);
		
		this.geboorteDatum = LocalDate.of(j_geboorte, m_geboorte, d_geboorte);
		this.jarige = jarige;
	}

	@Override
	public void vraagGegevens(Scanner scanner) {
		super.vraagGegevens(scanner);
		
		this.jarige = requestInput(scanner, "Geef de naam van de jarige");
		String date = requestInput(scanner, "Geef de geboortedatum van de jarige (dd/MM/yyyy)");
		String[] parts = date.split("/");
		this.geboorteDatum = LocalDate.of(Integer.parseInt(parts[2]), Integer.parseInt(parts[1]), Integer.parseInt(parts[0]));
	}
	
	/*
	 * setGegevens om de jarige,het aantal deelnemers en de kost per deelnemer te kunnen
	 * wijzigen in door te geven waarden.
	 */
	public void setGegevens(String jarige, int aantalDeelnemers, double kostPerDeelnemer) {
		super.setGegevens(aantalDeelnemers, kostPerDeelnemer);
		this.jarige = jarige;
	}

	public int getLeeftijdJarige() {
		return geboorteDatum.until(super.getDatum()).getYears();
	}

	public LocalDate getGeboorteDatum() {
		return geboorteDatum;
	}

	public void setGeboorteDatum(int dag, int maand, int jaar) {
		this.geboorteDatum = LocalDate.of(jaar, maand, dag);
	}

	public String getJarige() {
		return jarige;
	}

	public void setJarige(String jarige) {
		this.jarige = jarige;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Dit is het verjaardagfeest van " + jarige + " die " + getLeeftijdJarige() + " zal zijn.";
	}

}