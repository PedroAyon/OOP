package unidad1.shapes;

/**
 * @author pedro
 * @created 09/02/2022
 * @project POO
 */
public class Circle implements Shape {

    float radius;
    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double perimeter() {
        return Math.PI * this.radius * 2;
    }
}
