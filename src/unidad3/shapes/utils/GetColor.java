package unidad3.shapes.utils;

import unidad3.shapes.model.color.Color;

import java.util.Scanner;

public class GetColor {
    private final Scanner scanner = new Scanner(System.in);
    public Color get() {
        System.out.print("Colors (r, g, b): ");
        return new Color(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
}
