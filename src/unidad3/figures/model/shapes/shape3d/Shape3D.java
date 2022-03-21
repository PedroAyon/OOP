package unidad3.figures.model.shapes.shape3d;

import processing.core.PApplet;
import processing.core.PConstants;
import unidad3.figures.model.shapes.Shape;
import unidad3.figures.utils.GetColor;
import unidad3.figures.utils.GetInt;

import static unidad3.figures.utils.Constants.graphicPaneHeight;
import static unidad3.figures.utils.Constants.graphicPaneWidth;

public class Shape3D extends Shape {
    public Shape3D(String name, GetInt getInt, GetColor getColor) {
        super(name, getInt, getColor);
    }

    public double calculateVolume() {
        return 0;
    }

    @Override
    public void draw(PApplet graphics) {
        super.draw(graphics);
        graphics.hint(PConstants.ENABLE_DEPTH_SORT);
        graphics.translate(graphicPaneWidth / 2F, graphicPaneHeight / 2F, 0);
        graphics.rotateX(PConstants.PI / 2);
        graphics.rotateZ(-PConstants.PI / 6);
    }
}
