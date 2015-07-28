package game;

public class Main {

	public static void main(String[] args) {
		Figuur[] figuren = new Figuur[8];
		
		// figuren[0] = new Ridder(1, 1, 0, "ne knots", "vandeel");
		
		// figuren[1] = new Avonturier(10, 1, 10, "ne knuppel");
		figuren[2] = new Ridder(6, 1, 10, "ne stok", "kweniwadeesis");
		figuren[3] = new Tovenaar(9, 1, 10, "ne magische stok", "vies kijke", "speke");
		
		// figuren[4] = new Monster(4, 1, 1, 5, 10);
		figuren[5] = new LandMonster(10, 1, 10, 5, 100);
		figuren[6] = new LuchtMonster(10, 1, 10, 5, 95);
		figuren[7] = new ZeeMonster(7, 1, 10, 8, 100);
		
		
		for (Figuur figuur : figuren) {
			if (figuur == null) {
				continue;
			}
			if (figuur instanceof Monster) {
				((Monster) figuur).setKracht(1);
			}
			figuur.teken();
		}
	}

}