package unidad3.figures.model.shapes.shape3d.pyramid;

import unidad3.figures.model.shapes.shape3d.Shape3D;
import unidad3.figures.utils.GetColor;
import unidad3.figures.utils.GetInt;

public class Pyramid extends Shape3D {
    int sides;
    int diameter;
    int height;

    public Pyramid(GetInt getInt, GetColor getColor) {
        super("Pyramid", getInt, getColor);
    }

    @Override
    public void setSize(GetInt getInt) {
        this.sides = getInt.get("Sides");
        this.diameter = getInt.get("Diameter");
        this.height = getInt.get("Height");
    }

    @Override
    public double calculateVolume() {
        double sideLenght = 2 * Math.atan(360 / 2F * this.sides);
        return this.sides / 12F * this.height * Math.pow(sideLenght, 2) * 1F / Math.tan(Math.PI / this.sides);
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "strokeWeight=" + strokeWeight +
                ", color=" + color +
                ", sides=" + sides +
                ", diameter=" + diameter +
                ", height=" + height +
                '}';
    }
}
