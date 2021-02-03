package a_6Objects;

public class Rectangle {

    private final double base;
    private final double height;
    private final double area;
    private final double perimeter;
    private final double diagonal;

    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
        this.area = getArea();
        this.perimeter = getPerimeter();
        this.diagonal = getDiagonal();

    }
    public Rectangle(double base){
        this.base= base;
        this.height = base;
        this.area = getArea();
        this.perimeter = getPerimeter();
        this.diagonal = getDiagonal();
    }

    public double getBase(){
        return base;
    }

    /**
     *
     * @return area of a rectangle
     */
    public double getArea(){
        return this.base * this.height;
    }

    /**
     *
     * @return Perimeter of a rectangle
     */
    public double getPerimeter(){
        return this.base*2 + this.height*2;
    }

    /**
     *
     * @return the diagonal inside a rectangle
     */
    public  double getDiagonal(){
        return Math.sqrt(this.base* this.base + this.height* this.height);
    }


    @Override
    public String toString(){
        String fields = "Base: "+base+"\n";
        fields = fields + "Height: "+height+"\n";
        fields = fields + "Area: "+area+"\n";
        fields = fields + "Perimeter: "+perimeter+"\n";
        fields = fields + "Diagonal: "+diagonal+"\n";
        return fields;
    }
    public static void main(String[] args) {


        System.out.println(" ");
        Rectangle square = new Rectangle(4);
        System.out.println(square.toString());
        Rectangle rectangle = new Rectangle(5,12);
        System.out.println(rectangle.toString());
    }
}
