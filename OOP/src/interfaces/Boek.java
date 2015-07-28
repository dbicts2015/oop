package interfaces;

public class Boek implements Registreerbaar {
	
	private String isbn="ISBN:XXX-bbb-ccc-yy";
	private String titel="onbekend";
	private String auteur="onbekend";
	
    

	public Boek() {
		//super();
	}


	public Boek(String isbn, String titel, String auteur) {
		//super();
		setIsbn(isbn);
		setTitel(titel);
		setAuteur(auteur);
	}

	
	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitel() {
		return titel;
	}


	public void setTitel(String titel) {
		this.titel = titel;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public void registreer( ){
    	System.out.println("Geen registratie boek gevonden!!!Gelieve onmiddelijk het gebouw te verlaten.");
    }
    	@Override
    public  String getStringVoorConsole(){
    	
    	return "Boek \" "+getTitel() +"\"van auteur " +getAuteur() + " met ISBN nummer " +getIsbn();
    }
    	@Override
    public String getIdentificatie(){
    	return getIsbn();
    }
    
	@Override
    public boolean komtVoor(Object object){
    	if(object instanceof Boek)
    		return true;
    		else
    			return false;
    }
    

}
