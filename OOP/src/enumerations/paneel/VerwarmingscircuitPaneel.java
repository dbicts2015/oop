package enumerations.paneel;

import java.time.LocalTime;

public class VerwarmingscircuitPaneel {

	public static final byte MIN_TEMPERATUUR = -40;
	public static final byte MAX_TEMPERATUUR = 50;

	private Mode mode;
	private byte startUurDag;
	private byte eindUurDag = 22;
	private byte dagTemperatuur;
	private byte nachtTemperatuur;

	public VerwarmingscircuitPaneel(byte startUurDag, byte eindUurDag, byte dagTemperatuur, byte nachtTemperatuur) {
		this.mode = Mode.OFF;
		this.startUurDag = startUurDag;
		this.eindUurDag = eindUurDag;
		this.dagTemperatuur = dagTemperatuur;
		this.nachtTemperatuur = nachtTemperatuur;
	}

	@Override
	public String toString() {
		return String.format("Mode: %s%nTemperatuur van 6u tot 23u: %d°%n"
				+ "Temperatuur van 23u tot 6u: %d°%nHuidige kamertemperatuur: %d°%n"
				, mode.toString().toLowerCase(), dagTemperatuur, nachtTemperatuur, getKamerTemperatuur());
	}

	public byte getKamerTemperatuur() {
		switch (mode) {
		case OFF:
			return 0;
		case ECONOMY:
			return nachtTemperatuur;
		case NORMAL:
			return getNormalModeKamerTemperatuur();
		case PARTY:
			return dagTemperatuur;
		default:
			throw new IllegalStateException();
		}
	}

	public byte getStartUurDag() {
		return startUurDag;
	}

	public void setStartUurDag(byte startUurDag) {
		if (!isGeldigStartUurInDag(eindUurDag))
			throw new IllegalArgumentException();
		this.startUurDag = startUurDag;
	}

	public byte getEindUurDag() {
		return eindUurDag;
	}

	public void setEindUurDag(byte eindUurDag) {
		if (!isGeldigEindUurInDag(eindUurDag))
			throw new IllegalArgumentException();
		this.eindUurDag = eindUurDag;
	}

	public byte getDagTemperatuur() {
		return dagTemperatuur;
	}

	public void setDagTemperatuur(byte dagTemperatuur) {
		if (!isGeldigeTemperatuur(dagTemperatuur))
			throw new IllegalArgumentException();
		this.dagTemperatuur = dagTemperatuur;
	}

	public byte getNachtTemperatuur() {
		return nachtTemperatuur;
	}

	public void setNachtTemperatuur(byte nachtTemperatuur) {
		if (!isGeldigeTemperatuur(nachtTemperatuur))
			throw new IllegalArgumentException();
		this.nachtTemperatuur = nachtTemperatuur;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	private boolean isGeldigStartUurInDag(byte value) {
		return value >= 0 && value <= eindUurDag;
	}

	private boolean isGeldigEindUurInDag(byte value) {
		return value >= startUurDag && value <= 24;
	}

	private boolean isGeldigeTemperatuur(byte value) {
		return value >= MIN_TEMPERATUUR && value <= MAX_TEMPERATUUR;
	}

	private byte getNormalModeKamerTemperatuur() {
		return isHuidigUurInDag() ? dagTemperatuur : nachtTemperatuur;
	}

	private int getHuidigUur() {
		return LocalTime.now().getHour();
	}

	private boolean isHuidigUurInDag() {
		int uur = getHuidigUur();
		return uur <= startUurDag && uur <= eindUurDag;
	}

	public static enum Mode {
		OFF, NORMAL, PARTY, ECONOMY;
	}

}