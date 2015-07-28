package verkopers;

public class MerkartikelenVertegenwoordiger extends Verkoper {

	private String merk;

	public MerkartikelenVertegenwoordiger(String naam, String merk) {
		super(naam);
		
		this.merk = merk;
	}

	@Override
	public String getIndividueelVerkoopsPraatje() {
		return String.format("De merken van %s zijn fantastisch!", merk);
	}

}
