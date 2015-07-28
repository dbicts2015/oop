package pointinheritance2;

public class Cylinder extends Circle {
	protected double height;

	public Cylinder() {
		// impliciete aanroep van de superklasse-constructor
		setHeight(0);
		System.out.println("Cylinder constructor: " + this);
	}

	public Cylinder(double cylinderHeight, double cylinderRadius, int xCoord,
			int yCoord) {
		super(cylinderRadius, xCoord, yCoord);
		setHeight(cylinderHeight);
		System.out.println("Cylinder constructor: " + this);
	}

	@Override
	protected void finalize() {
		System.out.println("Cylinder finalizer: " + this);
	}

	public void setHeight(double cylinderHeight) {
		height = (cylinderHeight >= 0.0 ? cylinderHeight : 0.0);
	}

	public double getHeight() {
		return height;
	 }
	
	@Override
	// oppervlakte (grondvlak + mantel)
	public double area() {
		return 2 * super.area() + 2 * Math.PI * radius * height;
	}

	public double volume() {
		return super.area() * height;
	}

	@Override
	public String toString() {
		return super.toString() + "; Height = " + height;
	}
}
