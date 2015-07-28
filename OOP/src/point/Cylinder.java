package point;

public class Cylinder extends Circle {

	private int z;

	public Cylinder(int x, int y, int z, int radius) {
		super(x, y, radius);
		this.z = z;
	}

	@Override
	public double getOppervlakte() {
		return 2 * super.getOppervlakte() + (2 * Math.PI * getRadius())* z;
	}

	public double getInhoud() {
		return super.getOppervlakte() * z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Cylinder [x=" + getX() + ", y=" + getY() + ", z=" + z + ", radius=" + getRadius() + ", oppervlakte=" + getOppervlakte()
				+ ", inhoud=" + getInhoud() + "]";
	}

}