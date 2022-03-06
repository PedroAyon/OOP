package unidad1.operations;

import java.util.Scanner;

/**
 * @author Pedro Ayon
 */
public class Operation {
    static Scanner scanner = new Scanner(System.in);
    static float a, b;

    public static void main(String[] args) {
        int option;
        while (true){
            option = getMenuOption();
            if (option <= 0 || option > 4) break;
                readAttributes();
            switch (option) {
                case 1:
                    printResult(addition());
                    break;
                case 2:
                    printResult(subtraction());
                    break;
                case 3:
                    printResult(multiplication());
                    break;
                case 4:
                    try {
                        printResult(division());
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }

    private static int getMenuOption() {
        System.out.print("""
                Choose an option:
                1.- Addition
                2.- Subtraction
                3.- Multiplication
                4.- Division
                0.- Exit
                ->\s""");
        return scanner.nextInt();
    }

    private static void readAttributes() {
        System.out.print("First value: ");
        a = scanner.nextInt();
        System.out.print("Second value: ");
        b = scanner.nextInt();
    }

    private static void printResult(float result) {
        System.out.println("Result: " + result + "\n");
    }

    private static float addition() {
        return a + b;
    }

    private static float subtraction() {
        return a - b;
    }

    private static float multiplication() {
        return a * b;
    }

    private static float division() throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
        return a / b;
    }
}
