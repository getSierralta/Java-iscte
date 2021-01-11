package aula10InterfacesComparadores.figures;


public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println("\n"+circle);
        Cylinder cylinder = new Cylinder(5,7);
        System.out.println("\n"+cylinder);
        Rectangle rectangle = new Rectangle(9,8);
        System.out.println("\n"+rectangle.planeFigure());
        Rectangle rectangularPrism = new Rectangle(9,8,6);
        System.out.println("\n"+rectangularPrism.tridimensionalFigure());
        Square square = new Square(4);
        System.out.println("\n"+square);
    }
}
