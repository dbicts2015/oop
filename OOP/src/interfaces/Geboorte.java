package interfaces;

public class Geboorte implements Registreerbaar {

	@Override
	public void registreer() {
		System.out.println("Ik ben net geboren en ben al geregistreerd.");
	}

	@Override
	public String getStringVoorConsole() {
		return "Een string vanuit geboorte naar de console voor didactische redenen";
	}

	@Override
	public String getIdentificatie() {
		StringBuilder bldr = new StringBuilder();
		bldr.append("         |\\").append("\n");
		bldr.append("         |-\\").append("\n");
		bldr.append("         |--\\").append("\n");
		bldr.append("         |---\\").append("\n");
		bldr.append("         |----\\").append("\n");
		bldr.append("         |-----\\").append("\n");
		bldr.append("         |------\\").append("\n");
		bldr.append("       / |-------\\").append("\n");
		bldr.append("      /| |--------\\").append("\n");
		bldr.append("     /-| |---------\\").append("\n");
		bldr.append("    /--| |----------\\").append("\n");
		bldr.append("   /---| |-----------\\").append("\n");
		bldr.append("  /----| |------------\\").append("\n");
		bldr.append(" /_____| |-------------\\").append("\n");
		bldr.append("/       |_______________\\").append("\n");
		bldr.append("\\------------------------|").append("\n");
		bldr.append(" \\                       |").append("\n");
		bldr.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~").append("\n");
		return bldr.toString();
	}

	@Override
	public boolean komtVoor(Object object) {
		return object.getClass().getSimpleName().compareTo(this.getClass().getSimpleName()) > 0;
	}

}
