package A_10InterfacesComparableAndComparator.figures;



public class Rectangle implements GeometricFigure2D, GeometricFigure3D {
	int height;
	int length;
	int width;

	public Rectangle(int height, int length) {
		this.height = height;
		this.length = length;
	}

	public Rectangle(int height, int length, int width) {
		this.height = height;
		this.length = length;
		this.width = width;
	}

	/**
	 *
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 *
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 *
	 * @return the name of the 2D plane figure
	 */
	@Override
	public String getNameGeometricFigure2D() {
		return "Rectangle";
	}

	/**
	 *
	 * @return the area of a 2D figure
	 */
	@Override
	public int getArea() {
		return height * length;
	}

	/**
	 *
	 * @return the perimeter of a 2D figure
	 */
	@Override
	public int getPerimeter() {
		return (height *2)+(length *2);
	}

	/**
	 *
	 * @return the name of the 3D plane figure
	 */
	@Override
	public String getNameGeometricFigure3D() {
		return "Rectangular Prism";
	}

	/**
	 *
	 * @return the height
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 *
	 * @return the volume of the 3D figure
	 */
	@Override
	public int getVolume() {
		return length * width * height;
	}

	/**
	 *
	 * @return the information of the 2D figure
	 */
	public String planeFigure() {
		return getNameGeometricFigure2D()+" |\tHeight: "+getHeight()+" |\tLength: "+getLength()+" |\tArea: "+getArea()+" |\tPerimeter: "+getPerimeter();
	}

	/**
	 *
	 * @return the information of the 2D figure
	 */
	public String tridimensionalFigure() {
		return getNameGeometricFigure3D()+" |\tHeight: "+getHeight()+" |\tLength: "+getLength()+" |\tWidth: "+getWidth()+" |\tVolume: "+getVolume();
	}
}
