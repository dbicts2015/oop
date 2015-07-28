package point;

public class Circle extends Point {

	private int radius;

	public Circle() {
		
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public double getOppervlakte() {
		return radius * radius * Math.PI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [x=" + getX() + ", y=" + getY() + ", radius=" + radius + ", oppervlakte=" + getOppervlakte() + "]";
	}

}