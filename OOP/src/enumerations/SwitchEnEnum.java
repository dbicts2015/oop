package enumerations;

public class SwitchEnEnum {

	public static void main(String[] args) {
		Seizoenen seizoen = Seizoenen.LENTE;

		/*
		 * als de expressie na een switch een enum is mag je bij de cases de
		 * naam van de enum niet te noteren
		 */
		switch (seizoen) {
		// case Seizoenen.LENTE: // compileerfout
		case LENTE:
			System.out.println("De natuur ontwaakt...");
			break;
		case ZOMER:
			System.out.println("Vakantie...");
			break;
		default:
			System.out.println("Tja...");
		}
	}
}
