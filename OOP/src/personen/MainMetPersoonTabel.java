package personen;

import java.util.Scanner;

public class MainMetPersoonTabel {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Persoon[] personen = new Persoon[6];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < personen.length; i++) {
			System.out.print("Van welk type wilt u een nieuwe persoon aanmaken? ");
			switch (scanner.nextLine()) {
			case "Cursist":
				personen[i] = new Cursist("Hannes", "Lowette", "030303030", "java EE");
				break;
			case "Lesgever":
				personen[i] = new Lesgever("Hannes", "Lowette", "030303030", 100000D, "Alles");
				break;
//			case "Personeelslid":
//				personen[i] = new Personeelslid("Hannes", "Lowette", "030303030", 5106510D);
//				break;
//			case "Persoon":
//				personen[i] = new Persoon("Hano", "Nator", "69.420");
//				break;
			}
			
		}

		int lesgevers = 0;
		for (Persoon persoon : personen) {
			if (persoon instanceof Lesgever) {
				lesgevers++;
			}
			System.out.println("De " + persoon.getClass().getSimpleName().toLowerCase() + " ontvangt " + persoon.ontvangGeschenk());
		}
		System.out.printf("Er zijn %d lesgever(s) aanwezig", lesgevers);
		scanner.close();
	}

}