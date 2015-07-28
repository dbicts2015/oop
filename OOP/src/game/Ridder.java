package game;

public class Ridder extends Avonturier {

	private String vaandel;

	public Ridder(int punten, int level, int aantalLevens, String wapen,
			String vaandel) {
		super(punten, level, aantalLevens, wapen);
		this.vaandel = vaandel;
	}

	public String getVaandel() {
		return vaandel;
	}

	public void setVaandel(String vaandel) {
		this.vaandel = vaandel;
	}

	@Override
	public void teken() {
		System.out.printf("tekening van een %s met %s levens%n", this.getClass().getSimpleName(), super.getAantalLevens());
	}

}