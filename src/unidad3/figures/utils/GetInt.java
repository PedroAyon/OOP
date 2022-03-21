package unidad3.figures.utils;

import java.util.Scanner;

public class GetInt {
    private final Scanner scanner = new Scanner(System.in);

    public Integer get(String prop) {
        System.out.print(prop + ": ");
        return scanner.nextInt();
    }
}
