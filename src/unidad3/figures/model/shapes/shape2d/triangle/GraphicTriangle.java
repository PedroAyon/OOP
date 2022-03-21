package unidad3.figures.model.shapes.shape2d.triangle;

import processing.core.PApplet;
import unidad3.figures.model.color.Color;
import unidad3.figures.utils.GetColor;
import unidad3.figures.utils.GetInt;

import static unidad3.figures.utils.Constants.graphicPaneHeight;
import static unidad3.figures.utils.Constants.graphicPaneWidth;

public class GraphicTriangle extends Triangle {
    public GraphicTriangle( GetInt getInt, GetColor getColor) {
        super(getInt, getColor);
    }

    @Override
    public void draw(PApplet graphics) {
        super.draw(graphics);
        if (this.height > graphicPaneHeight || this.base > graphicPaneWidth) return;
        int xLeft = (graphicPaneWidth - this.base) / 2;
        int xRight = graphicPaneWidth - xLeft;
        int yTop = (graphicPaneHeight - this.height) / 2;
        int yBottom = graphicPaneHeight - yTop;
        graphics.triangle(xLeft, yBottom, (float) graphicPaneWidth / 2, yTop, xRight, yBottom);
    }
}
