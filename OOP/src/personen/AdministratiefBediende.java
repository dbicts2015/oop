package personen;

public class AdministratiefBediende extends Personeelslid {

	private boolean kanChinees;

	public AdministratiefBediende(boolean kanChinees) {
		this.kanChinees = kanChinees;
	}

	public AdministratiefBediende(String voornaam, String naam, String rijksregisterNummer, double loon, boolean kanChinees) {
		super(voornaam, naam, rijksregisterNummer, loon);
		this.kanChinees = kanChinees;
	}

	@Override
	public double getBonus() {
		return 5.0 + (kanChinees ? super.getLoon() * 0.10 : 0);
	}

	public boolean isKanChinees() {
		return kanChinees;
	}

	public void setKanChinees(boolean kanChinees) {
		this.kanChinees = kanChinees;
	}

}
