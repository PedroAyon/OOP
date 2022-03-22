package unidad3.shapes.presentation;

import unidad3.shapes.model.shapes.Shape;
import unidad3.shapes.model.shapes.ShapeFactory;
import unidad3.shapes.model.shapes.shape2d.Shape2D;
import unidad3.shapes.model.shapes.shape3d.Shape3D;
import unidad3.shapes.utils.GetColor;
import unidad3.shapes.utils.GetInt;

public class ViewController {
    private final GetInt getInt = new GetInt();
    private final GetColor getColor = new GetColor();
    private boolean exit;
    private Shape shape;
    boolean graphic;

    public ViewController(boolean graphic) {
        this.graphic = graphic;
    }

    public void showMenu() {
        if (shape == null) {
            newShape();
            return;
        }
        System.out.println();
        int menuOpt = getInt.get("""
                1 - Create new shape
                2 - Change Size
                3 - Change Color
                4 - Calculate
                5 - Exit
                """);
        switch (menuOpt) {
            case 1 -> newShape();
            case 2 -> shape.setSize(getInt);
            case 3 -> shape.setColor(getColor);
            case 4 -> calculateMenu();
            case 5 -> this.exit = true;
        }
    }

    private void calculateMenu() {
        if (shape instanceof Shape2D) calculateMenuForShape2D();
        else if (shape instanceof Shape3D)
            System.out.println(shape.getName() + " voluem: " + ((Shape3D) shape).calculateVolume());
        else System.out.println("Nothing to do.");
    }

    private void calculateMenuForShape2D() {
        int menuOpt;
        menuOpt = getInt.get("""
                1 - Calculate Perimeter
                2 - Calculate Area
                """);
        System.out.print(shape.getName());
        switch (menuOpt) {
            case 1 -> System.out.println(" perimeter: " + ((Shape2D) shape).calculatePerimeter());
            case 2 -> System.out.println(" area: " + ((Shape2D) shape).calculateArea());
        }
    }

    public Shape getShape() {
        return shape;
    }

    public void newShape() {
        this.shape = ShapeFactory.create(graphic, getInt, getColor);
    }

    public boolean exit() {
        return this.exit;
    }
}
