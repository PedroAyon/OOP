package unidad3.shapes.model.shapes.shape3d.pyramid;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PVector;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

public class GraphicPyramid extends Pyramid {
    public GraphicPyramid(GetInt getInt, GetColor getColor) {
        super(getInt, getColor);
    }

    @Override
    public void draw(PApplet graphics) {
        super.draw(graphics);
        graphics.fill(color.getR(), color.getG(), color.getB(), 50);
        PVector[] basePoints = new PVector[this.sides];
        for (int i = 0; i < this.sides; ++i) {
            float ang = PConstants.TWO_PI * i / this.sides;
            basePoints[i] = new PVector(PApplet.cos(ang) * this.diameter / 2F, PApplet.sin(ang) * this.diameter / 2F, -this.height / 2F);
        }

        graphics.beginShape(graphics.TRIANGLES);
        for (int i = 0; i < this.sides; ++i) {
            int i2 = (i + 1) % this.sides;
            graphics.vertex(basePoints[i].x, basePoints[i].y, basePoints[i].z);
            graphics.vertex(basePoints[i2].x, basePoints[i2].y, basePoints[i2].z);
            graphics.vertex(0, 0, this.height / 2F);
        }
        graphics.endShape();

        graphics.beginShape();
        for (int i = 0; i < this.sides; ++i ) {
            graphics.vertex(basePoints[i].x, basePoints[i].y, basePoints[i].z);
        }
        graphics.endShape(PConstants.CLOSE);
    }
}
