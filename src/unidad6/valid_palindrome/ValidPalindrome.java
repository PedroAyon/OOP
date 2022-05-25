package unidad6.valid_palindrome;

import java.io.*;
import java.util.ArrayList;

public class ValidPalindrome {
    private static final String inputFilePath = System.getenv("HOME") + "/Dev/school/OOP/src/unidad6/in_out_files/valid_palindrome.in";
    private static final String outputFilePath = System.getenv("HOME") + "/Dev/school/OOP/src/unidad6/in_out_files/valid_palindrome.out";

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter(outputFilePath);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            ArrayList<String> phrases = readInput();
            for (String s : phrases) {
                try {
                    checkValidPalindrome(s);
                    printWriter.write('"' + s.toUpperCase() + '"' + " is a valid palindrome.\n");
                } catch (NotPalindromeException e) {
                    printWriter.write('"' + s.toUpperCase() + '"' + " isn't a valid palindrome.\n");
                }
            }
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("IO error: " + e);
        }
    }

    private static ArrayList<String> readInput() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFilePath));
        ArrayList<String> arrayList = new ArrayList<>();
        String line = bufferedReader.readLine();
        while (line != null) {
            arrayList.add(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return arrayList;
    }

    private static void checkValidPalindrome(String s) throws NotPalindromeException {
        s = s.trim();
        if (s.isEmpty()) throw new NotPalindromeException();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !isLetterOrDigit(s.charAt(l)))
                l++;
            while (l < r && !isLetterOrDigit(s.charAt(r)))
                r--;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                throw new NotPalindromeException();
            l++;
            r--;
        }
    }

    private static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }

}
