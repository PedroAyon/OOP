package unidad3.figures.model.shapes.shape3d.cube;

import processing.core.PApplet;
import unidad3.figures.utils.GetColor;
import unidad3.figures.utils.GetInt;

public class GraphicCube extends Cube {

    public GraphicCube(GetInt getInt, GetColor getColor) {
        super(getInt, getColor);
    }

    @Override
    public void draw(PApplet graphics) {
        super.draw(graphics);
        graphics.fill(color.getR(), color.getG(), color.getB(), 50);
        graphics.box(this.side);
    }
}
