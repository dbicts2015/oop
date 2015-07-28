package enumerations.paneel;

import enumerations.paneel.VerwarmingscircuitPaneel.Mode;

public class Main {

	public static void main(String[] args) {
		VerwarmingscircuitPaneel paneel = new VerwarmingscircuitPaneel(
				(byte) 5, (byte) 22, (byte) 20, (byte) 15);
		System.out.println(paneel);

		paneel.setMode(Mode.NORMAL);
		paneel.setStartUurDag((byte) (paneel.getStartUurDag() + 1));
		paneel.setEindUurDag((byte) (paneel.getEindUurDag() + 1));
		paneel.setDagTemperatuur((byte) (paneel.getDagTemperatuur() + 1));
		paneel.setNachtTemperatuur((byte) (paneel.getNachtTemperatuur() + 1));
		System.out.println(paneel);

		paneel.setMode(Mode.ECONOMY);
		System.out.println(paneel);

		paneel.setMode(Mode.PARTY);
		System.out.println(paneel);

	}

}
