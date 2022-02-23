package unidad1.equation;

import java.text.DecimalFormat;
import java.text.MessageFormat;

/**
 * @author Pedro Ayon
 */
public class Equation {
    private static DecimalFormat formatter;
    int a, b, c, numberOfDecimals;

    public Equation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        formatter = new DecimalFormat("0.00");
        solve();
    }

    public Equation(int a, int b, int c, int numberOfDecimals) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.numberOfDecimals = numberOfDecimals;
        formatter = new DecimalFormat("0." + "0".repeat(numberOfDecimals));
        solve();
    }

    public void solve() {
        if (equationCanBeSolved()) solveEquation();
    }

    private boolean equationCanBeSolved() {
        if (this.a == 0)
            System.out.println("No hay solución");
        else if (Math.pow(this.b, 2) - 4 * this.a * this.c < 0)
            System.out.println("Números complejos");
        else return true;
        return false;
    }

    private void solveEquation() {
        double x1 = (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
        double x2 = (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
        printSolution(x1, x2);
    }

    private void printSolution(double x1, double x2) {
        System.out.println(MessageFormat.format(
                "Ecuacion resuelta!\nx1 = {0}\nx2 = {1}",
                formatter.format(x1), formatter.format(x2)
        ));
    }
}
