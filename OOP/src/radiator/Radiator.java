package radiator;

public class Radiator {

	public static final byte MAX_STAND = 5;
	public static final byte MIN_STAND = 0;

	private boolean staatAan;
	private byte stand;

	private static boolean isGeldigeStand(byte stand) {
		return stand >= MIN_STAND && stand <= MAX_STAND;
	}
	

	public void zetAan() {
		staatAan = true;
	}

	public void zetAf() {
		staatAan = false;
	}

	public void zetStand(byte stand) {
		this.stand = isGeldigeStand(stand) ? stand : this.stand;
	}

	public double getTemperatuur() {
		return staatAan ? 15 + (stand - 1) * 2.5 : 0;
	}

	@Override
	public String toString() {
		return String.format("De radiator staat %s en op stand %d%nDe temperatuur is %f.", staatAan ? "aan" : "uit", stand, getTemperatuur());
	}

}
