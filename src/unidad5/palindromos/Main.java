package unidad5.palindromos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Verificador de palindromos");
        System.out.print("Escribe una frase: ");
        String str = new Scanner(System.in).nextLine();
        try {
            palindromo(str);
            System.out.println("La frase es un palindromo");
        } catch (NoPalindromoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void palindromo(String str) throws NoPalindromoException {
        str = str.replaceAll(" ", "");
        for (int izq = 0, der = str.length() - 1; izq + 1 <= der; izq++, der--)
            if (str.charAt(izq) != str.charAt(der))
                throw new NoPalindromoException("La frase no es un palindromo");
    }
}
