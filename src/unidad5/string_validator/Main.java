package unidad5.string_validator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        try {
            validate(text);
            System.out.println("Ok!");
        } catch (DigitException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validate(String str) throws DigitException {
        if (str.matches(".*\\d.*"))
            throw new DigitException("Text must not have digits");
    }
}
