package unidad3.shapes.presentation.console;

import unidad3.shapes.presentation.ViewController;

public class Application {
    ViewController viewModel = new ViewController(false);

    public void run() {
        do {
            viewModel.showMenu();
            viewModel.getShape().draw();
        } while (!viewModel.exit());
    }
}
