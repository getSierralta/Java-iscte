package a_10InterfacesComparableAndComparator.figures;

public class Cylinder implements GeometricFigure3D {
	private final int height;
	private final int radius;

	public Cylinder(int height, int radius) {
		this.height = height;
		this.radius = radius;
	}

	/**
	 *
	 * @return the radius of the base of the cylinder
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 *
	 * @return the name of the 3D plane figure
	 */
	@Override
	public String getNameGeometricFigure3D() {
		return "Cylinder";
	}

	/**
	 *
	 * @return the height of the cylinder
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 *
	 * @return the volume of the cylinder
	 */
	@Override
	public int getVolume() {
		Circle base = new Circle(radius);
		return base.getArea() * height;
	}

	/**
	 *
	 * @return the information of the cylinder
	 */
	@Override
	public String toString() {
		return getNameGeometricFigure3D()+" |\tHeight: "+getHeight()+" |\tRadius: "+getRadius()+" |\tVolume: "+ getVolume();
	}
}
