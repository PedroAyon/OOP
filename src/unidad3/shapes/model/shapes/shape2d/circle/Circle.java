package unidad3.shapes.model.shapes.shape2d.circle;

import unidad3.shapes.model.shapes.shape2d.Shape2D;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

public class Circle extends Shape2D {
    int radius;

    public Circle(GetInt getInt, GetColor getColor) {
        super("Circle", getInt, getColor);
    }

    @Override
    public void setSize(GetInt getInt) {
        this.radius = getInt.get("Radius");
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * this.radius * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "strokeWeight=" + strokeWeight +
                ", color=" + color +
                ", radius=" + radius +
                '}';
    }
}
