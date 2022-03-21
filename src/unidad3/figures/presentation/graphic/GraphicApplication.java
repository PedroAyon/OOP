package unidad3.figures.presentation.graphic;

import processing.core.PApplet;
import unidad3.figures.presentation.ViewController;

import static unidad3.figures.utils.Constants.*;

public class GraphicApplication extends PApplet {
    ViewController viewModel = new ViewController(true);

    public void run() {
        PApplet.main(GraphicApplication.class);
    }

    public void settings() {
        size(graphicPaneWidth, graphicPaneHeight, P3D);
    }

    public void draw() {
        viewModel.showMenu();
        clearPane();
        if (viewModel.exit()) exit();
        viewModel.getShape().draw(this);
    }

    private void clearPane() {
        background(graphicPaneBackground.getR(), graphicPaneBackground.getG(), graphicPaneBackground.getB());
    }
}
