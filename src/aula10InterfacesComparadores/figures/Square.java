package aula10InterfacesComparadores.figures;

public class Square implements GeometricFigure2D {
	private final int side;

	public Square(int side) {
		this.side = side;
	}

	/**
	 *
	 * @return the length of the sides
	 */
	public int getSide() {
		return side;
	}

	/**
	 *
	 * @return the name of the 2D figure
	 */
	@Override
	public String getNameGeometricFigure2D() {
		return "Square";
	}

	/**
	 *
	 * @return the area of the squared
	 */
	@Override
	public int getArea() {
		return side * side;
	}

	/**
	 *
	 * @return the perimeter of the square
	 */
	@Override
	public int getPerimeter() {
		return side *4;
	}

	/**
	 *
	 * @return the information of the square
	 */
	@Override
	public String toString() {
		return getNameGeometricFigure2D()+" |\tSide length: "+getSide()+" |\tArea: "+getArea()+" |\tPerimeter: "+getPerimeter();
	}
}
