package unidad3.figures.model.shapes.shape2d;

import unidad3.figures.model.shapes.shape2d.circle.Circle;
import unidad3.figures.model.shapes.shape2d.circle.GraphicCircle;
import unidad3.figures.model.shapes.shape2d.square.GraphicSquare;
import unidad3.figures.model.shapes.shape2d.square.Square;
import unidad3.figures.model.shapes.shape2d.triangle.GraphicTriangle;
import unidad3.figures.model.shapes.shape2d.triangle.Triangle;
import unidad3.figures.utils.GetColor;
import unidad3.figures.utils.GetInt;

public class Shape2DFactory {
    public static Shape2D create(boolean graphic, GetInt getInt, GetColor getColor) {
        int type = getInt.get("""
                1 - Circle
                2 - Square
                3 - Triangle
                """);
        if (graphic) {
            return switch (type) {
                case 1 -> new GraphicCircle(getInt, getColor);
                case 2 -> new GraphicSquare(getInt, getColor);
                case 3 -> new GraphicTriangle(getInt, getColor);
                default -> new Shape2D("Nothing", getInt, getColor);
            };
        } else {
            return switch (type) {
                case 1 -> new Circle(getInt, getColor);
                case 2 -> new Square(getInt, getColor);
                case 3 -> new Triangle(getInt, getColor);
                default -> new Shape2D("Nothing", getInt, getColor);
            };
        }
    }
}
