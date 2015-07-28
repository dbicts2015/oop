package pointinheritance;

public class Point {
	protected int x, y; // coördinaten

	public Point() {
		// hier gebeurt de impliciete oproep van de superclass-constructor
		setPoint(0, 0);
		System.out.println("Point constructor: " + this);
	}

	public Point(int xCoord, int yCoord) {
		// hier gebeurt de impliciete oproep van de superclass-constructor
		setPoint(xCoord, yCoord);
		System.out.println("Point constructor: " + this);
	}

	@Override
	protected void finalize() {
		System.out.println("Point finalizer: " + this);
	}

	public void setPoint(int xCoord, int yCoord) {
		x = xCoord;
		y = yCoord;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}
}