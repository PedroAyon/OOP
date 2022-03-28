package unidad3.shapes.model.shapes.shape2d;

import processing.core.PApplet;
import unidad3.shapes.model.shapes.Shape;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

public abstract class Shape2D extends Shape {
    public Shape2D(String name, GetInt getInt, GetColor getColor) {
        super(name, getInt, getColor);
    }

    @Override
    public void draw(PApplet graphics) {
        super.draw(graphics);
        graphics.fill(color.getR(), color.getG(), color.getB());
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
