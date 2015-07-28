package verkopers;

public class RouteVerkoper extends Verkoper {

	private String route;

	public RouteVerkoper(String naam) {
		super(naam);
	}

	public RouteVerkoper(String naam, String route) {
		super(naam);
		this.route = route;
	}

	@Override
	public String getIndividueelVerkoopsPraatje() {
		return String.format("Ik ben op mijn route in %s, dus kom ik even langs.", route);
	}

}