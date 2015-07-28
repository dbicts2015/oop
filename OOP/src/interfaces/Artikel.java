package interfaces;

public class Artikel implements Registreerbaar {

	private String auteur;
	
	private String code;
	
	private int volgnummer =0;
	
	
	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public int getVolgnummer() {
		return volgnummer;
	}

	public Artikel()
	{
		
	}

	public Artikel(String auteur, String code, int volgnummer) {
		super();
		this.auteur = auteur;
		this.code = code;
		this.volgnummer = volgnummer;
		volgnummer++;
	}
	

	@Override
	public void registreer( ) {
		// TODO Auto-generated method stub
		System.out.println("Het artikel is papegaai");
		
	}

	@Override
	public String getStringVoorConsole() {
		// TODO Auto-generated method stub
		
		return String.format("Het artikel "+this.getCode()+" met auteur"+getAuteur() +"en code "+getVolgnummer()+ "wordt hier nu getoond");
	}

	@Override
	public String getIdentificatie() {
		// TODO Auto-generated method stub
		return String.format("de identificatie  is "+getCode());
	}

	@Override
	public boolean komtVoor(Object object) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

}
