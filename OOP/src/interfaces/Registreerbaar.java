package interfaces;

public interface Registreerbaar {
	void registreer();

	String getStringVoorConsole();

	String getIdentificatie();

	boolean komtVoor(Object object);
}
