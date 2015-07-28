package pointinheritance2;

public class Circle extends Point {
	protected double radius;

	public Circle() {
		// impliciete oproep van de superclass-constructor
		setRadius(0.0);
		System.out.println("Circle constructor: " + this);
	}

	public Circle(double circleRadius, int xCoord, int yCoord) {
		// oproep van de superclass-constructor:
		super(xCoord, yCoord);
		setRadius(circleRadius);
		System.out.println("Circle constructor: " + this);
	}

	@Override
	protected void finalize() {
		System.out.println("Circle finalizer: " + this);
		super.finalize();
	}

	public void setRadius(double circleRadius) {
		radius = (circleRadius >= 0.0 ? circleRadius : 0.0);
	}

	public double getRadius() {
		return radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Center = " + "[" + x + "," + y + "]" + "; Radius = " + radius;
	}
} // einde klasse Circle