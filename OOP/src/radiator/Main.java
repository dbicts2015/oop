package radiator;

public class Main {

	public static void main(String[] args) {
		Radiator radiator = new Radiator();
		System.out.println(radiator);
		radiator.zetAan();
		radiator.zetStand((byte) 5);
		System.out.println(radiator.getTemperatuur());
		System.out.println(radiator);
		radiator.zetStand((byte) 3);
		System.out.println(radiator);
		radiator.zetStand((byte) 7);
		System.out.println(radiator);
		radiator.zetStand((byte) -1);
		System.out.println(radiator);
		radiator.zetAf();
		System.out.println(radiator);
	}

}