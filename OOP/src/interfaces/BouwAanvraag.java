package interfaces;

public class BouwAanvraag implements Registreerbaar{
	private String persoon;
	
	
	public String getPersoon(){
		return persoon;
	}
	
	@Override
	public String getIdentificatie(){
		return "De bouwaanvraag van "+getPersoon()+" is toegekomen.";
	}
	
	@Override
	public String getStringVoorConsole(){
		return "Wij moeten helaas de bouwaanvraag weigeren. We begrijpen dat U graag"+
	" een tweede huis wilt, maar we zijn bang dat we jou betalingsmethode niet aanvaarden."+
				" Wij werken namelijk enkel met geld, en met niet gummybears.\nMet vriendelijke"+
	" groeten\nMeneer Meneer";
	}
	
	@Override
	public void registreer(){
		persoon = "gek";
	}
	
	@Override
	public boolean komtVoor(Object object){
		if (object.equals("Een normaal voorstel")){
			return true;
		}
		else{
			return false;
		}
	}

}
