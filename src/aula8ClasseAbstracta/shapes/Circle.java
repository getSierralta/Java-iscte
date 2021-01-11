package aula8ClasseAbstracta.shapes;

public class Circle extends Shape {
    //c. Crie, como subclasse de Forma , uma classe de nome Círculo cujas instâncias
    //são caracterizadas pelo atributo raio do tipo float .
    //d. Implemente na classe Circulo os métodos herdados de Forma e outros que
    //ache necessários. Dica : poderá aceder ao valor de Pi fazendo Math.Pi.
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }
    public float getDiameter(){
        float diameter = 2 * radius;
        return diameter;
    }

    @Override
    public float getArea() {
        float area = (float) (Math.PI * (radius*radius));
        return area;
    }

    @Override
    public float getPerimeter() {
        float perimeter = (float) (Math.PI * getDiameter());
        return perimeter;
    }
}
