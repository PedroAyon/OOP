package unidad3.shapes.model.shapes.shape2d.square;

import unidad3.shapes.model.shapes.shape2d.Shape2D;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

public class Square extends Shape2D {
    int side;

    public Square(GetInt getInt, GetColor getColor) {
        super("Square", getInt, getColor);
    }

    @Override
    public void setSize(GetInt getInt) {
        this.side = getInt.get("Side");
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return this.side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "strokeWeight=" + strokeWeight +
                ", color=" + color +
                ", side=" + side +
                '}';
    }
}
