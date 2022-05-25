package unidad6.phrase;

import java.io.*;
import java.util.Arrays;

public class Main {
    private static final String inputFilePath = System.getenv("HOME") + "/Dev/school/OOP/src/unidad6/in_out_files/phrase.in";
    private static final String outputFilePath = System.getenv("HOME") + "/Dev/school/OOP/src/unidad6/in_out_files/phrase.out";

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter(outputFilePath);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            String[] words = readInput().split(" ");
            printWriter.println(Arrays.toString(words));
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("IO error: " + e);
        }
    }

    private static String readInput() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFilePath));
        return bufferedReader.readLine();
    }
}
