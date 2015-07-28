package interfaces;

public class PC implements Registreerbaar {
	
	@Override
	public void registreer() {
		System.out.println("De PC werd geregistreerd!");
	}

	@Override
	public String getStringVoorConsole() {
		return "Hello, world!";
	}

	@Override
	public String getIdentificatie() {
		return "Apple IIe";
	}

	@Override
	public boolean komtVoor(Object object) {
		return this.hashCode() < object.hashCode();
	}

}
