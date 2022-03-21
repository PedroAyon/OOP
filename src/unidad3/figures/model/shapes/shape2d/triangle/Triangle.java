package unidad3.figures.model.shapes.shape2d.triangle;

import unidad3.figures.model.shapes.shape2d.Shape2D;
import unidad3.figures.utils.GetColor;
import unidad3.figures.utils.GetInt;

public class Triangle extends Shape2D {
    int base;
    int height;

    public Triangle(GetInt getInt, GetColor getColor) {
        super("Triangle", getInt, getColor);
    }

    @Override
    public void setSize(GetInt getInt) {
        this.base = getInt.get("Base");
        this.height = getInt.get("Height");
    }

    @Override
    public double calculateArea() {
        return this.base * this.height / 2F;
    }

    @Override
    public double calculatePerimeter() {
        return this.base + 2 * (Math.sqrt(Math.pow(this.base / 2F, 2) + Math.pow(this.height, 2)));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "strokeWeight=" + strokeWeight +
                ", color=" + color +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}
