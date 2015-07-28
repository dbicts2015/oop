package personen;

import interfaces.Registreerbaar;

public class Main02 {

	public static void main(String[] args) {
		Cursist cursist = new Cursist("Hannes", "Lowette", "6969696969", "Java EE Ontwikkelaar");
		
		Registreerbaar registreerbaar = cursist;
		registreerbaar.registreer();
	}

}