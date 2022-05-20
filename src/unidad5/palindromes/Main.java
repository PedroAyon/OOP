package unidad5.palindromes;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Verificador de palindromos");
        System.out.print("Escribe una frase: ");
        String str = new Scanner(System.in).nextLine();
        try {
            palindromo(str);
            System.out.println("La frase es un palindromo");
        } catch (NotPalindromeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void palindromo(String str) throws NotPalindromeException {
        str = str.replaceAll(" ", "");
        str = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length() / 2; i++)
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                throw new NotPalindromeException("La frase no es un palindromo");
    }
}
