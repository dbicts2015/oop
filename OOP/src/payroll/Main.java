package payroll;

public class Main {

	public static void main(String[] args) {
		Werknemer[] werknemers = new Werknemer[4];
		
		werknemers[0] = new Bediende("hannes", "lowette", "321654987", 8000);
		werknemers[1] = new Arbeider("Karel", "Frans", "420", 12.85);
		werknemers[2] = new Verkoper("Bart", "Plank", "69", 0.10);
		werknemers[3] = new VerkoperComissie("Frits", "Frats", "420.69", 0.10, 6969);
		
		((Arbeider) werknemers[1]).setUren(40);
		((Verkoper) werknemers[2]).setVerkoop(10000);
		((VerkoperComissie) werknemers[3]).setVerkoop(20000);
		
		for (Werknemer werknemer : werknemers) {
			System.out.println(werknemer);
		}
		
		((VerkoperComissie) werknemers[3]).geefPromotie(1.10);
		
		for (Werknemer werknemer : werknemers) {
			System.out.println(werknemer);
		}
	}

}