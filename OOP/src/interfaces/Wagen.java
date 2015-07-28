package interfaces;

public class Wagen implements Registreerbaar {

	private String merk;
	private String chassisnummer;
	private int kostPrijs;
	
	public Wagen() {
		super();
	}
	
	public Wagen(String merk, String chassisnummer, int kostPrijs) {
		super();
		this.merk = merk;
		this.chassisnummer = chassisnummer;
		this.kostPrijs = kostPrijs;
	}
	
	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getChassisnummer() {
		return chassisnummer;
	}

	public void setChassisnummer(String chassisnummer) {
		this.chassisnummer = chassisnummer;
	}

	public int getKostPrijs() {
		return kostPrijs;
	}

	public void setKostPrijs(int kostPrijs) {
		this.kostPrijs = kostPrijs;
	}
	
	@Override
	public void registreer() {
		System.out.println("Vrooooom Vrooooooom. Kijk uit! Er komt een nieuwe wagen aan!");
	}

	@Override
	public String getStringVoorConsole() {
		return "... testing console ...";
	}

	@Override
	public String getIdentificatie() {
		return "Het chassisnummer van de wagen is: ";
	}

	@Override
	public boolean komtVoor(Object object) {
		return false;
	}

}
