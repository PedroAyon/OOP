package unidad3.figures.presentation.console;

import unidad3.figures.presentation.ViewController;

public class Application {
    ViewController viewModel = new ViewController(false);

    public void run() {
        do {
            viewModel.showMenu();
            viewModel.getShape().draw();
        } while (!viewModel.exit());
    }
}
