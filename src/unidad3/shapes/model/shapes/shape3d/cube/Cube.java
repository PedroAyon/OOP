package unidad3.shapes.model.shapes.shape3d.cube;

import unidad3.shapes.model.shapes.shape3d.Shape3D;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

public class Cube extends Shape3D {
    int side;

    public Cube(GetInt getInt, GetColor getColor) {
        super("Cube", getInt, getColor);
    }

    @Override
    public void setSize(GetInt getInt) {
        this.side = getInt.get("Side");
    }

    @Override
    public double calculateVolume() {
        return Math.pow(this.side, 3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "strokeWeight=" + strokeWeight +
                ", color=" + color +
                ", side=" + side +
                '}';
    }
}
