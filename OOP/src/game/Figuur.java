package game;

public abstract class Figuur {

	private int punten;
	private int level;
	private int aantalLevens;

	public Figuur(int punten, int level, int aantalLevens) {
		this.punten = punten;
		this.level = level;
		this.aantalLevens = aantalLevens;
	}

	public abstract void teken();

	public int getPunten() {
		return punten;
	}

	public void setPunten(int punten) {
		this.punten = punten;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAantalLevens() {
		return aantalLevens;
	}

	public void setAantalLevens(int aantalLevens) {
		this.aantalLevens = aantalLevens;
	}

}
