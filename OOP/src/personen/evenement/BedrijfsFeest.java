package personen.evenement;

import java.util.Scanner;

/**
 * Voeg een klasse BedrijfsFeest toe. Een Bedrijfsfeest is een evenement met een
 * btw-nr (String) en een firma (String). Btw-nr en firma moeten ingevuld en
 * opgevraagd kunnen worden.
 * 
 * @author user104
 *
 */
public class BedrijfsFeest extends Evenement {

	private String btwNummer;
	private String firma;

	public BedrijfsFeest() {
		
	}

	public BedrijfsFeest(int dag, int maand, int jaar, int aantalDeelnemers,
			double kostPerDeelnemer, String btwNummer, String firma) {
		super(dag, maand, jaar, aantalDeelnemers, kostPerDeelnemer);
		this.btwNummer = btwNummer;
		this.firma = firma;
	}

	@Override
	public void vraagGegevens(Scanner scanner) {
		super.vraagGegevens(scanner);

		this.firma = requestInput(scanner, "Geef de firma");
		this.btwNummer = requestInput(scanner, "Geef de btw nummer");
	}

	/**
	 * Minder dan 50 deelnemers => kostprijs = aantalDeelnemers * kostPerDeelnemer
	 * 
	 * 100 of meer deelnemers => kostprijs = 90% van aantalDeelnemers * kostPerDeelnemer
	 * (m.a.w. 10% korting)
	 * Anders => kostprijs = 95% van aantalDeelnemers * kostPerDeelnemer  (m.a.w. 5% korting)
	 * 
	 */
	@Override
	public double getKostPrijs() {
		if (super.getAantalDeelnemers() < 50) {
			return super.getAantalDeelnemers() * super.getKostPerDeelnemer();
		}
		else if (super.getAantalDeelnemers() > 100) {
			return super.getAantalDeelnemers() * super.getKostPerDeelnemer() * 0.90d;
		}
		else {
			return super.getAantalDeelnemers() * super.getKostPerDeelnemer() * 0.95d;
		}
	}

	public void setGegevens(String btwNummer, int aantalDeelnemers, double kostPerDeelnemer) {
		super.setGegevens(aantalDeelnemers, kostPerDeelnemer);
		this.btwNummer = btwNummer;
	}

	public String getBtwNummer() {
		return btwNummer;
	}

	public void setBtwNummer(String btwNummer) {
		this.btwNummer = btwNummer;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Dit wordt georganiseerd door het bedrijf " + firma + ".";
	}

}