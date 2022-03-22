package unidad3.shapes.presentation.graphic;

import processing.core.PApplet;
import unidad3.shapes.presentation.ViewController;

import static unidad3.shapes.utils.Constants.*;

public class GraphicApplication extends PApplet {
    ViewController viewController = new ViewController(true);

    public void run() {
        PApplet.main(GraphicApplication.class);
    }

    public void settings() {
        size(graphicPaneWidth, graphicPaneHeight, P3D);
    }

    public void draw() {
        viewController.showMenu();
        clearPane();
        if (viewController.exit()) exit();
        viewController.getShape().draw(this);
    }

    private void clearPane() {
        background(graphicPaneBackground.getR(), graphicPaneBackground.getG(), graphicPaneBackground.getB());
    }
}
