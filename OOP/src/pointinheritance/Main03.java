package pointinheritance;


public class Main03 {

	public static void main(String[] args) {
		Point[] points = new Point[100];
		points[0] = new Point(1, 2);
		points[1] = new Circle(1, 0, 0);
		points[2] = new Cylinder(10, 1, 20, 20);
		points[3] = new Point(10, 20);
		points[4] = new Circle(10, 0, 0);
		points[50] = new Cylinder(10, 10, 2, 2);

		System.out.println("gegevens uit de array:");
		for (int i = 0; i < points.length; i++) {
			if (points[i] != null) {
				// enkel ingevulde elementen verwerken
				String tmp = points[i].toString();
				System.out.println(tmp);
			}
		}

		System.out.println("met enhanced for:");
		for (Point point : points) {
			if (point != null) {
				String tmp = point.toString();
				System.out.println(tmp);

				// als het een Circle is, oppervlakte tonen
				if (point instanceof Circle) {
					System.out.println("een cirkel (of object van een subklasse van Circle) gevonden");
					if (!(point instanceof Cylinder)) {
						// Hans wil de oppervlakte van cylinders niet zien ;-)
						
						// Circle cirkel = point; // compileerfout

						// downcast (iets algemeen casten naar iets
						// specifieker):
						Circle cirkel = (Circle) point;
						double area = cirkel.area();
						System.out.printf("oppervlakte: %.2f\n", area);
					}
				}
			}
		}
	}
}
