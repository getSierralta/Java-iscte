package aula8ClasseAbstracta.shapes;

public class Rectagle2 extends Shape{
    //a. Crie, como subclasse de Forma, uma classe de nome Rectangulo cujas
    //instâncias são caracterizadas pelos atributos lado e altura ambos do tipo float .
    //b. Implemente na classe Rectangulo os métodos herdados de Forma e outros que
    //ache necessários.
    private float height;
    private float width;

    public Rectagle2(float height, float width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public float getArea() {
        return height*width;
    }

    @Override
    public float getPerimeter() {
        float perimeter = (height * 2) + (width * 2);
        return perimeter;
    }
}
