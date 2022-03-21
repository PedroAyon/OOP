package unidad3.figures.model.shapes.shape2d.circle;

import processing.core.PApplet;
import processing.core.PConstants;
import unidad3.figures.utils.GetColor;
import unidad3.figures.utils.GetInt;

import static unidad3.figures.utils.Constants.graphicPaneHeight;
import static unidad3.figures.utils.Constants.graphicPaneWidth;

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
