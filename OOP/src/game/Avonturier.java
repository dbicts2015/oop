package game;

public abstract class Avonturier extends Figuur {

	private String wapen;

	public Avonturier(int punten, int level, int aantalLevens, String wapen) {
		super(punten, level, aantalLevens);
		this.wapen = wapen;
	}

	public String getWapen() {
		return wapen;
	}

	public void setWapen(String wapen) {
		this.wapen = wapen;
	}

}