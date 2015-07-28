package interfaces;

public class Plant implements Registreerbaar {
	
	private String naam;

	@Override
	public void registreer() {
		System.out.println("De plant wordt geregistreerd");
		
	}

	@Override
	public String getStringVoorConsole() {
		
		return "ik vat m echt ni";
	}

	@Override
	public String getIdentificatie() {
		
		return "voor de lol";
	}

	@Override
	public boolean komtVoor(Object object) {
		if (object != null) {
			return true;
		} else {
			return false;
		}
		
	}

}
