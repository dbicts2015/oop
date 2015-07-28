package interfaces;


//public class CD implements Age{
public class CD implements Registreerbaar{
	
	private String artiest, titel;
	private int jaar;
	
	

//	@Override
//	public int getAge() {
//		return getCurrentYear()-getJaar();
//	}
	
//	 private int getCurrentYear(){
//	        Calendar kalender = Calendar.getInstance();
//	        return kalender.get(Calendar.YEAR);
//	    }

//	@Override
//	public String getName() {
//		return titel;
//	}

	public String getArtiest() {
		return artiest;
	}

	public void setArtiest(String artiest) {
		this.artiest = artiest;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getJaar() {
		return jaar;
	}

	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

	@Override
	public void registreer() {
		System.out.println("CD Geregistreerd");
	}

	@Override
	public String getStringVoorConsole() {
		return String.format("CDConsoleString");
	}

	@Override
	public String getIdentificatie() {
		return String.format("CDIdentificatie");
	}

	@Override
	public boolean komtVoor(Object object) {
		System.out.println("Brentson komt voor alles");
		return true;
	}
	
	

}
