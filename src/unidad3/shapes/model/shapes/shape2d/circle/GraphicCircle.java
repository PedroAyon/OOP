package unidad3.shapes.model.shapes.shape2d.circle;

import processing.core.PApplet;
import processing.core.PConstants;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

import static unidad3.shapes.utils.Constants.graphicPaneHeight;
import static unidad3.shapes.utils.Constants.graphicPaneWidth;

public class GraphicCircle extends Circle {

    public GraphicCircle(GetInt getInt, GetColor getColor) {
        super(getInt, getColor);
    }

    @Override
    public void draw(PApplet graphics) {
        super.draw(graphics);
        graphics.ellipseMode(PConstants.CENTER);
        graphics.ellipse(
                graphicPaneWidth / 2F,
                graphicPaneHeight / 2F,
                this.radius * 2, this.radius * 2
        );
    }
}
