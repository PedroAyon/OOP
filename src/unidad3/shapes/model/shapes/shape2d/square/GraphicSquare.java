package unidad3.shapes.model.shapes.shape2d.square;

import processing.core.PApplet;
import processing.core.PConstants;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

import static unidad3.shapes.utils.Constants.graphicPaneHeight;
import static unidad3.shapes.utils.Constants.graphicPaneWidth;

public class GraphicSquare extends Square {

    public GraphicSquare(GetInt getInt, GetColor getColor) {
        super(getInt, getColor);
    }

    @Override
    public void draw(PApplet graphics) {
        super.draw(graphics);
        graphics.rectMode(PConstants.CENTER);
        graphics.square(
                graphicPaneWidth / 2F,
                graphicPaneHeight / 2F,
                this.side
        );
    }
}
