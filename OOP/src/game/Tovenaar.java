package game;

public class Tovenaar extends Avonturier {

	private String[] spreuken;

	public Tovenaar(int punten, int level, int aantalLevens, String wapen, String... spreuken) {
		super(punten, level, aantalLevens, wapen);
		this.spreuken = spreuken;
	}

	@Override
	public void teken() {
		StringBuilder builder = new StringBuilder("Ik kan alleen maar ").append(spreuken[0]);
		for (int i = 1; i < spreuken.length; i++) {
			builder.append(" en ").append(spreuken[i]);
		}
		System.out.println(builder);
	}

	public String[] getSpreuken() {
		return spreuken;
	}

	public void setSpreuken(String[] spreuken) {
		this.spreuken = spreuken;
	}

	public String getSpreuk(int index) {
		return spreuken[index];
	}

}