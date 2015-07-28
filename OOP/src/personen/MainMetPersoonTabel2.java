package personen;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MainMetPersoonTabel2 {

	private static final Map<Integer, Class<? extends Persoon>> CLASSES = new HashMap<>();
	
	static {
		CLASSES.put(1, Cursist.class);
		CLASSES.put(2, Persoon.class);
		CLASSES.put(3, Lesgever.class);
		CLASSES.put(4, Personeelslid.class);
	}

	public static void main(String[] args) throws Exception {
		Persoon[] personen = new Persoon[10];
		Scanner scanner = new Scanner(System.in);
		
		for (Entry<Integer, Class<? extends Persoon>> entry : CLASSES.entrySet()) {
			System.out.println("Voor " + entry.getValue().getSimpleName() + " geef " + entry.getKey());
		}
		System.out.println("om te stoppen, geef 0");
		
		for (int i = 0; i < personen.length; i++) {
			System.out.printf("Geef het type van persoon: ");
			int index = Integer.parseInt(scanner.nextLine());
			
			if (index == 0) {
				break;
			}
			
			Constructor<? extends Persoon> constr = CLASSES.get(index).getConstructor(new Class<?>[0]);
			personen[i] = constr.newInstance();
			personen[i].vraagGegevens(scanner);
		}

		int lesgevers = 0;
		for (Persoon persoon : personen) {
			if (persoon != null) {
				if (persoon instanceof Lesgever) {
					lesgevers++;
				}
				System.out.println("De " + persoon.getClass().getSimpleName().toLowerCase() + " ontvangt " + persoon.ontvangGeschenk());
			}
		}
		System.out.printf("Er zijn %d lesgever(s) aanwezig", lesgevers);
		scanner.close();
	}

	public static String requestInput(Scanner scanner, String text) {
		System.out.print(text + ": ");
		return scanner.nextLine();
	}

}