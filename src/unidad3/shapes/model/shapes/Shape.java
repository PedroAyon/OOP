package unidad3.shapes.model.shapes;

import processing.core.PApplet;
import unidad3.shapes.model.color.Color;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

public abstract class Shape {
    String name;
    public int strokeWeight;
    public Color color;

    public Shape(String name, GetInt getInt, GetColor getColor) {
        this.name = name;
        this.strokeWeight = getInt.get("Stroke Weight");
        this.color = getColor.get();
        setSize(getInt);
    }

    public abstract void setSize(GetInt getInt);

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(GetColor getColor) {
        this.color = getColor.get();
    }

    public void setStrokeWeight(int strokeWeight) {
        this.strokeWeight = strokeWeight;
    }

    public int getStrokeWeight() {
        return strokeWeight;
    }

    public void draw() {
        System.out.println(this);
    }

    public void draw(PApplet graphics) {
        graphics.stroke(255);
        graphics.strokeWeight(this.strokeWeight);
    }
}
