package pointinheritance;

public class Main {

	public static void main(String[] args) {
		Point point = new Point(1, 2);
		System.out.println(point);

		Circle circle = new Circle(1.0, 3, 4);
		System.out.println(circle);
		System.out.printf("oppervlakte van de cirkel met straal %.2f = %.2f\n",
				circle.getRadius(), circle.area());

		Cylinder cylinder = new Cylinder(10.0, 1.0, 5, 6);
		System.out.println(cylinder);
		System.out
				.printf("Een cylinder met straal %.2f en hoogte %.2f heeft oppervlakte %.2f en volume %.2f\n",
						cylinder.getRadius(), cylinder.getHeight(),
						cylinder.area(), cylinder.volume());

		point = null;
		circle = null;
		cylinder = null;
		System.gc();
	}

}
