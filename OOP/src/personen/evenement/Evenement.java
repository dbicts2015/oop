package personen.evenement;

import java.time.LocalDate;
import java.util.Scanner;

public class Evenement {

	private LocalDate datum = LocalDate.now();
	private int aantalDeelnemers;
	private double kostPerDeelnemer;

	public Evenement() {
		
	}

	public Evenement(int dag, int maand, int jaar, int aantalDeelnemers, double kostPerDeelnemer) {
		this.datum = LocalDate.of(jaar, maand, dag);
		this.aantalDeelnemers = aantalDeelnemers;
		this.kostPerDeelnemer = kostPerDeelnemer;
	}

	public void setGegevens(int aantalDeelnemers, double kostPerDeelnemer) {
		this.aantalDeelnemers = aantalDeelnemers;
		this.kostPerDeelnemer = kostPerDeelnemer;
	}

	public void setGegevens(int dag, int maand, int jaar, int aantalDeelnemers, double kostPerDeelnemer) {
		this.datum = LocalDate.of(jaar, maand, dag);
		this.aantalDeelnemers = aantalDeelnemers;
		this.kostPerDeelnemer = kostPerDeelnemer;
	}
	

	public void vraagGegevens(Scanner scanner) {
		String date = requestInput(scanner, "Geef de datum (dd/MM/yyyy)");
		String[] parts = date.split("/");
		
		this.datum = LocalDate.of(Integer.parseInt(parts[2]), Integer.parseInt(parts[1]), Integer.parseInt(parts[0]));
		this.aantalDeelnemers = Integer.parseInt(requestInput(scanner, "Geef het aantal deelnemers"));
		this.kostPerDeelnemer = Double.parseDouble(requestInput(scanner, "Geef de kost per deelnemer"));
	}

	public int getAantalDeelnemers() {
		return aantalDeelnemers;
	}

	public void setAantalDeelnemers(int aantalDeelnemers) {
		this.aantalDeelnemers = aantalDeelnemers < 0 ? 0 : aantalDeelnemers;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(int dag, int maand, int jaar) {
		this.datum = LocalDate.of(jaar, maand, dag);
	}

	public double getKostPrijs() {
		return aantalDeelnemers * kostPerDeelnemer;
	}

	public double getKostPerDeelnemer() {
		return kostPerDeelnemer;
	}

	public void setKostPerDeelnemer(double kostPerDeelnemer) {
		this.kostPerDeelnemer = kostPerDeelnemer;
	}

	
	@Override
	public String toString() {
		return String.format("Het evenement is op %s. Hier komen %d mensen op af en zal %.2f kosten.",
						datum, aantalDeelnemers, getKostPrijs());
	}

	protected String requestInput(Scanner scanner, String text) {
		System.out.print(text + ": ");
		return scanner.nextLine();
	}

}
