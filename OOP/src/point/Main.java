package point;

public class Main {

	public static void main(String[] args) {
		Point point = new Point(4, 4);
		System.out.println(point);
		
		Circle circle = new Circle(4, 4, 16);
		System.out.println(circle);
		
		Cylinder cylinder = new Cylinder(4, 4, 5, 5);
		System.out.println(cylinder);
	}
	
}