package a_10InterfacesComparableAndComparator.figures;

public class Circle implements GeometricFigure2D {

	private final int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	/**
	 *
	 * @return name of the 2D plane figure
	 */
	@Override
	public String getNameGeometricFigure2D() {
		return "Circle";
	}

	/**
	 *
	 * @return the area of the circle
	 */
	@Override
	public int getArea() {
		return (int) (Math.PI * (radius * radius));
	}

	/**
	 *
	 * @return the circumference of the circle
	 */
	@Override
	public int getPerimeter() {
		return (int) (2 * Math.PI * radius);
	}

	@Override
	public String toString() {
		return getNameGeometricFigure2D()+" |\tRadius: "+getRadius()+" |\tCircumference: "+getPerimeter()+" |\tArea: "+getArea();
	}
}

