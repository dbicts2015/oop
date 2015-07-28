package game;

public abstract class Monster extends Figuur {

	private int kracht;
	private int grootte;

	public Monster(int punten, int level, int aantalLevens, int kracht,
			int grootte) {
		super(punten, level, aantalLevens);
		this.kracht = kracht;
		this.grootte = grootte;
	}

	@Override
	public void teken() {
		System.out.print(grootte > 75 ? "grote " : "kleine ");
		System.out.printf("tekening van een %s met %s levens%n", this.getClass().getSimpleName(), super.getAantalLevens());
	}

	public int getKracht() {
		return kracht;
	}

	public void setKracht(int kracht) {
		this.kracht = kracht;
	}

	public int getGrootte() {
		return grootte;
	}

	public void setGrootte(int grootte) {
		this.grootte = grootte;
	}

}