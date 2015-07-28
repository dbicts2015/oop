package personen.evenement;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main02 {

	private static final Map<Integer, Class<? extends Evenement>> CLASSES = new HashMap<>();
	
	static {
		CLASSES.put(1, BedrijfsFeest.class);
		CLASSES.put(2, Evenement.class);
		CLASSES.put(3, Verjaardagsfeest.class);
	}

	public static void main(String[] args) throws Exception {
		Evenement[] evenementen = new Evenement[10];
		Scanner scanner = new Scanner(System.in);
		
		for (Entry<Integer, Class<? extends Evenement>> entry : CLASSES.entrySet()) {
			System.out.println("Voor " + entry.getValue().getSimpleName() + " geef " + entry.getKey());
		}

		System.out.println("om te stoppen, geef 0");
		
		for (int i = 0; i < evenementen.length; i++) {
			System.out.printf("Geef het type van persoon: ");
			int index = Integer.parseInt(scanner.nextLine());
			
			if (index == 0) {
				break;
			}
			
			Constructor<? extends Evenement> constr = CLASSES.get(index).getConstructor(new Class<?>[0]);
			evenementen[i] = constr.newInstance();
			evenementen[i].vraagGegevens(scanner);
		}

		
		for (Evenement evenement : evenementen) {
			if (evenement != null) {
				System.out.println(evenement.toString());
			}
		}
		
		EvenementStatistiek statistieken = new EvenementStatistiek(evenementen);
		System.out.println("Aantal bedrijsfeesten = " + statistieken.getAantalBedrijfsFeesten());
		System.out.println("Aantal verjaardagsfeesten = " + statistieken.getAantalVerjaardagsFeesten());
		System.out.println("Aantal andere = " + statistieken.getAantalEvenementen());
		System.out.println("Totale kost = " + statistieken.getTotaleKostPrijs());
		
		scanner.close();
	}

}