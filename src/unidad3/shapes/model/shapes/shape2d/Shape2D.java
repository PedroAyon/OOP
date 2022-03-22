package unidad3.shapes.model.shapes.shape2d;

import processing.core.PApplet;
import unidad3.shapes.model.shapes.Shape;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

public class Shape2D extends Shape {
    public Shape2D(String name, GetInt getInt, GetColor getColor) {
        super(name, getInt, getColor);
    }

    @Override
    public void draw(PApplet graphics) {
        super.draw(graphics);
        graphics.fill(color.getR(), color.getG(), color.getB());
    }

    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }
}
