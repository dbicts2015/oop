package verkopers;

public class SalesEngineer extends Verkoper {

	private String kennis;

	public SalesEngineer(String naam) {
		super(naam);
	}

	public SalesEngineer(String naam, String kennis) {
		super(naam);
		this.kennis = kennis;
	}

	@Override
	public String getIndividueelVerkoopsPraatje() {
		return String.format("Dankzij mijn uitstekende kennis over %s weet ik zeker dat ons product een boost zal geven aan uw business.", kennis);
	}

}
