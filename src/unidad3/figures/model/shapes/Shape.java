package unidad3.figures.model.shapes;

import processing.core.PApplet;
import unidad3.figures.model.color.Color;
import unidad3.figures.utils.GetColor;
import unidad3.figures.utils.GetInt;

public class Shape {
    String name;
    public int strokeWeight;
    public Color color;

    public Shape(String name, GetInt getInt, GetColor getColor) {
        this.name = name;
        this.strokeWeight = getInt.get("Stroke Weight");
        this.color = getColor.get();
        setSize(getInt);
    }

    public String getName() {
        return this.name;
    }

    public void draw() {
        System.out.println(this);
    }

    public void draw(PApplet graphics) {
        graphics.stroke(255);
        graphics.strokeWeight(this.strokeWeight);
    }

    public void setSize(GetInt getInt) {
    }

    public void setColor(GetColor getColor) {
        this.color = getColor.get();
    }
}
