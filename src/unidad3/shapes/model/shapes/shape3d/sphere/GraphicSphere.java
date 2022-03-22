package unidad3.shapes.model.shapes.shape3d.sphere;

import processing.core.PApplet;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

public class GraphicSphere extends Sphere {
    public GraphicSphere(GetInt getInt, GetColor getColor) {
        super(getInt, getColor);
    }

    @Override
    public void draw(PApplet graphics) {
        super.draw(graphics);
        graphics.fill(color.getR(), color.getG(), color.getB());
        graphics.lights();
        graphics.noStroke();
        graphics.sphere(this.radius);
    }
}
