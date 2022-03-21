package unidad3.figures.model.shapes.shape3d.sphere;

import unidad3.figures.model.shapes.shape3d.Shape3D;
import unidad3.figures.utils.GetColor;
import unidad3.figures.utils.GetInt;

public class Sphere extends Shape3D {
    int radius;

    public Sphere(GetInt getInt, GetColor getColor) {
        super("Sphere", getInt, getColor);
    }

    @Override
    public void setSize(GetInt getInt) {
        this.radius = getInt.get("Radius");
    }

    @Override
    public double calculateVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(this.radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                ", color=" + color +
                ", radius=" + radius +
                '}';
    }
}
